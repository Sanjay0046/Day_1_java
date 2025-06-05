package Java_addon;

public class operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=3;
		
		switch (b) {
		case 1:
			System.out.println(a+b);
			break;
		case 2:
			System.out.println(a-b);
			break;
		case 3:
			System.out.println(a*b);
			break;
		case 4:
			System.out.println(a/b);
			break;

		default:
			System.out.println("Enter the correct operator");
			break;
		}

	}

}
