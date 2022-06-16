package kr.happyjob.chainmaker.scm.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ShippingDirectionDTO {
	
	public int getShip_no() {
		return ship_no;
	}

	public void setShip_no(int ship_no) {
		this.ship_no = ship_no;
	}

	public int getOrder_no() {
		return order_no;
	}

	public void setOrder_no(int order_no) {
		this.order_no = order_no;
	}

	public int getWare_no() {
		return ware_no;
	}

	public void setWare_no(int ware_no) {
		this.ware_no = ware_no;
	}

	public String getPro_no() {
		return pro_no;
	}

	public void setPro_no(String pro_no) {
		this.pro_no = pro_no;
	}

	public int getShip_qty() {
		return ship_qty;
	}

	public void setShip_qty(int ship_qty) {
		this.ship_qty = ship_qty;
	}

	public String getDeli_master_name() {
		return deli_master_name;
	}

	public void setDeli_master_name(String deli_master_name) {
		this.deli_master_name = deli_master_name;
	}

	public String getWriter_id() {
		return writer_id;
	}

	public void setWriter_id(String writer_id) {
		this.writer_id = writer_id;
	}

	private int ship_no;
	private int order_no;
	private int ware_no;
	private String pro_no;
	private int ship_qty;
	private String deli_master_name;
	private String writer_id;
	
	public ShippingDirectionDTO(PurchaseAndShippingInfoDTO purchaseAndShippingInfoDTO) {
		this.ship_no = purchaseAndShippingInfoDTO.getShip_no();
		this.order_no = purchaseAndShippingInfoDTO.getOrder_no();
		this.ware_no = purchaseAndShippingInfoDTO.getWare_no();
		this.pro_no = purchaseAndShippingInfoDTO.getPro_no();
		this.ship_qty = purchaseAndShippingInfoDTO.getShip_qty();
		this.deli_master_name = purchaseAndShippingInfoDTO.getDeli_master_name();
		this.writer_id = purchaseAndShippingInfoDTO.getWriter_id();
	}
}
