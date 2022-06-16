package kr.happyjob.chainmaker.ged.model;

import lombok.ToString;

import lombok.Setter;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class CompanySalesDTO {
	
	public String getUser_company() {
		return user_company;
	}

	public void setUser_company(String user_company) {
		this.user_company = user_company;
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
	private int sales_price;
	private int profit_price;
	
	public CompanySalesDTO(CompanySalesVO vo) {
		this.user_company = vo.getUser_company();
		this.sales_price = vo.getSales_price();
		this.profit_price = vo.getProfit_price();
	}
}
