package kr.happyjob.chainmaker.scm.model;

import java.sql.Date;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode(of= {"order_no", "pro_name"})
public class ShippingOrderVO {

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
	public Date getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	public String getUser_company() {
		return user_company;
	}
	public void setUser_company(String user_company) {
		this.user_company = user_company;
	}
	public int getShip_total_qty() {
		return ship_total_qty;
	}
	public void setShip_total_qty(int ship_total_qty) {
		this.ship_total_qty = ship_total_qty;
	}
	public Date getOrder_expdate() {
		return order_expdate;
	}
	public void setOrder_expdate(Date order_expdate) {
		this.order_expdate = order_expdate;
	}
	public String getShip_cd() {
		return ship_cd;
	}
	public void setShip_cd(String ship_cd) {
		this.ship_cd = ship_cd;
	}
	private int order_no;
	private String pro_name;
	private Date order_date;
	private String user_company;
	private int ship_total_qty;
	private Date order_expdate;
	private String ship_cd;
	
}
