package kh.collection;

public class CustomVectorTest {

	public static void main(String[] args) {
		CustomVector myVector = new CustomVector(5);
		System.out.println("capacity1: "+myVector.capacity());
		System.out.println("비어있음: "+myVector.isEmpty());
		System.out.println("값의 개수: "+myVector.size());
		
		myVector.add("1");
		myVector.add("2");
		myVector.add("3");
		myVector.add("최범석");
		myVector.add("수원");
		myVector.add("40");
		myVector.add("금요일");
		System.out.println("capacity2: "+myVector.capacity());
		System.out.println("비어있음: "+myVector.isEmpty());
		System.out.println("값의 개수: "+myVector.size());
		System.out.println(myVector.get(3));
		
		myVector.remove("3");
		myVector.remove("최범석");
		System.out.println(myVector.toString());
	}

}
