package kr.happyjob.chainmaker.dashboard.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;


public class MonthProfitVO {

	public String getOrder_date() {
		return order_date;
	}
	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}
	public int getMonth_profit() {
		return month_profit;
	}
	public void setMonth_profit(int month_profit) {
		this.month_profit = month_profit;
	}
	private String order_date;
	private int month_profit;
	
}
