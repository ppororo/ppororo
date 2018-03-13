package kh.collection;

public class CustomVector {

	private Object[] objArr;
	private int size;
	public CustomVector() {
		objArr = new Object[10];
	}
	public CustomVector(int capacity) {
		objArr = new Object[capacity];
	}
	
	public int capacity() {
		
		return objArr.length;
	}
	
	public int size() {
//		int realSize = 0;
//		for(int i=0; i<objArr.length; i++) {
//			if(objArr[i] != null) {
//				realSize++;
//			}
//		}
//		return realSize;
		return size;
	}
	
	public boolean isEmpty() {
		//내가 푼방법
//		boolean check = false;
//		if(size==0) {
//			check = true;
//		}
//		return check;
		
		
		//첫번째방법
//		boolean result = true;
//		for(int i=0; i<objArr.length; i++) {
//			if(objArr[i] != null) {
//				result = false;
//				break;
//			}
//		}
		
		
		//두번째 방법
		return size ==0;
	}
	
	public void add(Object obj) {
		//내가 푼 방법
//		if(objArr.length >= size) {
//			objArr[size-1] = obj;
//		}else {
//			Object[] objArr2 = new Object[size*2];
//			System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
//			objArr2[size] = obj;
//			objArr = objArr2;
//		}
//		size++;
		
		//강사님 방법
		Object[] temp = null;
		if(size()==capacity()) {
			temp = objArr;
			objArr = new Object[temp.length*2];
			for(int i=0; i<temp.length;i++) {
				objArr[i] = temp[i];
			}
		}
		objArr[size]=obj;
		size++;
	}
	
	public Object get(int index) {
		//내가 푼 방법
//		Object obj = null;
//		try {
//			obj = objArr[index];
//		}catch(IndexOutOfBoundsException e) {
//			
//		}
//		return obj;
		
		//강사님 방법
		if(index<0||size<=index) {
			throw new IndexOutOfBoundsException();
		}
		return objArr[index];
	}
	
	public int indexOf(Object obj) {
		//내가 푼 방법
//		for(int i=0; i<objArr.length;i++) {
//			if(obj.equals(objArr[i])) {
//				return i;
//			}
//		}
//		return -1;
		
		//강사님 방법
		int index = -1;
		
		for(int i=0; i<size; i++) {
			if(objArr[i].equals(obj)) {
				index = i;
				break;
			}
		}
		
		return index;
	}
	
	public boolean remove(Object obj) {
		boolean result = false;
		int index = indexOf(obj);
		if(index != -1) {
			objArr[index] = null;
			System.arraycopy(objArr, index+1, objArr, index, size-index-1);
			objArr[size-1] = null;
			size--;
			result = true;	
		}
		
		return result;
	}
	
	@Override
	public String toString() {
		String result = "";
		for(int i=0; i<size;i++) {
			result += objArr[i].toString() + " ";
			
		}
		return result;
	}
}
