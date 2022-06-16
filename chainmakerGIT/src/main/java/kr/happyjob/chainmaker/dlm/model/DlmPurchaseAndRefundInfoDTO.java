package kr.happyjob.chainmaker.dlm.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor

public class DlmPurchaseAndRefundInfoDTO {
  
  public int getRefund_no() {
		return refund_no;
	}
	public void setRefund_no(int refund_no) {
		this.refund_no = refund_no;
	}
	public int getPurchase_no() {
		return purchase_no;
	}
	public void setPurchase_no(int purchase_no) {
		this.purchase_no = purchase_no;
	}
	public int getWare_no() {
		return ware_no;
	}
	public void setWare_no(int ware_no) {
		this.ware_no = ware_no;
	}
	public int getPro_io_qty() {
		return pro_io_qty;
	}
	public void setPro_io_qty(int pro_io_qty) {
		this.pro_io_qty = pro_io_qty;
	}
	public String getPro_no() {
		return pro_no;
	}
	public void setPro_no(String pro_no) {
		this.pro_no = pro_no;
	}
	public String getRefund_note() {
		return refund_note;
	}
	public void setRefund_note(String refund_note) {
		this.refund_note = refund_note;
	}
	public String getLoginID() {
		return loginID;
	}
	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}
private int refund_no;
  private int purchase_no;
  private int ware_no;
  private int pro_io_qty;
  private String pro_no;
  private String refund_note;
  private String loginID;

}
