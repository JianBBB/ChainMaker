package kr.happyjob.chainmaker.scm.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.happyjob.chainmaker.scm.model.DailyOrderListDTO;
import kr.happyjob.chainmaker.scm.model.DailyOrderListVO;
import kr.happyjob.chainmaker.scm.model.OrderDetailByOrderNoAndProNoDTO;
import kr.happyjob.chainmaker.scm.model.OrdersRequestDTO;
import kr.happyjob.chainmaker.scm.model.ProductDetailDTO;
import kr.happyjob.chainmaker.scm.model.PurchaseAndShippingInfoDTO;
import kr.happyjob.chainmaker.scm.model.PurchaseInfoDTO;
import kr.happyjob.chainmaker.scm.model.ResponseDTO;
import kr.happyjob.chainmaker.scm.model.ShippingDirectionDTO;
import kr.happyjob.chainmaker.scm.model.ShippingDirectionListDTO;
import kr.happyjob.chainmaker.scm.model.WHInfoByProNoDTO;
import kr.happyjob.chainmaker.scm.service.DailyOrderHistoryService;
import kr.happyjob.chainmaker.scm.service.DailyOrderHistroyServiceImpl;
import kr.happyjob.chainmaker.system.model.ComnDtlCodModel;
import kr.happyjob.chainmaker.system.model.ComnGrpCodModel;

@Controller
@RequestMapping("/scm/dailyOrderHistory.do")
public class DailyOrderHistoryController {
	
	private final Logger logger = LogManager.getLogger(this.getClass());

	@Resource(name="DailyOrderHistoryServiceImpl")
	private DailyOrderHistoryService dailyOrderHistoryService;
	
	// ?????? ?????? ?????? ?????? URL
	@RequestMapping("")
	public String getDailyOrderHistroyPage() {
		String viewLocation = "/scm/dailyOrderHistory";
		return viewLocation;
	}
	
	/**
	 * ?????? ?????? ?????? ????????? ?????? 
	 */
	@GetMapping
	@RequestMapping("/orders/{listInfo}")
	public String getListDailyOrderHistoryOrDetail (@PathVariable(value = "listInfo") String listInfo
			, Model model, @ModelAttribute OrdersRequestDTO ordersRequestDTO) throws Exception {

		
		int currentPage = ordersRequestDTO.getCurrentPage();
		int pageSize = ordersRequestDTO.getPageSize();
		int pageIndex = (currentPage-1)*pageSize;	// ????????? ?????? row ??????

		ordersRequestDTO.setPageIndex(pageIndex);
		
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("currentPageComnGrpCod",currentPage);
		
		String viewLocation = "";
		
		
		// pathValue listInfo ?????? ??????, ?????? ????????? ?????? ?????? or ?????? ????????? ?????? ?????? ????????? ????????? ?????? 
		Map<String, Object> resultMap = new HashMap<>();
		
		switch(listInfo){
			case "dailyOrder" : {
				//resultMap??? ????????? ?????? ????????? ????????????.
				resultMap = getListDailyOrder(ordersRequestDTO);
				
				// resultMap??? key?????? set??? ????????????.
				Set<String> keySet = resultMap.keySet();
				Iterator<String> keyIterator = keySet.iterator();
				
				// model??? key??? value??? ???????????? ?????? ????????????.
				while(keyIterator.hasNext()) {
					String key = keyIterator.next();
					Object value = resultMap.get(key);
					model.addAttribute(key, value);
				}
				
				viewLocation = "/scm/dailyOrderList";
				
				break;
			}
			
			case "detailOrder" : {
				
				int order_no = ordersRequestDTO.getOrder_no();
				String pro_no = ordersRequestDTO.getPro_no();
				resultMap = getOrderDetailByOrderNoAndProNo(order_no, pro_no);
				
				viewLocation = "/scm/";
				break;
			}
			
			case "nonDeposit" : {
				resultMap = getListNonDepositDailyOrder(ordersRequestDTO);
				// resultMap??? key?????? set??? ????????????.
				
				Set<String> keySet = resultMap.keySet();
				Iterator<String> keyIterator = keySet.iterator();
				
				// model??? key??? value??? ???????????? ?????? ????????????.
				while(keyIterator.hasNext()) {
					String key = keyIterator.next();
					Object value = resultMap.get(key);
					model.addAttribute(key, value);
				}
				
				viewLocation = "/scm/dailyOrderList";
				
				break;
			}
			
			case "dateOrder" : {
				
				ordersRequestDTO.setOrder_cd("order");
				
				resultMap = getOrderListSearchByDateAndOrderCD(ordersRequestDTO);
				// resultMap??? key?????? set??? ????????????.
				
				Set<String> keySet = resultMap.keySet();
				Iterator<String> keyIterator = keySet.iterator();
				
				// model??? key??? value??? ???????????? ?????? ????????????.
				while(keyIterator.hasNext()) {
					String key = keyIterator.next();
					Object value = resultMap.get(key);
					model.addAttribute(key, value);
				}
				
				viewLocation = "/scm/dailyOrderList";
				
				break;
			}
			
			case "dateNonDeposit" : {
				
				ordersRequestDTO.setOrder_cd("nonDeposit");
				
				resultMap = getOrderListSearchByDateAndOrderCD(ordersRequestDTO);
				// resultMap??? key?????? set??? ????????????.
				
				Set<String> keySet = resultMap.keySet();
				Iterator<String> keyIterator = keySet.iterator();
				
				// model??? key??? value??? ???????????? ?????? ????????????.
				while(keyIterator.hasNext()) {
					String key = keyIterator.next();
					Object value = resultMap.get(key);
					model.addAttribute(key, value);
				}
				
				viewLocation = "/scm/dailyOrderList";
				
				break;
			}
			
			
		}

		return viewLocation;
	}
	
