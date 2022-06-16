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
public class RefundHistoryDTO {
	
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

	public long getPro_price() {
		return pro_price;
	}

	public void setPro_price(long pro_price) {
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

	private int refund_no;   			//반품 번호
	private int order_no;    			//주문 번호
	private String pro_no;	    		//제품 번호
	private String pro_name;			//제품 명
	private int refund_qty;  			//반품 수량
	private long pro_price;				//물품 금액
	private Date refund_date; 			//반품 일자
	private String refund_note; 		//반품 사유
	private String refund_confirm_cd;	//반품 확인 코드
	private String loginID;				//아이디
	private int count;					//카운트 값
	
	/*VO 타입으로 들어온  값을 DTO로 변환*/
	public RefundHistoryDTO (RefundHistoryVO vo){
		this.refund_no = vo.getRefund_no();
		this.order_no = vo.getOrder_no();
		this.pro_no = vo.getPro_no();
		this.pro_name = vo.getPro_name();
		this.refund_qty = vo.getRefund_qty();
		this.pro_price = vo.getPro_price();
		this.refund_date = vo.getRefund_date();
		this.refund_note = vo.getRefund_note();
		this.refund_confirm_cd = vo.getRefund_confirm_cd();
		this.loginID = vo.getLoginID();
		this.count = vo.getCount();
	}
}
