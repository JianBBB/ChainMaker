package kr.happyjob.chainmaker.dlm.model;

import lombok.NoArgsConstructor;

import lombok.ToString;

import lombok.Setter;

import lombok.Getter;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class StockProcessingRequestDTO {

	public int getRefund_no() {
		return refund_no;
	}

	public void setRefund_no(int refund_no) {
		this.refund_no = refund_no;
	}

	public String getPro_io_cd() {
		return pro_io_cd;
	}

	public void setPro_io_cd(String pro_io_cd) {
		this.pro_io_cd = pro_io_cd;
	}

	private int refund_no;
	private String pro_io_cd;
	
	public StockProcessingRequestDTO(int refundNo) {
		this.refund_no = refundNo;
	}
}
