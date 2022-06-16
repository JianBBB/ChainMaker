package kr.happyjob.chainmaker.ged.model;

import java.sql.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class CompanySalesDetailDTO {

	public String getUser_company() {
		return user_company;
	}

	public void setUser_company(String user_company) {
		this.user_company = user_company;
	}

	public int getOrder_no() {
		return order_no;
	}

	public void setOrder_no(int order_no) {
		this.order_no = order_no;
	}

	public String getPro_no() {
		return pro_no;
	}

	public void setPro_no(String pro_no) {
		this.pro_no = pro_no;
	}

	public int getOrder_qty() {
		return order_qty;
	}

	public void setOrder_qty(int order_qty) {
		this.order_qty = order_qty;
	}

	public Date getOrder_date() {
		return order_date;
	}

	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}

	public String getPro_name() {
		return pro_name;
	}

	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}

	public int getSales_price() {
		return sales_price;
	}

	public void setSales_price(int sales_price) {
		this.sales_price = sales_price;
	}

	public int getProfit_price() {
		return profit_price;
	}

	public void setProfit_price(int profit_price) {
		this.profit_price = profit_price;
	}

	private String user_company;
	private int order_no;
	private String pro_no;
	private int order_qty;
	private Date order_date;
	private String pro_name;
	
	private int sales_price;
	private int profit_price;
	
	public CompanySalesDetailDTO(CompanySalesDetailVO vo) {
		this.user_company = vo.getUser_company();
		this.order_no = vo.getOrder_no();
		this.pro_no = vo.getPro_no();
		this.order_qty = vo.getOrder_qty();
		this.order_date = vo.getOrder_date();
		this.pro_name = vo.getPro_name();
		this.sales_price = vo.getSales_price();
		this.profit_price = vo.getProfit_price();
	}
}
