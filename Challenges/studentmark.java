package Array_List;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class studentmark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Object,Integer> student=new HashMap<Object, Integer>();
		student.put("student1 :", 23);
		student.put("student2 :", 35);
		student.put("student3 :", 62);
		
		
		int total =0;
		for (int mark : student.values()) {
			total +=mark;
			
		}
		
		for (Map.Entry<Object, Integer> entry:student.entrySet()) {
//			Object entry;
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		System.out.println("Total marks   :"+total);
		double avg=total/student.size();
//		avg=total/3;
		System.out.println("Average Mark   :"+avg);
		

	}

}
