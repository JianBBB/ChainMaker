package kr.happyjob.chainmaker.dashboard.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode(of= {"pro_no"})
public class SlideProductInfoVO {

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
	public int getPro_price() {
		return pro_price;
	}
	public void setPro_price(int pro_price) {
		this.pro_price = pro_price;
	}
	public String getPro_cd() {
		return pro_cd;
	}
	public void setPro_cd(String pro_cd) {
		this.pro_cd = pro_cd;
	}
	public String getPro_detail() {
		return pro_detail;
	}
	public void setPro_detail(String pro_detail) {
		this.pro_detail = pro_detail;
	}
	public String getFile_server_path() {
		return file_server_path;
	}
	public void setFile_server_path(String file_server_path) {
		this.file_server_path = file_server_path;
	}
	private String pro_no;
	private String pro_name;
	private int pro_price;
	private String pro_cd;
	private String pro_detail;
	private String file_server_path;
	
}
