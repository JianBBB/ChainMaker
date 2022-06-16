package kr.happyjob.chainmaker.epc.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
public class ProductListModel {
		public String getPro_num() {
		return pro_num;
	}

	public void setPro_num(String pro_num) {
		this.pro_num = pro_num;
	}

	public String getPro_cod() {
		return pro_cod;
	}

	public void setPro_cod(String pro_cod) {
		this.pro_cod = pro_cod;
	}

	public String getPro_cod_num() {
		return pro_cod_num;
	}

	public void setPro_cod_num(String pro_cod_num) {
		this.pro_cod_num = pro_cod_num;
	}

	public String getPro_cod_nam() {
		return pro_cod_nam;
	}

	public void setPro_cod_nam(String pro_cod_nam) {
		this.pro_cod_nam = pro_cod_nam;
	}

	public String getPro_manu_nm() {
		return pro_manu_nm;
	}

	public void setPro_manu_nm(String pro_manu_nm) {
		this.pro_manu_nm = pro_manu_nm;
	}

	public int getPro_prc() {
		return pro_prc;
	}

	public void setPro_prc(int pro_prc) {
		this.pro_prc = pro_prc;
	}

	public String getPro_det() {
		return pro_det;
	}

	public void setPro_det(String pro_det) {
		this.pro_det = pro_det;
	}

	public String getLogin_id() {
		return login_id;
	}

	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public int getOd_qty() {
		return od_qty;
	}

	public void setOd_qty(int od_qty) {
		this.od_qty = od_qty;
	}

	public int getExBasket() {
		return exBasket;
	}

	public void setExBasket(int exBasket) {
		this.exBasket = exBasket;
	}

	public String getUser_account() {
		return user_account;
	}

	public void setUser_account(String user_account) {
		this.user_account = user_account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public String getFile_server_path() {
		return file_server_path;
	}

	public void setFile_server_path(String file_server_path) {
		this.file_server_path = file_server_path;
	}

		// 장비번호
		private String pro_num;

		// 장비구분
		private String pro_cod;

		// 모델번호
		private String pro_cod_num;

		// 모델명
		private String pro_cod_nam;

		// 제조사
		private String pro_manu_nm;
		
		// 판매가격
		private int pro_prc;
		
		// 상세설명
		private String pro_det;
		
		// 로그인 id
		private String login_id;
		
		// 납품일자
		private Date startDate;
		
		// 주문수량
		private int od_qty;
		
		// 장바구니 중복체크 
		private int exBasket;
				
		// 은행 어카운트
		private String user_account;
		// 은행 		
		private String name;
		// 은행 이름
		private String bank_name;
		
		private String file_server_path;
}