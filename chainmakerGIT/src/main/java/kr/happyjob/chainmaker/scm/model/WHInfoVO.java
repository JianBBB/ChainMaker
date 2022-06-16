package kr.happyjob.chainmaker.scm.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode(of = {"ware_no", "loginID"})
public class WHInfoVO {
  
  public int getWare_no() {
		return ware_no;
	}

	public void setWare_no(int ware_no) {
		this.ware_no = ware_no;
	}

	public String getWare_cd() {
		return ware_cd;
	}

	public void setWare_cd(String ware_cd) {
		this.ware_cd = ware_cd;
	}

	public String getWare_name() {
		return ware_name;
	}

	public void setWare_name(String ware_name) {
		this.ware_name = ware_name;
	}

	public String getWare_address() {
		return ware_address;
	}

	public void setWare_address(String ware_address) {
		this.ware_address = ware_address;
	}

	public String getWare_dt_address() {
		return ware_dt_address;
	}

	public void setWare_dt_address(String ware_dt_address) {
		this.ware_dt_address = ware_dt_address;
	}

	public String getWare_zipcode() {
		return ware_zipcode;
	}

	public void setWare_zipcode(String ware_zipcode) {
		this.ware_zipcode = ware_zipcode;
	}

	public String getLoginID() {
		return loginID;
	}

	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUser_tel1() {
		return user_tel1;
	}

	public void setUser_tel1(String user_tel1) {
		this.user_tel1 = user_tel1;
	}

	public String getUser_tel2() {
		return user_tel2;
	}

	public void setUser_tel2(String user_tel2) {
		this.user_tel2 = user_tel2;
	}

	public String getUser_tel3() {
		return user_tel3;
	}

	public void setUser_tel3(String user_tel3) {
		this.user_tel3 = user_tel3;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getDetail_code() {
		return detail_code;
	}

	public void setDetail_code(String detail_code) {
		this.detail_code = detail_code;
	}

private int ware_no;
  private String ware_cd;
  private String ware_name;
  private String ware_address;
  private String ware_dt_address;
  private String ware_zipcode;
  
  private String loginID;
  private String name;
  private String user_tel1;
  private String user_tel2;
  private String user_tel3;
  private String user_email;
  
  private String detail_code;
  
  
  
}
