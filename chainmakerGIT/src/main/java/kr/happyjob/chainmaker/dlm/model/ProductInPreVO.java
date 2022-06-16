package kr.happyjob.chainmaker.dlm.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode(of= {"ware_no", "pro_no", "refund_no"})
public class ProductInPreVO {
	
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
	public int getRefund_no() {
		return refund_no;
	}
	public void setRefund_no(int refund_no) {
		this.refund_no = refund_no;
	}
	private int ware_no;
	private int pro_io_qty;
	private String pro_no;
	private int refund_no;
	
}
