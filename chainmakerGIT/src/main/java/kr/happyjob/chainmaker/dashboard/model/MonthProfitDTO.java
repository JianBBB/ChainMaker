package kr.happyjob.chainmaker.dashboard.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class MonthProfitDTO {

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
	
	public MonthProfitDTO(MonthProfitVO vo) {
		this.order_date = vo.getOrder_date();
		this.month_profit = vo.getMonth_profit();
	}
	
}
