package kr.happyjob.chainmaker.epc.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class OrderDetailDTO {

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

	public String getPro_cd() {
		return pro_cd;
	}

	public void setPro_cd(String pro_cd) {
		this.pro_cd = pro_cd;
	}

	public String getPro_name() {
		return pro_name;
	}

	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}

	public String getPro_manu_name() {
		return pro_manu_name;
	}

	public void setPro_manu_name(String pro_manu_name) {
		this.pro_manu_name = pro_manu_name;
	}

	public int getOrder_qty() {
		return order_qty;
	}

	public void setOrder_qty(int order_qty) {
		this.order_qty = order_qty;
	}

	public int getPro_price() {
		return pro_price;
	}

	public void setPro_price(int pro_price) {
		this.pro_price = pro_price;
	}

	private int order_no;
	private String pro_no;
	private String pro_cd;
	private String pro_name;
	private String pro_manu_name;
	private int order_qty;
	private int pro_price;
	
	public OrderDetailDTO(OrderDetailVO vo) {
		this.order_no = vo.getOrder_no();
		this.pro_no = vo.getPro_no();
		this.pro_cd = vo.getPro_cd();
		this.pro_name = vo.getPro_name();
		this.pro_manu_name = vo.getPro_manu_name();
		this.order_qty = vo.getOrder_qty();
		this.pro_price = vo.getPro_price();
	}
}
