package kr.happyjob.chainmaker.scm.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WhMngInfoDTO {
  
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

	public String getUser_tel1() {
		return user_tel1;
	}

	public void setUser_tel1(String user_tel1) {
		this.user_tel1 = user_tel1;
	}

	public String getUser_tel2() {
		return user_tel2;
	}

	public void setUser_tel2(String user_tel2) {
		this.user_tel2 = user_tel2;
	}

	public String getUser_tel3() {
		return user_tel3;
	}

	public void setUser_tel3(String user_tel3) {
		this.user_tel3 = user_tel3;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

private String loginID;
  private String name;
  private String user_tel1;
  private String user_tel2;
  private String user_tel3;
  private String user_email;
  
  // 기본 생성자가 없어서 NoSearchMethodException: WhMngInfoDTO<init>()에러를 뱉어서 추가한 기본 생성자
  private WhMngInfoDTO() {};
  
  public WhMngInfoDTO(WHInfoVO whInfoVO) {
    
    this.loginID = whInfoVO.getLoginID();
    this.name = whInfoVO.getName();
    this.user_tel1 = whInfoVO.getUser_tel1();
    this.user_tel2 = whInfoVO.getUser_tel2();
    this.user_tel3 = whInfoVO.getUser_tel3();
    this.user_email = whInfoVO.getUser_email();
    
  }
  
  
}
