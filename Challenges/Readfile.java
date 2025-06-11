package File_Handling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class Readfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr=new FileReader("output.txt");
			BufferedReader br=new BufferedReader(fr);
			
			String line=br.readLine();
			
			while (line !=null) {
				System.out.println(line);
				
				line=br.readLine();
			}
			br.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("file is not exist");
		}
	}

}
