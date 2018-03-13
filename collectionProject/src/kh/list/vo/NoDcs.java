package kh.list.vo;

import java.util.*;

public class NoDcs implements Comparator<MemberVo> {

	@Override
	public int compare(MemberVo o1, MemberVo o2) {

//		int result = -1;
//		if(o1.getMemberNo()<o2.getMemberNo()) {
//			result = 1;
//		}
//		return result;
		//양수를 리턴 -> 순서를 바꾼다
		return o2.getMemberNo()-o1.getMemberNo();
		//0, 음수  - 변경하지 않습니다.
		//양수(1) -변경합니다.
		//큰수 - 작은수 -> 양수
		//작은수 - 큰수 -> 음수
	}
}
