package kr.happyjob.chainmaker.scm.model;



import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WarehouseVO{
	private int ware_no;
	public int getWare_no() {
		return ware_no;
	}
	public void setWare_no(int ware_no) {
		this.ware_no = ware_no;
	}
	public String getLoginID() {
		return loginID;
	}
	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}
	public String getWare_zipcode() {
		return ware_zipcode;
	}
	public void setWare_zipcode(String ware_zipcode) {
		this.ware_zipcode = ware_zipcode;
	}
	public String getWare_dt_address() {
		return ware_dt_address;
	}
	public void setWare_dt_address(String ware_dt_address) {
		this.ware_dt_address = ware_dt_address;
	}
	public String getWare_address() {
		return ware_address;
	}
	public void setWare_address(String ware_address) {
		this.ware_address = ware_address;
	}
	public String getWare_name() {
		return ware_name;
	}
	public void setWare_name(String ware_name) {
		this.ware_name = ware_name;
	}
	public String getWare_cd() {
		return ware_cd;
	}
	public void setWare_cd(String ware_cd) {
		this.ware_cd = ware_cd;
	}
	private String loginID;
	private String ware_zipcode;
	private String ware_dt_address;
	private String ware_address;
	private String ware_name;
	private String ware_cd;
	

}
