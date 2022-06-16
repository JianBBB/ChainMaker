package kr.happyjob.chainmaker.epc.model;

import java.sql.Date;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode(of= {"order_no"})
public class OrderListWithQtyAndDateVO {
	
	public int getOrder_no() {
		return order_no;
	}
	public void setOrder_no(int order_no) {
		this.order_no = order_no;
	}
	public int getOrder_total_qty() {
		return order_total_qty;
	}
	public void setOrder_total_qty(int order_total_qty) {
		this.order_total_qty = order_total_qty;
	}
	public long getAmount_payment() {
		return amount_payment;
	}
	public void setAmount_payment(long amount_payment) {
		this.amount_payment = amount_payment;
	}
	public Date getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	public Date getOrder_mod_date() {
		return order_mod_date;
	}
	public void setOrder_mod_date(Date order_mod_date) {
		this.order_mod_date = order_mod_date;
	}
	public Date getOrder_expdate() {
		return order_expdate;
	}
	public void setOrder_expdate(Date order_expdate) {
		this.order_expdate = order_expdate;
	}
	public String getPro_name() {
		return pro_name;
	}
	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}
	public String getOrder_cd() {
		return order_cd;
	}
	public void setOrder_cd(String order_cd) {
		this.order_cd = order_cd;
	}
	public String getShip_cd() {
		return ship_cd;
	}
	public void setShip_cd(String ship_cd) {
		this.ship_cd = ship_cd;
	}
	private int order_no;
	private int order_total_qty;
	private long amount_payment;
	private Date order_date;
	private Date order_mod_date;
	private Date order_expdate;
	private String pro_name;

	private String order_cd;
	private String ship_cd;
}
