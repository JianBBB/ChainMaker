package kr.happyjob.chainmaker.dlm.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor

public class DlmPurchaseOrderDTO {

  public String getLoginID() {
		return loginID;
	}

	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}

	public int getDeli_no() {
		return deli_no;
	}

	public void setDeli_no(int deli_no) {
		this.deli_no = deli_no;
	}

	public String getDeli_company() {
		return deli_company;
	}

	public void setDeli_company(String deli_company) {
		this.deli_company = deli_company;
	}

	public String getTotal_price() {
		return total_price;
	}

	public void setTotal_price(String total_price) {
		this.total_price = total_price;
	}

	public String getPurchase_no() {
		return purchase_no;
	}

	public void setPurchase_no(String purchase_no) {
		this.purchase_no = purchase_no;
	}

	public String getPurchase_qty() {
		return purchase_qty;
	}

	public void setPurchase_qty(String purchase_qty) {
		this.purchase_qty = purchase_qty;
	}

	public String getPurchase_date() {
		return purchase_date;
	}

	public void setPurchase_date(String purchase_date) {
		this.purchase_date = purchase_date;
	}

	public String getPro_no() {
		return pro_no;
	}

	public void setPro_no(String pro_no) {
		this.pro_no = pro_no;
	}

	public String getPro_name() {
		return pro_name;
	}

	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}

	public String getPro_deli_price() {
		return pro_deli_price;
	}

	public void setPro_deli_price(String pro_deli_price) {
		this.pro_deli_price = pro_deli_price;
	}

	public String getPro_manu_name() {
		return pro_manu_name;
	}

	public void setPro_manu_name(String pro_manu_name) {
		this.pro_manu_name = pro_manu_name;
	}

	public int getPro_io_qty() {
		return pro_io_qty;
	}

	public void setPro_io_qty(int pro_io_qty) {
		this.pro_io_qty = pro_io_qty;
	}

	public int getWare_no() {
		return ware_no;
	}

	public void setWare_no(int ware_no) {
		this.ware_no = ware_no;
	}

	public String getDetail_name() {
		return detail_name;
	}

	public void setDetail_name(String detail_name) {
		this.detail_name = detail_name;
	}

private String loginID;
  
  private int deli_no;
  private String deli_company;
  private String total_price;
  
  private String purchase_no;
  private String purchase_qty;
  private String purchase_date;
  
  private String pro_no;
  private String pro_name;
  private String pro_deli_price;
  private String pro_manu_name;
  
  private int pro_io_qty;
  
  private int ware_no;

  
  private String detail_name;
  
  public DlmPurchaseOrderDTO(DlmPurchaseOrderVO dlmPurchaseOrderVO) {
    
    this.deli_no = dlmPurchaseOrderVO.getDeli_no();
    this.deli_company = dlmPurchaseOrderVO.getDeli_company();
    this.total_price = dlmPurchaseOrderVO.getTotal_price();
    
    this.purchase_no = dlmPurchaseOrderVO.getPurchase_no();
    this.purchase_qty = dlmPurchaseOrderVO.getPurchase_qty();
    this.purchase_date = dlmPurchaseOrderVO.getPurchase_date();
    
    this.pro_no = dlmPurchaseOrderVO.getPro_no();
    this.pro_name = dlmPurchaseOrderVO.getPro_name();
    this.pro_deli_price = dlmPurchaseOrderVO.getPro_deli_price();
    this.pro_manu_name = dlmPurchaseOrderVO.getPro_manu_name();
    
    this.pro_io_qty = dlmPurchaseOrderVO.getPro_io_qty();
    
    this.ware_no = dlmPurchaseOrderVO.getWare_no();
    
    this.detail_name = dlmPurchaseOrderVO.getDetail_name();
    
  }
  
}
