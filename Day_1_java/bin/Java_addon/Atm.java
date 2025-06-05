package Java_addon;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the pin number :");
		int pin=in.nextInt();
		System.out.println("enter the amount");

		
		if (pin == 12345) {
			int amount=in.nextInt();
			if (amount>10000) {
				System.out.println("withdrawn successfully"+amount);
			} else {
				System.out.println("insufficient amount");
			}
		}else {
			System.out.println("invalid pin number");
		}
		

	}

}
