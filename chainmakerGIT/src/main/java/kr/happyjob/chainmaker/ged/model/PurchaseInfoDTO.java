package kr.happyjob.chainmaker.ged.model;

import java.math.BigInteger;
import java.sql.Date;

import lombok.NoArgsConstructor;

import lombok.Setter;
import lombok.ToString;
import lombok.Getter;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class PurchaseInfoDTO {
	
	public String getDeli_company() {
		return deli_company;
	}

	public void setDeli_company(String deli_company) {
		this.deli_company = deli_company;
	}

	public int getPurchase_no() {
		return purchase_no;
	}

	public void setPurchase_no(int purchase_no) {
		this.purchase_no = purchase_no;
	}

	public String getPro_name() {
		return pro_name;
	}

	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}

	public int getPurchase_qty() {
		return purchase_qty;
	}

	public void setPurchase_qty(int purchase_qty) {
		this.purchase_qty = purchase_qty;
	}

	public BigInteger getPurchase_price() {
		return purchase_price;
	}

	public void setPurchase_price(BigInteger purchase_price) {
		this.purchase_price = purchase_price;
	}

	public Date getPurchase_date() {
		return purchase_date;
	}

	public void setPurchase_date(Date purchase_date) {
		this.purchase_date = purchase_date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String deli_company;
	private int purchase_no;
	private String pro_name;
	private int purchase_qty;
	private BigInteger purchase_price;
	private Date purchase_date;
	private String name;

	public PurchaseInfoDTO(PurchaseInfoVO vo) {
		this.deli_company = vo.getDeli_company();
		this.purchase_no = vo.getPurchase_no();
		this.pro_name = vo.getPro_name();
		this.purchase_qty = vo.getPurchase_qty();
		this.purchase_price = vo.getPurchase_price();
		this.purchase_date = vo.getPurchase_date();
		this.name = vo.getName();
	}
}
