package kr.happyjob.chainmaker.epc.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RefundInfoDTO {

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
	public int getRefund_qty() {
		return refund_qty;
	}
	public void setRefund_qty(int refund_qty) {
		this.refund_qty = refund_qty;
	}
	public String getRefund_note() {
		return refund_note;
	}
	public void setRefund_note(String refund_note) {
		this.refund_note = refund_note;
	}
	private int refund_no;
	private int order_no;
	private String pro_no;
	private int refund_qty;
	private String refund_note;
}
