package kr.happyjob.chainmaker.scm.model;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PurchaseDirectionModel {
	
	public int getRow_num() {
		return row_num;
	}
	public void setRow_num(int row_num) {
		this.row_num = row_num;
	}
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
	public String getPurchase_cd() {
		return purchase_cd;
	}
	public void setPurchase_cd(String purchase_cd) {
		this.purchase_cd = purchase_cd;
	}
	public String getPurchase_cd_name() {
		return purchase_cd_name;
	}
	public void setPurchase_cd_name(String purchase_cd_name) {
		this.purchase_cd_name = purchase_cd_name;
	}
	public String getPro_cd_name() {
		return pro_cd_name;
	}
	public void setPro_cd_name(String pro_cd_name) {
		this.pro_cd_name = pro_cd_name;
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
	public String getPro_name() {
		return pro_name;
	}
	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}
	public String getDeli_company() {
		return deli_company;
	}
	public void setDeli_company(String deli_company) {
		this.deli_company = deli_company;
	}
	public int getWare_no() {
		return ware_no;
	}
	public void setWare_no(int ware_no) {
		this.ware_no = ware_no;
	}
	public String getWare_name() {
		return ware_name;
	}
	public void setWare_name(String ware_name) {
		this.ware_name = ware_name;
	}
	private int row_num;
	private int purchase_no;
	private int purchase_qty;
	private String purchase_cd;
    private String purchase_cd_name;
    private String pro_cd_name;
	private Date purchase_date;
    private String pro_no;
    private String pro_name;
    private String deli_company;
    private int ware_no;
    private String ware_name;

}
