package kh.list.vo;

import java.util.*;

public class NameAsc implements Comparator<MemberVo> {

	@Override
	public int compare(MemberVo o1, MemberVo o2) {
//		MemberVo member1 = (MemberVo)o1;
//		MemberVo member2 = (MemberVo)o2;
		//양수를 리턴 -> 순서를 바꾼다
		return (o1.getMemberName()).compareToIgnoreCase(o2.getMemberName());
	}
}
