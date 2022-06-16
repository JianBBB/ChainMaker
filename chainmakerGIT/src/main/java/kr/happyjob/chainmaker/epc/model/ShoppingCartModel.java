package kr.happyjob.chainmaker.epc.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ShoppingCartModel {
	
	public String getFile_server_path() {
		return file_server_path;
	}
	public void setFile_server_path(String file_server_path) {
		this.file_server_path = file_server_path;
	}
	public int getBas_qty() {
		return bas_qty;
	}
	public void setBas_qty(int bas_qty) {
		this.bas_qty = bas_qty;
	}
	public String getBas_date() {
		return bas_date;
	}
	public void setBas_date(String bas_date) {
		this.bas_date = bas_date;
	}
	public String getPro_name() {
		return pro_name;
	}
	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}
	public String getPro_price() {
		return pro_price;
	}
	public void setPro_price(String pro_price) {
		this.pro_price = pro_price;
	}
	public String getBas_no() {
		return bas_no;
	}
	public void setBas_no(String bas_no) {
		this.bas_no = bas_no;
	}
	public String getOrder_expdate() {
		return order_expdate;
	}
	public void setOrder_expdate(String order_expdate) {
		this.order_expdate = order_expdate;
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
	public String getPro_no() {
		return pro_no;
	}
	public void setPro_no(String pro_no) {
		this.pro_no = pro_no;
	}
	private String file_server_path;
	private int bas_qty;
	private String bas_date;
	private String pro_name;
	private String pro_price;
	private String bas_no;
	private String order_expdate;
	private String order_cd;
	private String deposit_cd;
	private String pro_no;
}
