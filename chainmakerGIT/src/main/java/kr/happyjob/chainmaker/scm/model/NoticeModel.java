package kr.happyjob.chainmaker.scm.model;

import java.sql.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
public class NoticeModel {
	
	
	public String getLoginID() {
		return loginID;
	}
	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}
	public String getNotice_content() {
		return notice_content;
	}
	public void setNotice_content(String notice_content) {
		this.notice_content = notice_content;
	}
	public int getNotice_hit() {
		return notice_hit;
	}
	public void setNotice_hit(int notice_hit) {
		this.notice_hit = notice_hit;
	}
	public Date getNotice_moddate() {
		return notice_moddate;
	}
	public void setNotice_moddate(Date notice_moddate) {
		this.notice_moddate = notice_moddate;
	}
	public int getNotice_no() {
		return notice_no;
	}
	public void setNotice_no(int notice_no) {
		this.notice_no = notice_no;
	}
	public Date getNotice_regdate() {
		return notice_regdate;
	}
	public void setNotice_regdate(Date notice_regdate) {
		this.notice_regdate = notice_regdate;
	}
	public String getNotice_title() {
		return notice_title;
	}
	public void setNotice_title(String notice_title) {
		this.notice_title = notice_title;
	}
	public String getDel_cd() {
		return del_cd;
	}
	public void setDel_cd(String del_cd) {
		this.del_cd = del_cd;
	}
	private String loginID;
	private String notice_content;
	private int notice_hit;
	private Date notice_moddate;
	private int notice_no;
	private Date notice_regdate;
	private String notice_title;
	private String del_cd;
	
	

}
