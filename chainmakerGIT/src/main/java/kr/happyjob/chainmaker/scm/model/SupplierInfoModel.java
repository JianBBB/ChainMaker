package kr.happyjob.chainmaker.scm.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class SupplierInfoModel {
	//mapper에서 리턴받을 컬럼의 명칭과 동일해야한다.
	private int deli_no; //납품 업체 번호
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
	public String getDeli_email() {
		return deli_email;
	}
	public void setDeli_email(String deli_email) {
		this.deli_email = deli_email;
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
	public String getPro_deli_price() {
		return pro_deli_price;
	}
	public void setPro_deli_price(String pro_deli_price) {
		this.pro_deli_price = pro_deli_price;
	}
	private String deli_company; // 납품 업체명
	private String deli_id; //  납품 업체 로그인 id
	private String deli_password; // 납품 업체 로그인 패스워드
	private String deli_name; // 납품 업체 담당자명
	private String deli_phone; // 납품 업체 전화번호
	//private int del_cd; // 삭제 코드
	private String deli_email; //납품 업체 이메일
	
	private String pro_no; // 제품 번호
	private String pro_name; // 제품 이름
	private String pro_deli_price; // 제품 단가
	
	

}
