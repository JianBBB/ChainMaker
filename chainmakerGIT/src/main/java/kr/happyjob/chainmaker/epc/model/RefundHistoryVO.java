package kr.happyjob.chainmaker.epc.model;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor //파라미터가 없는 생성자를 자동으로 생성해준다.
public class RefundHistoryVO {
	
	public int getRefund_no() {
		return refund_no;
	}
	public void setRefund_no(int refund_no) {
		this.refund_no = refund_no;
	}
	public int getOrder_no() {
		return order_no;
	}
	public void setOrder_no(int order_no) {
		this.order_no = order_no;
	}
	public String getPro_no() {
		return pro_no;
	}
	public void setPro_no(String pro_no) {
		this.pro_no = pro_no;
	}
	public String getPro_name() {
		return pro_name;
	}
	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}
	public int getRefund_qty() {
		return refund_qty;
	}
	public void setRefund_qty(int refund_qty) {
		this.refund_qty = refund_qty;
	}
	public int getPro_price() {
		return pro_price;
	}
	public void setPro_price(int pro_price) {
		this.pro_price = pro_price;
	}
	public Date getRefund_date() {
		return refund_date;
	}
	public void setRefund_date(Date refund_date) {
		this.refund_date = refund_date;
	}
	public String getRefund_note() {
		return refund_note;
	}
	public void setRefund_note(String refund_note) {
		this.refund_note = refund_note;
	}
	public String getRefund_confirm_cd() {
		return refund_confirm_cd;
	}
	public void setRefund_confirm_cd(String refund_confirm_cd) {
		this.refund_confirm_cd = refund_confirm_cd;
	}
	public String getLoginID() {
		return loginID;
	}
	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	private int refund_no;   			//반품 번호
	private int order_no;    			//주문 번호
	private String pro_no;	    		//제품 번호
	private String pro_name;			//제품 이름
	private int refund_qty;  			//반품 수량
	private int pro_price;				//물품 금액
	private Date refund_date; 			//반품 일자
	private String refund_note; 		//반품 사유
	private String refund_confirm_cd;	//반품 확인 코드
	private String loginID;				//아이디
	private int count;					//반품 목록 카운트
	
	private int currentPage;
	private int pageSize;
	private int pageIndex;
}
