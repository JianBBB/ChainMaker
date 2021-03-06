package kr.happyjob.chainmaker.dashboard.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class DashboardScmModel {

	public int getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(int orderdate) {
		this.orderdate = orderdate;
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

	private int orderdate;
	
	private String pro_no;
	
	private int order_qty;
}
