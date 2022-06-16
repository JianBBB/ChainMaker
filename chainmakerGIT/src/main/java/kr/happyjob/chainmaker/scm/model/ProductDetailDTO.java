package kr.happyjob.chainmaker.scm.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ProductDetailDTO {

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


	public int getPro_ware_qty() {
		return pro_ware_qty;
	}


	public void setPro_ware_qty(int pro_ware_qty) {
		this.pro_ware_qty = pro_ware_qty;
	}


	public String getWare_name() {
		return ware_name;
	}


	public void setWare_name(String ware_name) {
		this.ware_name = ware_name;
	}


	public String getLogin_id() {
		return login_id;
	}


	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}


	private String pro_no;
	private String pro_name;
	private String deli_company;
	private int ware_no;
	private int pro_ware_qty;
	private String ware_name;
	
	private String login_id;
	
	
	public ProductDetailDTO(ProductDetailVO productDetailVO) {
		this.pro_no = productDetailVO.getPro_no();
		this.pro_name = productDetailVO.getPro_name();
		this.deli_company = productDetailVO.getDeli_company();
		this.ware_no = productDetailVO.getWare_no();
		this.pro_ware_qty = productDetailVO.getPro_ware_qty();
		this.ware_name = productDetailVO.getWare_name();
	}
}
