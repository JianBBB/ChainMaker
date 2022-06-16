package kr.happyjob.chainmaker.epc.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString

public class ProductDetailModel {
	
		
			public String getPro_cod_num() {
		return pro_cod_num;
	}

	public void setPro_cod_num(String pro_cod_num) {
		this.pro_cod_num = pro_cod_num;
	}

	public String getPro_cod() {
		return pro_cod;
	}

	public void setPro_cod(String pro_cod) {
		this.pro_cod = pro_cod;
	}

	public String getPro_manu_nm() {
		return pro_manu_nm;
	}

	public void setPro_manu_nm(String pro_manu_nm) {
		this.pro_manu_nm = pro_manu_nm;
	}

	public String getDetail_code() {
		return detail_code;
	}

	public void setDetail_code(String detail_code) {
		this.detail_code = detail_code;
	}

	public String getDetail_name() {
		return detail_name;
	}

	public void setDetail_name(String detail_name) {
		this.detail_name = detail_name;
	}

			// 모델번호
			private String pro_cod_num;
			// 장비구분
			private String pro_cod;

			// 제조사
			private String pro_manu_nm;
			
			//상세 코드
			private String detail_code;
			
			//상세 이름
			private String detail_name;
			
	
}
