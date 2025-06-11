package File_Handling;

import java.io.BufferedReader;
import java.io.FileReader;


public class task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fl=" file";
		try (BufferedReader br=new BufferedReader(new FileReader(fl))){
			
			String Line;
			if ((Line = br.readLine())  != null ){
				System.out.println(Line);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("file is not exist ");
		}

	}

}
