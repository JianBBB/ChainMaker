package kr.happyjob.chainmaker.scm.model;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WHInventoryFormModel {
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
	public int getPro_ware_qty() {
		return pro_ware_qty;
	}
	public void setPro_ware_qty(int pro_ware_qty) {
		this.pro_ware_qty = pro_ware_qty;
	}
	public Date getPro_io_date() {
		return pro_io_date;
	}
	public void setPro_io_date(Date pro_io_date) {
		this.pro_io_date = pro_io_date;
	}
	public int getPro_io_qty() {
		return pro_io_qty;
	}
	public void setPro_io_qty(int pro_io_qty) {
		this.pro_io_qty = pro_io_qty;
	}
	public String getPro_io_memo() {
		return pro_io_memo;
	}
	public void setPro_io_memo(String pro_io_memo) {
		this.pro_io_memo = pro_io_memo;
	}
	public String getPro_io_cd() {
		return pro_io_cd;
	}
	public void setPro_io_cd(String pro_io_cd) {
		this.pro_io_cd = pro_io_cd;
	}
	public String getPro_io_cd_name() {
		return pro_io_cd_name;
	}
	public void setPro_io_cd_name(String pro_io_cd_name) {
		this.pro_io_cd_name = pro_io_cd_name;
	}
	public int getPro_ware_in_qty() {
		return pro_ware_in_qty;
	}
	public void setPro_ware_in_qty(int pro_ware_in_qty) {
		this.pro_ware_in_qty = pro_ware_in_qty;
	}
	public int getPro_ware_out_qty() {
		return pro_ware_out_qty;
	}
	public void setPro_ware_out_qty(int pro_ware_out_qty) {
		this.pro_ware_out_qty = pro_ware_out_qty;
	}
	private String pro_no;
	private String pro_name;
	private int ware_no;
	private String ware_name;
	private String ware_address;
	private String ware_dt_address;
	private int pro_ware_qty;
	private Date pro_io_date;
	private int pro_io_qty;
	private String pro_io_memo;
	private String pro_io_cd;
	private String pro_io_cd_name;
	private int pro_ware_in_qty;
	private int pro_ware_out_qty;
}
