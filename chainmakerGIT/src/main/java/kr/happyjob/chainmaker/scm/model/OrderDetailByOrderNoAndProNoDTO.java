package kr.happyjob.chainmaker.scm.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OrderDetailByOrderNoAndProNoDTO {

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

	public String getOrder_date() {
		return order_date;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
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

	public String getOrder_expdate() {
		return order_expdate;
	}

	public void setOrder_expdate(String order_expdate) {
		this.order_expdate = order_expdate;
	}

	public int getOrder_qty() {
		return order_qty;
	}

	public void setOrder_qty(int order_qty) {
		this.order_qty = order_qty;
	}

	public int getDeposit_cd() {
		return deposit_cd;
	}

	public void setDeposit_cd(int deposit_cd) {
		this.deposit_cd = deposit_cd;
	}

	public String getOrder_cd() {
		return order_cd;
	}

	public void setOrder_cd(String order_cd) {
		this.order_cd = order_cd;
	}

	private String pro_no;
	private int order_no;
	private String order_date;
	private String user_company;
	private String pro_name;
	private String order_expdate;
	private int order_qty;
	private int deposit_cd;
	private String order_cd;
	
	public OrderDetailByOrderNoAndProNoDTO(OrderDetailByOrderNoAndProNoVO orderDetailVO) {
		
		this.pro_no = orderDetailVO.getPro_no();
		this.order_no = orderDetailVO.getOrder_no();
		this.order_date = orderDetailVO.getOrder_date();
		this.user_company = orderDetailVO.getUser_company();
		this.pro_name = orderDetailVO.getPro_name();
		this.order_expdate = orderDetailVO.getOrder_expdate();
		this.order_qty = orderDetailVO.getOrder_qty();
		this.deposit_cd = orderDetailVO.getDeposit_cd();
		this.order_cd = orderDetailVO.getOrder_cd();
	}
}
