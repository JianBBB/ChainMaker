package kr.happyjob.chainmaker.pcm.model;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RefundFinalProcessingModel {
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
	public Date getRefund_date() {
		return refund_date;
	}
	public void setRefund_date(Date refund_date) {
		this.refund_date = refund_date;
	}
	public String getRefund_confirm_cd() {
		return refund_confirm_cd;
	}
	public void setRefund_confirm_cd(String refund_confirm_cd) {
		this.refund_confirm_cd = refund_confirm_cd;
	}
	public String getRefund_note() {
		return refund_note;
	}
	public void setRefund_note(String refund_note) {
		this.refund_note = refund_note;
	}
	public String getPro_no() {
		return pro_no;
	}
	public void setPro_no(String pro_no) {
		this.pro_no = pro_no;
	}
	public int getOrder_no() {
		return order_no;
	}
	public void setOrder_no(int order_no) {
		this.order_no = order_no;
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
	public String getUser_company() {
		return user_company;
	}
	public void setUser_company(String user_company) {
		this.user_company = user_company;
	}
	public String getUser_bank() {
		return user_bank;
	}
	public void setUser_bank(String user_bank) {
		this.user_bank = user_bank;
	}
	public String getUser_account() {
		return user_account;
	}
	public void setUser_account(String user_account) {
		this.user_account = user_account;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
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
	private int refund_no;
	private int refund_qty;
	private Date refund_date;
	private String refund_confirm_cd;
	private String refund_note;
	private String pro_no;
	private int order_no;
	private long sum_price;
	private long total_price;
	private String pro_name;
	private int pro_price;
	private String loginID;
	private String name;
	private String user_company;
	private String user_bank;
	private String user_account;
	private String user_email;
	private String user_tel1;
	private String user_tel2;
	private String user_tel3; 
}
