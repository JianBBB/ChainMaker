package kr.happyjob.chainmaker.scm.model;

import java.sql.Date;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode(of= {"order_no", "pro_name"})
public class ShippingOrderDetailVO {

	public Date getOrder_date() {
		return order_date;
	}

	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
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

	public int getWare_no() {
		return ware_no;
	}

	public void setWare_no(int ware_no) {
		this.ware_no = ware_no;
	}

	public String getPro_name() {
		return pro_name;
	}

	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}

	public String getWare_name() {
		return ware_name;
	}

	public void setWare_name(String ware_name) {
		this.ware_name = ware_name;
	}

	public String getPro_no() {
		return pro_no;
	}

	public void setPro_no(String pro_no) {
		this.pro_no = pro_no;
	}

	public String getUser_company() {
		return user_company;
	}

	public void setUser_company(String user_company) {
		this.user_company = user_company;
	}

	public int getDeposit_cd() {
		return deposit_cd;
	}

	public void setDeposit_cd(int deposit_cd) {
		this.deposit_cd = deposit_cd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoginID() {
		return loginID;
	}

	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}

	private Date order_date;
	private int order_no;
	private int ship_qty;
	private int ware_no;
	private String pro_name;
	private String ware_name;
	private String pro_no;
	private String user_company;
	private int deposit_cd;
	private String name;
	
	private String loginID;
	
}
