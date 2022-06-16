package kr.happyjob.chainmaker.epc.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class RefundUserInfoDTO {

	public String getLoginID() {
		return loginID;
	}

	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public String getUser_account() {
		return user_account;
	}

	public void setUser_account(String user_account) {
		this.user_account = user_account;
	}

	private String loginID;
	private String name;
	private String user_address;
	private String bank_name;
	private String user_account;
	
	public RefundUserInfoDTO(RefundUserInfoVO vo) {
		this.loginID = vo.getLoginID();
		this.name = vo.getName();
		this.user_address = vo.getUser_address();
		this.bank_name = vo.getBank_name();
		this.user_account = vo.getUser_account();
	}
}
