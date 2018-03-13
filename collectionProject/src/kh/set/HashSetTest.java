package kh.set;

import java.util.*;

import kh.list.vo.*;

public class HashSetTest {

	public static void main(String[] args) {
		//다형성을 적용하여 객체 생성 -> 구현클래스를 통해 객체 생성
		Set set = new HashSet();
//		HashSet set1 = new HashSet();
		
		set.add(15);
		set.add(new Date());
		set.add(2.55);
		set.add(new Character('c'));
		set.add(new MemberVo(50, "고재준",new Date()));
		
		System.out.println(set.toString());
		
		set.add(15);
		set.add(2.55);
		set.add(new Character('c'));
		System.out.println("===============================================================");
		//중복된 값은 지정하지 않는다. 첫번째와 같은 결과 출력 됨
		System.out.println(set.toString());
		System.out.println("===============================================================");

		//set API
		System.out.println("포함된 값의 개수: "+set.size());
		System.out.println("비어있음 여부 확인: "+set.isEmpty());
		System.out.println("해당 객체 존재 여부 확인: "+set.contains(15));
		System.out.println(set.toArray());
		System.out.println("값 삭제1: "+set.remove(2.55));
		System.out.println("값 삭제2: "+set.remove(2.55));
	}

}
