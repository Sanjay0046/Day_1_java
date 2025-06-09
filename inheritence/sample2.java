package inheritence;

public class sample2 {
	
	
	void add_to_cart(String a,int b) {
		System.out.println(a);
		System.out.println(b);
	}
	void or(String a,int b,int c) {
		int total=b*c;
		System.out.println(total);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample2 in=new sample2();
		in.or("Categry", 2, 5);
		

	}

}
