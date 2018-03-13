package kh.map;

import java.lang.reflect.*;
import java.text.*;
import java.util.*;
import java.util.Map.*;

import kh.list.vo.*;

public class HashMapTest {

	public static void main(String[] args) {
		Map map = new HashMap();
		
		//값을 저장한다. 키, 값 한쌍으로 저장)
		map.put("날씨", "흐림");
		map.put("시간", "너무 빨리 감");
		map.put(1, 150);
		map.put("time", new Date());
		
		System.out.println(map);
		
		System.out.println("============");
		//키 값이 중복 될 경우 기존 값에 덮어 쓰기가 됨
		map.put("날씨", "밥먹기 좋은날");
		System.out.println(map);
		System.out.println("============");
		//키 값이 다를 경우 중복 된 값 입력 가능
		map.put(50, 150);
		map.put(100, 150);
		System.out.println(map);
		System.out.println("============");
		//키값을 이용하여 값을 얻어옴
		String str = (String)map.get("시간");
		System.out.println(str);
		System.out.println(map.get("시간"));//toString이 자동 호출
		
		//"time"-> 0000년 00월 00일 로 출력해보기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format((Date)map.get("time")));
		
		System.out.println("============");
		//키 값을 이용하여 값 삭제
		map.remove("날씨");
		System.out.println(map);
		System.out.println("============");

		Map<Integer, MemberVo> map2 = new HashMap<Integer, MemberVo>();
		MemberVo mv1 = new MemberVo(10, "고재준", new Date());
		MemberVo mv2 = new MemberVo(20, "김현수", new Date(0));
		MemberVo mv3 = new MemberVo(30, "박경호", new Date(952280202029L));
		MemberVo mv4 = new MemberVo(40, "컄케야", new Date(938751981232L));
		MemberVo mv5 = new MemberVo(50, "매냥려", new Date(952280202029L));
		MemberVo mv6 = new MemberVo(60, "룰룰내", new Date(952235434029L));
		MemberVo mv7 = new MemberVo(70, "조용냐", new Date(952634545029L));
		
		map2.put(mv1.getMemberNo(), mv1);
		map2.put(mv2.getMemberNo(), mv2);
		map2.put(mv3.getMemberNo(), mv3);
		map2.put(mv4.getMemberNo(), mv4);
		map2.put(mv5.getMemberNo(), mv5);
		map2.put(mv6.getMemberNo(), mv6);
		map2.put(mv7.getMemberNo(), mv7);

		//키 값들의 묶음 set으로 반환
		Set<Integer> keys = map2.keySet();
		//set에서 iterator객체 뽑아옴
		Iterator<Integer> keyIter = keys.iterator();
		int key = -1;
		MemberVo temp = null;
		while(keyIter.hasNext()) {
			System.out.println(map2.get(keyIter.next()));
		}
		
		Set<Entry<Integer,MemberVo>> entrySet = map2.entrySet();
		Iterator<Entry<Integer, MemberVo>> entryIter = entrySet.iterator();
		Entry<Integer,MemberVo> tempEntry = null;
		while(entryIter.hasNext()) {
			tempEntry = entryIter.next();
			System.out.println(tempEntry.getKey()+","+tempEntry.getValue().toString());
		}
		
		//map
		//1. 값 추가할때 사용 - put(키, 값)
		//2. 값 삭제할때 사용 - remove(키)
		//3. 값을 가져올때 - get(키)
		//4. keySet - 키 값들의 묶음을 set으로 반환
		//5. entrySet - Entry 들의 묶을을 set으로 반환
		//6. containsKey - 키 값의 존재 여부를 확인
		//7. size, clear - 리스트와 동일함
	}

}
