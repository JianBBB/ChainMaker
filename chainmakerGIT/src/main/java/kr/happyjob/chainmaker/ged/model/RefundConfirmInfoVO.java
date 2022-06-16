package kr.happyjob.chainmaker.ged.model;

import java.sql.Date;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
//@EqualsAndHashCode(of= {"refund_no"})  //이거하나만?? 팀장님께.. 
public class RefundConfirmInfoVO {
	
	public int getRefund_no() {
		return refund_no;
	}
	public void setRefund_no(int refund_no) {
		this.refund_no = refund_no;
	}
	public String getPro_no() {
		return pro_no;
	}
	public void setPro_no(String pro_no) {
		this.pro_no = pro_no;
	}
	public int getWare_no() {
		return ware_no;
	}
	public void setWare_no(int ware_no) {
		this.ware_no = ware_no;
	}
	public String getUser_company() {
		return user_company;
	}
	public void setUser_company(String user_company) {
		this.user_company = user_company;
	}
	public String getPro_name() {
		return pro_name;
	}
	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}
	public Date getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	public Date getRefund_date() {
		return refund_date;
	}
	public void setRefund_date(Date refund_date) {
		this.refund_date = refund_date;
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
	// refund 테이블 프라이머리키3개
	private int refund_no;
	private String pro_no;
	private int ware_no;
	
	//임원페이지 화면에 보여줄 내용
	private String user_company;
	private String pro_name;
	private Date order_date;
	private Date refund_date;
	private long order_qty;
	private long refund_qty;
	private long total_price;

}
