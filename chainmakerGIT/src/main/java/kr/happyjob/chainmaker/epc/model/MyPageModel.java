package kr.happyjob.chainmaker.epc.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MyPageModel { 
	
	public String getLoginID() {
		return loginID;
	}
	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}
	public String getUser_type() {
		return user_type;
	}
	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender_cd() {
		return gender_cd;
	}
	public void setGender_cd(String gender_cd) {
		this.gender_cd = gender_cd;
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
	public String getUser_zipcode() {
		return user_zipcode;
	}
	public void setUser_zipcode(String user_zipcode) {
		this.user_zipcode = user_zipcode;
	}
	public String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	public String getUser_dt_address() {
		return user_dt_address;
	}
	public void setUser_dt_address(String user_dt_address) {
		this.user_dt_address = user_dt_address;
	}
	public String getBank_cd() {
		return bank_cd;
	}
	public void setBank_cd(String bank_cd) {
		this.bank_cd = bank_cd;
	}
	public String getDel_cd() {
		return del_cd;
	}
	public void setDel_cd(String del_cd) {
		this.del_cd = del_cd;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_company() {
		return user_company;
	}
	public void setUser_company(String user_company) {
		this.user_company = user_company;
	}
	public String getChaCD_name() {
		return chaCD_name;
	}
	public void setChaCD_name(String chaCD_name) {
		this.chaCD_name = chaCD_name;
	}
	public String getDivCD_name() {
		return divCD_name;
	}
	public void setDivCD_name(String divCD_name) {
		this.divCD_name = divCD_name;
	}
	public String getDelCD_name() {
		return delCD_name;
	}
	public void setDelCD_name(String delCD_name) {
		this.delCD_name = delCD_name;
	}
	public String getDiv_cd() {
		return div_cd;
	}
	public void setDiv_cd(String div_cd) {
		this.div_cd = div_cd;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUser_account() {
		return user_account;
	}
	public void setUser_account(String user_account) {
		this.user_account = user_account;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public String getApproval_cd() {
		return approval_cd;
	}
	public void setApproval_cd(String approval_cd) {
		this.approval_cd = approval_cd;
	}
	public String getWare_no() {
		return ware_no;
	}
	public void setWare_no(String ware_no) {
		this.ware_no = ware_no;
	}
	public String getWare_name() {
		return ware_name;
	}
	public void setWare_name(String ware_name) {
		this.ware_name = ware_name;
	}
	private String loginID;
	private String user_type;
	private String name;
	private String gender_cd;
	private String user_tel1;
	private String user_tel2;
	private String user_tel3;
	private String user_zipcode;
	private String user_address;
	private String user_dt_address;
	private String bank_cd;
	private String del_cd;
	private String user_email;
	private String user_company;
	private String chaCD_name;
	private String divCD_name;
	private String delCD_name;
	private String div_cd;
	private String password;
	private String user_account;
	private String bank_name;
	private String approval_cd;
	
	private String ware_no;
	private String ware_name;

}