	/**
	 *  ?????? ??????, ?????? ????????? ?????? ?????? ??????
	 */
	@RequestMapping(value ="/order/{order_no}/product/{pro_no}", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getOrderDetail(@PathVariable(value="order_no") int order_no, @PathVariable(value="pro_no") String pro_no) throws Exception {

		Map<String, Object> resultMap = new HashMap<String, Object>();

		resultMap = getOrderDetailByOrderNoAndProNo(order_no, pro_no);
		
		return resultMap;
	}
	
	/**
	 *  ?????? ????????? ?????? ?????? ??????
	 */
	@RequestMapping(value ="/product/{pro_no}", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getProductDetail(@PathVariable(value="pro_no") String pro_no, HttpSession session) throws Exception {

		Map<String, Object> resultMap = new HashMap<String, Object>();

		resultMap = getProductDetailByProNo(pro_no, session);
		
		return resultMap;
	}
	
	// ?????? ?????? ?????? ?????? ????????? ?????? method
	public Map<String, Object> getProductDetailByProNo(String pro_no, HttpSession session) {
		
		Map<String, Object> resultMap = new HashMap<>();
		
		List<ProductDetailDTO> productDetail = dailyOrderHistoryService.getProductDetailByProNo(pro_no);
		
		String login_id = (String)session.getAttribute("loginId");
		
		// ?????? 1?????? login_id ????????????
		productDetail.get(0).setLogin_id(login_id);
		
		resultMap.put("productDetail", productDetail);
		
		return resultMap;
	}
	
	// pro_no??? warehouseinfo ??????
	@RequestMapping(value = "warehouse/{pro_no}", method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getWarehouseInfoByProNo(@PathVariable(value="pro_no") String pro_no) throws Exception {
		
		Map<String, Object> resultMap = new HashMap<>();
		
		List<WHInfoByProNoDTO> whInfoByProNoList = dailyOrderHistoryService.selectWHInfoByProNo(pro_no);
		
		resultMap.put("whInfoList",whInfoByProNoList);
		
		return resultMap;
	}
	
	// ?????? ?????? ????????? ?????? method
	public Map<String, Object> getListDailyOrder(OrdersRequestDTO ordersRequestDTO) {
		
		Map<String, Object> resultMap = new HashMap<>();
		
		// ?????? ??????
		ordersRequestDTO.setOrder_cd("order");
		
		// ?????? ?????? ?????? ??????
		List<DailyOrderListDTO> listDailyOrder = dailyOrderHistoryService.getDailyOrderListByOrderCD(ordersRequestDTO);
		resultMap.put("listDailyOrder", listDailyOrder);
		
		// ?????? ?????? ?????? ????????? ??????
		int totalCount = dailyOrderHistoryService.countDailyOrderListByOrderCD(ordersRequestDTO);
		resultMap.put("totalCntDailyOrder", totalCount);
		
		return resultMap;
	}
	
	// ?????? ?????? ????????? ??? ?????? ????????? ??????
	public Map<String, Object> getListNonDepositDailyOrder(OrdersRequestDTO ordersRequestDTO) {
		
		Map<String, Object> resultMap = new HashMap<>();

		// ?????? ??????
		ordersRequestDTO.setOrder_cd("nonDeposit");
		
		// ?????? ?????? ?????? ??????
		List<DailyOrderListDTO> refundDailyOrderList = dailyOrderHistoryService.getDailyOrderListByOrderCD(ordersRequestDTO);
		resultMap.put("listDailyOrder", refundDailyOrderList);
		
		// ?????? ?????? ?????? ????????? ??????
		int totalCount = dailyOrderHistoryService.countDailyOrderListByOrderCD(ordersRequestDTO);
		resultMap.put("totalCntDailyOrder", totalCount);
		
		return resultMap;
	}
	
	public Map<String, Object> getOrderListSearchByDateAndOrderCD(OrdersRequestDTO ordersRequestDTO) {
		Map<String, Object> resultMap = new HashMap<>();
		
		
		// ?????? ?????? ?????? ??????
		List<DailyOrderListDTO> dailyOrderListByDateAndOrderCD = dailyOrderHistoryService.getDailyOrderListByDateAndOrderCD(ordersRequestDTO);
		resultMap.put("listDailyOrder", dailyOrderListByDateAndOrderCD);
		
		// ?????? ?????? ?????? ????????? ??????
		int totalCount = dailyOrderHistoryService.countDailyOrderListByDateAndOrderCD(ordersRequestDTO);
		resultMap.put("totalCntDailyOrder", totalCount);
		
		return resultMap;
	}
	
	
	
	
	// ?????? ?????? ?????? ?????? ????????? ?????? method
	public Map<String, Object> getOrderDetailByOrderNoAndProNo(int order_no, String pro_no) {
		
		Map<String, Object> resultMap = new HashMap<>();
		
		OrdersRequestDTO ordersRequestDTO = new OrdersRequestDTO();
		
		ordersRequestDTO.setOrder_no(order_no);
		ordersRequestDTO.setPro_no(pro_no);
		
		OrderDetailByOrderNoAndProNoDTO orderDetail = dailyOrderHistoryService.selectOrderDetailByOrderNoAndProNo(ordersRequestDTO);
		
		resultMap.put("orderDetail", orderDetail);
		
		return resultMap;
	}
	
	@RequestMapping(value = "/direction/{type}", method = RequestMethod.POST)
	@ResponseBody
	public ResponseDTO postDirection(@PathVariable(value="type") String type, @RequestBody List<PurchaseAndShippingInfoDTO> purchaseAndShippingInfoDTOList,
			HttpSession session) {
		
		ResponseDTO responseDTO = new ResponseDTO();
		
		logger.info("direction type : "+type);
		
		switch(type) {
		
			case "shipping" : {
				
				String writerID = (String) session.getAttribute("loginId");
				
				int shipNo = dailyOrderHistoryService.createShippingInfoReturnShipNo(purchaseAndShippingInfoDTOList, writerID);
				
				logger.info("?????? shipNo : " + shipNo);
				
				responseDTO.setResult("SUCCESS");
				responseDTO.setMsg("?????? ????????? ????????? ?????? ???????????????.");
				
				if(shipNo == -1) {
					responseDTO.setResult("FAIL");
					responseDTO.setMsg("?????? ????????? ????????? ?????? ???????????????.");
				}
				break;
			}
			
			case "purchase" : {
				
				int purchaseNo = dailyOrderHistoryService.createPurchaseInfoReturnPurchaseNo(purchaseAndShippingInfoDTOList);
				
				logger.info("?????? purchaseNo : " + purchaseNo);
				
				responseDTO.setResult("SUCCESS");
				responseDTO.setMsg("?????? ????????? ????????? ?????? ???????????????.");
				
				if(purchaseNo == -1) {
					responseDTO.setResult("FAIL");
					responseDTO.setMsg("?????? ????????? ????????? ?????? ???????????????.");
				}
				break;
			}
			
		}
		
		return responseDTO;
	}
	
	
}
