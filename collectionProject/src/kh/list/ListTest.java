package kh.list;

import java.util.*;

import kh.list.vo.*;

public class ListTest {

	public static void main(String[] args) {
		//리스트 객체를 생성 -> 다형성을 이용
//		List list = new ArrayList();
//		//값을 추가할때 사용하는 API
//		list.add(5);
//		list.add(7);
//		list.add(20);
//		
//		
//		
//		//리스트 내 값의 갯수 확인
//		for(int i=0;i<list.size();i++) {
		//리스트 -> 데이터의 순번이 존재 -> 인덱스 이용하여 값을 추출함
//			System.out.println(list.get(i));
//		}
		
		
		MemberVo mv1 = new MemberVo(10, "고재준", new Date());
		MemberVo mv2 = new MemberVo(20, "김현수", new Date(0));
		MemberVo mv3 = new MemberVo(30, "박경호", new Date(952280202029L));
		MemberVo mv4 = new MemberVo(40, "컄케야", new Date(938751981232L));
		MemberVo mv5 = new MemberVo(50, "매냥려", new Date(952280202029L));
		MemberVo mv6 = new MemberVo(60, "룰룰내", new Date(952235434029L));
		MemberVo mv7 = new MemberVo(70, "조용냐", new Date(952634545029L));
		
//		List list = new ArrayList();
//		//리스트(컬렉션) 객체 저장 가능(Object)
//		list.add(mv6);
//		list.add(mv4);
//		list.add(mv7);
//		list.add(mv5);
//		list.add(mv1);
//		list.add(mv2);
//		list.add(mv3);
//		
//		
//		
//		for(Object obj : list) {
//			System.out.println((MemberVo)obj);
//		}
//		System.out.println();
//		list.remove(mv3);
//		list.remove(mv1);
		
		
		
//		System.out.println(list.size());
//		System.out.println();
//
//		list.sort(new NameAsc());
//
//		for(Object obj : list) {
//			System.out.println((MemberVo)obj);
//		}
		
		//제네릭 -> 해당 타입만 취급하겠다고 표시
		List<MemberVo> list = new ArrayList<MemberVo>();
		//리스트(컬렉션) 객체 저장 가능(Object)
		list.add(mv6);
		list.add(mv4);
		list.add(mv7);
		list.add(mv5);
		list.add(mv1);
		list.add(mv2);
		list.add(mv3);
		
		
		
		for(MemberVo vo : list) {
			System.out.println(vo.toString());
		}
		
		list.remove(mv3);
		list.remove(0);
		System.out.println();
		for(MemberVo vo : list) {
			System.out.println(vo.toString());
		}
		
		System.out.println();

		//정렬에 사용하는API->Comparator-> 비교기준을 정의
		list.sort(new NameAsc());
		
		for(MemberVo vo : list) {
			System.out.println(vo.toString());
		}
		System.out.println();
		//값의 묶음으로 추출하여 가지고 있는 객체
		Iterator<MemberVo> iter = list.iterator();
		
		while(iter.hasNext()) {//다음 칸에 값이 있습니까?
			System.out.println(iter.next());	
		}
		
		System.out.println();
		ListIterator<MemberVo> listIter = list.listIterator();
		
		while(listIter.hasNext()) {
			System.out.println(listIter.next());
			if(listIter.hasPrevious()) {
				System.out.println(listIter.previous());
				System.out.println(listIter.next());
			}
		}
		
		//현재 list에 정장되어 있는 객체 값 중,
		//memberNo값을 가지고 정렬하여 출력하시오.(단 no의 내림차순으로 정렬하시오)
		
		//객체 정렬 기준 적용
		System.out.println();
		list.sort(new NoDcs());
		for(MemberVo vo : list) {
			System.out.println(vo.toString());
		}
		
		System.out.println();
		list.sort(new DateDcs2());
		for(MemberVo vo : list) {
			System.out.println(vo.toString());
		}
		
	}

}
