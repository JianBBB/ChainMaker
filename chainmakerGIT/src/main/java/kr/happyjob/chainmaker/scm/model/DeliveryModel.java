package kr.happyjob.chainmaker.scm.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DeliveryModel {
	
	public int getDeli_no() {
		return deli_no;
	}
	public void setDeli_no(int deli_no) {
		this.deli_no = deli_no;
	}
	public String getDeli_company() {
		return deli_company;
	}
	public void setDeli_company(String deli_company) {
		this.deli_company = deli_company;
	}
	public String getDeli_id() {
		return deli_id;
	}
	public void setDeli_id(String deli_id) {
		this.deli_id = deli_id;
	}
	public String getDeli_password() {
		return deli_password;
	}
	public void setDeli_password(String deli_password) {
		this.deli_password = deli_password;
	}
	public String getDeli_name() {
		return deli_name;
	}
	public void setDeli_name(String deli_name) {
		this.deli_name = deli_name;
	}
	public String getDeli_phone() {
		return deli_phone;
	}
	public void setDeli_phone(String deli_phone) {
		this.deli_phone = deli_phone;
	}
	public String getDeli_cd() {
		return deli_cd;
	}
	public void setDeli_cd(String deli_cd) {
		this.deli_cd = deli_cd;
	}
	private int deli_no;
	private String deli_company;
	private String deli_id;
	private String deli_password;
	private String deli_name;
	private String deli_phone;
	private String deli_cd;

}
