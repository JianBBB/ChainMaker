package kr.happyjob.chainmaker.scm.model;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RefundInsVO {
	public Date getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	public Date getPurchase_date() {
		return purchase_date;
	}
	public void setPurchase_date(Date purchase_date) {
		this.purchase_date = purchase_date;
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
	public int getRefund_confirm_cd() {
		return refund_confirm_cd;
	}
	public void setRefund_confirm_cd(int refund_confirm_cd) {
		this.refund_confirm_cd = refund_confirm_cd;
	}
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
	public int getPurchase_no() {
		return purchase_no;
	}
	public void setPurchase_no(int purchase_no) {
		this.purchase_no = purchase_no;
	}
	public int getPurchase_cd() {
		return purchase_cd;
	}
	public void setPurchase_cd(int purchase_cd) {
		this.purchase_cd = purchase_cd;
	}
	private Date order_date;
	private Date purchase_date;
	private String pro_name;
	private int refund_qty;
	private int pro_price;
	private int refund_confirm_cd;
	private int refund_no;
	private int order_no;
	private int purchase_no;
	private int purchase_cd;
	
	
	
}
