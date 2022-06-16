package kr.happyjob.chainmaker.dlm.model;

import java.sql.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class EPCRefundInfoDTO {
	
	public int getRefund_no() {
		return refund_no;
	}

	public void setRefund_no(int refund_no) {
		this.refund_no = refund_no;
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

	public int getRefund_qty() {
		return refund_qty;
	}

	public void setRefund_qty(int refund_qty) {
		this.refund_qty = refund_qty;
	}

	public Date getRefund_date() {
		return refund_date;
	}

	public void setRefund_date(Date refund_date) {
		this.refund_date = refund_date;
	}

	public int getRefund_confirm_cd() {
		return refund_confirm_cd;
	}

	public void setRefund_confirm_cd(int refund_confirm_cd) {
		this.refund_confirm_cd = refund_confirm_cd;
	}

	public String getRefund_note() {
		return refund_note;
	}

	public void setRefund_note(String refund_note) {
		this.refund_note = refund_note;
	}

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

	public int getWare_no() {
		return ware_no;
	}

	public void setWare_no(int ware_no) {
		this.ware_no = ware_no;
	}

	public String getWare_name() {
		return ware_name;
	}

	public void setWare_name(String ware_name) {
		this.ware_name = ware_name;
	}

	public String getPro_model_name() {
		return pro_model_name;
	}

	public void setPro_model_name(String pro_model_name) {
		this.pro_model_name = pro_model_name;
	}

	public String getPro_manu_name() {
		return pro_manu_name;
	}

	public void setPro_manu_name(String pro_manu_name) {
		this.pro_manu_name = pro_manu_name;
	}

	public String getDetail_name() {
		return detail_name;
	}

	public void setDetail_name(String detail_name) {
		this.detail_name = detail_name;
	}

	private int refund_no;
	private String user_company;
	private String pro_name;
	private int refund_qty;
	private Date refund_date;
	private int refund_confirm_cd;
	private String refund_note;
	private String pro_no;
	private int order_no;
	private int ware_no;
	private String ware_name;
	private String pro_model_name;
	private String pro_manu_name;
	private String detail_name;
	
	public EPCRefundInfoDTO(EPCRefundInfoVO vo) {
		this.refund_no = vo.getRefund_no();
		this.user_company = vo.getUser_company();
		this.pro_name = vo.getPro_name();
		this.refund_qty = vo.getRefund_qty();
		this.refund_date = vo.getRefund_date();
		this.refund_confirm_cd = vo.getRefund_confirm_cd();
		this.refund_note = vo.getRefund_note();
		this.pro_no = vo.getPro_no();
		this.order_no = vo.getOrder_no();
		this.ware_no = vo.getWare_no();
		this.ware_name = vo.getWare_name();
		this.pro_model_name = vo.getPro_model_name();
		this.pro_manu_name = vo.getPro_manu_name();
		this.detail_name = vo.getDetail_name();
	}
}
