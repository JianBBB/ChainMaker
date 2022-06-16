package kr.happyjob.chainmaker.scm.model;

import java.sql.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class PurchaseInfoDTO {
	
	public int getPurchase_no() {
		return purchase_no;
	}

	public void setPurchase_no(int purchase_no) {
		this.purchase_no = purchase_no;
	}

	public int getPurchase_qty() {
		return purchase_qty;
	}

	public void setPurchase_qty(int purchase_qty) {
		this.purchase_qty = purchase_qty;
	}

	public int getPurchase_cd() {
		return purchase_cd;
	}

	public void setPurchase_cd(int purchase_cd) {
		this.purchase_cd = purchase_cd;
	}

	public Date getPurchase_date() {
		return purchase_date;
	}

	public void setPurchase_date(Date purchase_date) {
		this.purchase_date = purchase_date;
	}

	public String getPro_no() {
		return pro_no;
	}

	public void setPro_no(String pro_no) {
		this.pro_no = pro_no;
	}

	public String getLoginID() {
		return loginID;
	}

	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}

	public int getWare_no() {
		return ware_no;
	}

	public void setWare_no(int ware_no) {
		this.ware_no = ware_no;
	}

	private int purchase_no;
	private int purchase_qty;
	private int purchase_cd;
	private Date purchase_date;
	private String pro_no;
	private String loginID;
	private int ware_no;
	
	public PurchaseInfoDTO(PurchaseAndShippingInfoDTO purchaseAndShippingInfoDTO) {
		this.purchase_no = purchaseAndShippingInfoDTO.getPurchase_no();
		this.purchase_qty = purchaseAndShippingInfoDTO.getPurchase_qty();
		this.purchase_cd = purchaseAndShippingInfoDTO.getPurchase_cd();
		this.pro_no = purchaseAndShippingInfoDTO.getPro_no();
		this.loginID = purchaseAndShippingInfoDTO.getLoginID();
		this.ware_no = purchaseAndShippingInfoDTO.getWare_no();
	}
	
}
