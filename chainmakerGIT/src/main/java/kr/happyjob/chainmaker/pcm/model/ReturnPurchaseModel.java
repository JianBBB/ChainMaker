package kr.happyjob.chainmaker.pcm.model;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ReturnPurchaseModel {
	
	public int getRefund_no() {
		return refund_no;
	}
	public void setRefund_no(int refund_no) {
		this.refund_no = refund_no;
	}
	public int getRefund_qty() {
		return refund_qty;
	}
	public void setRefund_qty(int refund_qty) {
		this.refund_qty = refund_qty;
	}
	public String getRefund_cd() {
		return refund_cd;
	}
	public void setRefund_cd(String refund_cd) {
		this.refund_cd = refund_cd;
	}
	public Date getRefund_date() {
		return refund_date;
	}
	public void setRefund_date(Date refund_date) {
		this.refund_date = refund_date;
	}
	public String getDirection_cd() {
		return direction_cd;
	}
	public void setDirection_cd(String direction_cd) {
		this.direction_cd = direction_cd;
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
	public String getPro_cd() {
		return pro_cd;
	}
	public void setPro_cd(String pro_cd) {
		this.pro_cd = pro_cd;
	}
	public int getPro_deli_price() {
		return pro_deli_price;
	}
	public void setPro_deli_price(int pro_deli_price) {
		this.pro_deli_price = pro_deli_price;
	}
	public long getSum_price() {
		return sum_price;
	}
	public void setSum_price(long sum_price) {
		this.sum_price = sum_price;
	}
	public long getTotal_price() {
		return total_price;
	}
	public void setTotal_price(long total_price) {
		this.total_price = total_price;
	}
	public String getDeli_company() {
		return deli_company;
	}
	public void setDeli_company(String deli_company) {
		this.deli_company = deli_company;
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
	private int refund_no;
    private int refund_qty; 
    private String refund_cd;		//0 미지급, 1 지급
    private Date refund_date;
    private String direction_cd;	//purchase 발주, refund 반품, shipping 배송
    private String pro_no;
    private String pro_name;
    private String pro_cd;
    private int pro_deli_price;
    private long sum_price;
    private long total_price;
	private String deli_company;
	private String deli_name;
	private String deli_phone;
	private String deli_email;
	private int ware_no;
	private String ware_name;
	private String ware_address;
	private String ware_dt_address;	
}
