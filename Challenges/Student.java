package Array_List;

import java.util.ArrayList;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object>arr=new ArrayList<Object>();
		arr.add("sanjay");
		arr.add("computer Technology");
		arr.add("3 years");
		arr.set(2, "think");
//		arr.remove(2);
//		arr.add("good");
//		arr.add(1, "developer");
//		arr.get(3);
		
//		Consumer<? super Object> student;
		
//		for(Object data:arr)
		for (Object data : arr) {
			System.out.println(data);
		}
		
	}

}
