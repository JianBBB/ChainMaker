package kr.happyjob.chainmaker.scm.model;

import java.sql.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class PurchaseAndShippingInfoDTO {
	public int getPurchase_no() {
		return purchase_no;
	}
	public void setPurchase_no(int purchase_no) {
		this.purchase_no = purchase_no;
	}
	public int getPurchase_qty() {
		return purchase_qty;
	}
	public void setPurchase_qty(int purchase_qty) {
		this.purchase_qty = purchase_qty;
	}
	public int getPurchase_cd() {
		return purchase_cd;
	}
	public void setPurchase_cd(int purchase_cd) {
		this.purchase_cd = purchase_cd;
	}
	public Date getPurchase_date() {
		return purchase_date;
	}
	public void setPurchase_date(Date purchase_date) {
		this.purchase_date = purchase_date;
	}
	public String getPro_no() {
		return pro_no;
	}
	public void setPro_no(String pro_no) {
		this.pro_no = pro_no;
	}
	public String getLoginID() {
		return loginID;
	}
	public void setLoginID(String loginID) {
		this.loginID = loginID;
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
	public int getShip_qty() {
		return ship_qty;
	}
	public void setShip_qty(int ship_qty) {
		this.ship_qty = ship_qty;
	}
	public String getDeli_master_name() {
		return deli_master_name;
	}
	public void setDeli_master_name(String deli_master_name) {
		this.deli_master_name = deli_master_name;
	}
	public String getWriter_id() {
		return writer_id;
	}
	public void setWriter_id(String writer_id) {
		this.writer_id = writer_id;
	}
	private int purchase_no;
	private int purchase_qty;
	private int purchase_cd;
	private Date purchase_date;
	private String pro_no;
	private String loginID;
	private int ware_no;
	
	private int ship_no;
	private int order_no;
	private int ship_qty;
	private String deli_master_name;
	private String writer_id;
}
