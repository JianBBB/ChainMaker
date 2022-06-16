package kr.happyjob.chainmaker.scm.model;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DirectionVO {
	public int getDirection_no() {
		return direction_no;
	}
	public void setDirection_no(int direction_no) {
		this.direction_no = direction_no;
	}
	public int getWare_no() {
		return ware_no;
	}
	public void setWare_no(int ware_no) {
		this.ware_no = ware_no;
	}
	public int getShip_no() {
		return ship_no;
	}
	public void setShip_no(int ship_no) {
		this.ship_no = ship_no;
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
	public int getRefund_no() {
		return refund_no;
	}
	public void setRefund_no(int refund_no) {
		this.refund_no = refund_no;
	}
	public String getPro_no() {
		return pro_no;
	}
	public void setPro_no(String pro_no) {
		this.pro_no = pro_no;
	}
	public String getDirection_cd() {
		return direction_cd;
	}
	public void setDirection_cd(String direction_cd) {
		this.direction_cd = direction_cd;
	}
	public String getDirection_note() {
		return direction_note;
	}
	public void setDirection_note(String direction_note) {
		this.direction_note = direction_note;
	}
	public int getDirection_out_qty() {
		return direction_out_qty;
	}
	public void setDirection_out_qty(int direction_out_qty) {
		this.direction_out_qty = direction_out_qty;
	}
	public int getDirection_in_qty() {
		return direction_in_qty;
	}
	public void setDirection_in_qty(int direction_in_qty) {
		this.direction_in_qty = direction_in_qty;
	}
	public String getDirection_manager() {
		return direction_manager;
	}
	public void setDirection_manager(String direction_manager) {
		this.direction_manager = direction_manager;
	}
	public Date getDirection_date() {
		return direction_date;
	}
	public void setDirection_date(Date direction_date) {
		this.direction_date = direction_date;
	}
	private int direction_no;
	private int ware_no;
	private int ship_no;
	private int order_no;
	private int purchase_no;
	private int refund_no;
	private String pro_no;
	private String direction_cd;
	private String direction_note;
	private int direction_out_qty;
	private int direction_in_qty;
	private String direction_manager;
	private Date direction_date;	
	
	
	
	
	
	
	

}
