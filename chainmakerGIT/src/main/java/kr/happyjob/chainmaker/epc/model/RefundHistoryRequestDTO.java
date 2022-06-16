package kr.happyjob.chainmaker.epc.model;

import java.util.Date;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
/*@EqualsAndHashCode(of = {"refund_no", "pro_no"}) //sql처럼 PK값을 지정해주는 것 */
public class RefundHistoryRequestDTO {
	
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

	public String getPro_name() {
		return pro_name;
	}

	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}

	public Date getRefund_date() {
		return refund_date;
	}

	public void setRefund_date(Date refund_date) {
		this.refund_date = refund_date;
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
	private String pro_name;			//제품 명
	private Date refund_date; 			//반품 일자
	private String refund_confirm_cd;	//반품 확인 코드
	private String loginID;				//아이디
	private int count;					//카운트 값
	
	private int currentPage;
	private int pageSize;
	private int pageIndex;
	
	/*VO 타입으로 들어온  값을 DTO로 변환*/
	public RefundHistoryRequestDTO (RefundHistoryVO vo){
		this.refund_no = vo.getRefund_no();
		this.order_no = vo.getOrder_no();
		this.pro_name = vo.getPro_name();
		this.refund_date = vo.getRefund_date();
		this.refund_confirm_cd = vo.getRefund_confirm_cd();
		this.loginID = vo.getLoginID();
		this.count = vo.getCount();
		
		this.currentPage = vo.getCurrentPage();
		this.pageIndex = vo.getPageIndex();
		this.pageSize = vo.getPageSize();
	}
}
