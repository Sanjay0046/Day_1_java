package Exception_Handling;

import java.util.Scanner;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		try {
			System.out.println("Enter the Number  :");
			int a=in.nextInt();
			int b=a/4;
			System.out.println(b);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("wrong"+e);
		} finally {
			System.out.println("the'try'is finished.......!");
		}
	
	}

}
