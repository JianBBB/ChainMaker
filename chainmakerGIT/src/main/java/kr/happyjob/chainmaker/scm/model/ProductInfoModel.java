package kr.happyjob.chainmaker.scm.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProductInfoModel {
	
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
	public String getDeli_no() {
		return deli_no;
	}
	public void setDeli_no(String deli_no) {
		this.deli_no = deli_no;
	}
	public int getPro_deli_price() {
		return pro_deli_price;
	}
	public void setPro_deli_price(int pro_deli_price) {
		this.pro_deli_price = pro_deli_price;
	}
	public String getPro_model_name() {
		return pro_model_name;
	}
	public void setPro_model_name(String pro_model_name) {
		this.pro_model_name = pro_model_name;
	}
	public String getPro_manu_name() {
		return pro_manu_name;
	}
	public void setPro_manu_name(String pro_manu_name) {
		this.pro_manu_name = pro_manu_name;
	}
	public int getPro_price() {
		return pro_price;
	}
	public void setPro_price(int pro_price) {
		this.pro_price = pro_price;
	}
	public String getPro_detail() {
		return pro_detail;
	}
	public void setPro_detail(String pro_detail) {
		this.pro_detail = pro_detail;
	}
	public String getPro_cd() {
		return pro_cd;
	}
	public void setPro_cd(String pro_cd) {
		this.pro_cd = pro_cd;
	}
	public String getWare_no() {
		return ware_no;
	}
	public void setWare_no(String ware_no) {
		this.ware_no = ware_no;
	}
	public String getFile_server_path() {
		return file_server_path;
	}
	public void setFile_server_path(String file_server_path) {
		this.file_server_path = file_server_path;
	}
	public String getFile_ofname() {
		return file_ofname;
	}
	public void setFile_ofname(String file_ofname) {
		this.file_ofname = file_ofname;
	}
	private String pro_no;
	private String pro_name;
	private String deli_company;
	private String deli_no;
	private int pro_deli_price;
	private String pro_model_name;
	private String pro_manu_name;
	private int pro_price;
	private String pro_detail;
	private String pro_cd;
	private String ware_no;
	private String file_server_path;
	private String file_ofname;



}
