package kr.happyjob.chainmaker.scm.model;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RefundVO {
	private String user_company;
	public String getUser_company() {
		return user_company;
	}
	public void setUser_company(String user_company) {
		this.user_company = user_company;
	}
	public int getRow_num() {
		return row_num;
	}
	public void setRow_num(int row_num) {
		this.row_num = row_num;
	}
	public int getRefund_no() {
		return refund_no;
	}
	public void setRefund_no(int refund_no) {
		this.refund_no = refund_no;
	}
	public Date getRefund_date() {
		return refund_date;
	}
	public void setRefund_date(Date refund_date) {
		this.refund_date = refund_date;
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
	public long getOrder_qty() {
		return order_qty;
	}
	public void setOrder_qty(long order_qty) {
		this.order_qty = order_qty;
	}
	public long getRefund_qty() {
		return refund_qty;
	}
	public void setRefund_qty(long refund_qty) {
		this.refund_qty = refund_qty;
	}
	public long getTotal_price() {
		return total_price;
	}
	public void setTotal_price(long total_price) {
		this.total_price = total_price;
	}
	public String getOrder_no() {
		return order_no;
	}
	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}
	public String getRefund_note() {
		return refund_note;
	}
	public void setRefund_note(String refund_note) {
		this.refund_note = refund_note;
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
	public String getOrigin_ware_no() {
		return origin_ware_no;
	}
	public void setOrigin_ware_no(String origin_ware_no) {
		this.origin_ware_no = origin_ware_no;
	}
	private int row_num;
	private int refund_no;
	private Date refund_date;	
	private String pro_no;          
	private String pro_name;
	private long order_qty;
	private long refund_qty; 
	private long total_price;
	private String order_no;
	private String refund_note;
	private int ware_no;
	private String ware_name;  //창고 선택을 위해 추가함!! 
	private String origin_ware_no;
	
	

}
