package kr.happyjob.chainmaker.scm.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode(of="ware_no")
public class WHInfoByProNoVO {

	public int getWare_no() {
		return ware_no;
	}
	public void setWare_no(int ware_no) {
		this.ware_no = ware_no;
	}
	public String getPro_no() {
		return pro_no;
	}
	public void setPro_no(String pro_no) {
		this.pro_no = pro_no;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPro_name() {
		return pro_name;
	}
	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}
	private int ware_no;
	private String pro_no;
	private int pro_ware_qty;
	private String ware_name;
	private String name;
	private String pro_name;
	
}
