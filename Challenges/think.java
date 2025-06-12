package Thread_concept;

class main extends Thread{
	public void run() {
//		int a=10;
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("haii hello");
	}
}

public class think {

	public static void main(String[] args) {
		main in=new main();
		in.start();
	}

}
