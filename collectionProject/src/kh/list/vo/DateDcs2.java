package kh.list.vo;

import java.util.*;

public class DateDcs2 implements Comparator<MemberVo> {

	@Override
	public int compare(MemberVo o1, MemberVo o2) {

		return o2.getJoinDate().compareTo(o1.getJoinDate());
	}
}
