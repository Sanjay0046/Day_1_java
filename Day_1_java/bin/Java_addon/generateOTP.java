package method;

import java.util.Random;
import java.util.Scanner;
public class generateOTP {
	
	
	
	public static int OTP() {
		Random s= new Random();
		return 100 + s.nextInt(300);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		long num= in.nextLong();
		long a=1234567890;
		if (num==a) {
			System.out.println("next");
			int otp =OTP();
			System.out.println(otp);
		} else {
			System.out.println("not vaild");
		}
		
		
	}

}
