package kh.list.vo;

import java.text.*;
import java.util.*;

public class MemberVo {

	private int memberNo;
	private String memberName;
	private Date joinDate;
	
	public MemberVo() {
		// TODO Auto-generated constructor stub
	}

	public MemberVo(int memberNo, String memberName, Date joinDate) {
		this.memberNo = memberNo;
		this.memberName = memberName;
		this.joinDate = joinDate;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public String getMemberName() {
		return memberName;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
	
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
		return "["+memberNo + ", "+memberName+", "+sdf.format(joinDate)+"]";
	}
	
	
	
	
	
	
}
