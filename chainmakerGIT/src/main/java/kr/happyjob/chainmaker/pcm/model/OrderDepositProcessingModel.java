package kr.happyjob.chainmaker.pcm.model;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OrderDepositProcessingModel {
	private int order_no;
    private int order_qty;
    private String deposit_cd;
    private Date order_mod_date;
    private String name;
    private String user_bank;
    private String user_account;
    private String user_company;
    private String pro_no;
    private String pro_name;
    private int pro_price; 
    private long total_price; 
    private long sum_price;
	public int getOrder_no() {
		return order_no;
	}
	public void setOrder_no(int order_no) {
		this.order_no = order_no;
	}
	public int getOrder_qty() {
		return order_qty;
	}
	public void setOrder_qty(int order_qty) {
		this.order_qty = order_qty;
	}
	public String getDeposit_cd() {
		return deposit_cd;
	}
	public void setDeposit_cd(String deposit_cd) {
		this.deposit_cd = deposit_cd;
	}
	public Date getOrder_mod_date() {
		return order_mod_date;
	}
	public void setOrder_mod_date(Date order_mod_date) {
		this.order_mod_date = order_mod_date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getUser_company() {
		return user_company;
	}
	public void setUser_company(String user_company) {
		this.user_company = user_company;
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
	public int getPro_price() {
		return pro_price;
	}
	public void setPro_price(int pro_price) {
		this.pro_price = pro_price;
	}
	public long getTotal_price() {
		return total_price;
	}
	public void setTotal_price(long total_price) {
		this.total_price = total_price;
	}
	public long getSum_price() {
		return sum_price;
	}
	public void setSum_price(long sum_price) {
		this.sum_price = sum_price;
	} 
    
    
}
