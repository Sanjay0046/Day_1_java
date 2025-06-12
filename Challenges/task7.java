package File_Handling;

import java.io.*;
import java.io.*;

public class task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			FileWriter mywriter=new FileWriter("C:\\Users\\casstudent\\Desktop\\Day_1_java\\src\\Java_addonst.txt ");
			mywriter.write("file in java might be tricky,but this is enough !");
			mywriter.close();
			System.out.println("successfull....!");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("not exist");
			e.printStackTrace();
		}

	}

}
