package inheritence;

public class singlelevel {
	void message() {
		System.out.println("send!!!");
	}
	
}
class subclass extends singlelevel{
	void view() {
		System.out.println("receive!!!");
}
  

class main{
	public static void main(String[] args) {
		subclass in=new subclass();
//		in.display();
		in.message();
		in.view();
		
	}
}}
	


