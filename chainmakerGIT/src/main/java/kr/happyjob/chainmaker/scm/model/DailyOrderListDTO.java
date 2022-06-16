package kr.happyjob.chainmaker.scm.model;


import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DailyOrderListDTO {
	
	public int getRow_num() {
		return row_num;
	}

	public void setRow_num(int row_num) {
		this.row_num = row_num;
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

	public int getOrder_qty() {
		return order_qty;
	}

	public void setOrder_qty(int order_qty) {
		this.order_qty = order_qty;
	}

	public String getOrder_cd() {
		return order_cd;
	}

	public void setOrder_cd(String order_cd) {
		this.order_cd = order_cd;
	}

	public String getDeposit_cd() {
		return deposit_cd;
	}

	public void setDeposit_cd(String deposit_cd) {
		this.deposit_cd = deposit_cd;
	}

	public Timestamp getOrder_date() {
		return order_date;
	}

	public void setOrder_date(Timestamp order_date) {
		this.order_date = order_date;
	}

	public Timestamp getOrder_expdate() {
		return order_expdate;
	}

	public void setOrder_expdate(Timestamp order_expdate) {
		this.order_expdate = order_expdate;
	}

	public Timestamp getOrder_mod_date() {
		return order_mod_date;
	}

	public void setOrder_mod_date(Timestamp order_mod_date) {
		this.order_mod_date = order_mod_date;
	}

	public String getLoginID() {
		return loginID;
	}

	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}

	public String getUser_company() {
		return user_company;
	}

	public void setUser_company(String user_company) {
		this.user_company = user_company;
	}

	public int getPro_ware_qty() {
		return pro_ware_qty;
	}

	public void setPro_ware_qty(int pro_ware_qty) {
		this.pro_ware_qty = pro_ware_qty;
	}

	public int getPro_deli_price() {
		return pro_deli_price;
	}

	public void setPro_deli_price(int pro_deli_price) {
		this.pro_deli_price = pro_deli_price;
	}

	public int getPro_price() {
		return pro_price;
	}

	public void setPro_price(int pro_price) {
		this.pro_price = pro_price;
	}

	private int row_num;
	private int order_no;
	private String pro_no;
	private String pro_name;
	private int order_qty;
	private String order_cd;
	private String deposit_cd;
	
	private Timestamp order_date;
	private Timestamp order_expdate;
	private Timestamp order_mod_date;
	
	private String loginID;
	private String user_company;
	private int pro_ware_qty;
	private int pro_deli_price;
	private int pro_price;
	
	public DailyOrderListDTO(DailyOrderListVO dailyOrderListVO) {
		
		this.row_num = dailyOrderListVO.getRow_num();
		this.order_no = dailyOrderListVO.getOrder_no();
		this.pro_no = dailyOrderListVO.getPro_no();
		this.pro_name = dailyOrderListVO.getPro_name();
		this.order_qty = dailyOrderListVO.getOrder_qty();
		this.order_cd = dailyOrderListVO.getOrder_cd();
		this.deposit_cd = dailyOrderListVO.getDeposit_cd();
		this.order_date = dailyOrderListVO.getOrder_date();
		this.order_expdate = dailyOrderListVO.getOrder_expdate();
		this.order_mod_date = dailyOrderListVO.getOrder_mod_date();
		this.loginID = dailyOrderListVO.getLoginID();
		this.user_company = dailyOrderListVO.getUser_company();
		this.pro_ware_qty = dailyOrderListVO.getPro_ware_qty();
		this.pro_deli_price = dailyOrderListVO.getPro_deli_price();
		this.pro_price = dailyOrderListVO.getPro_price();
	}
	
}
