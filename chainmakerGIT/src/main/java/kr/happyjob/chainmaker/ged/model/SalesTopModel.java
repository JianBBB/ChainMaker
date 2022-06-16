package kr.happyjob.chainmaker.ged.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SalesTopModel {
	
	public String getTop_sales_user_company() {
		return top_sales_user_company;
	}
	public void setTop_sales_user_company(String top_sales_user_company) {
		this.top_sales_user_company = top_sales_user_company;
	}
	public int getTop_sales_price() {
		return top_sales_price;
	}
	public void setTop_sales_price(int top_sales_price) {
		this.top_sales_price = top_sales_price;
	}
	private String top_sales_user_company;
	private int top_sales_price;
}
