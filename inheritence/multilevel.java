package inheritence;

public class multilevel {
	void message() {
		System.out.println("send!!!");
	}
	
}
class subclass1 extends multilevel{
	void view() {
		System.out.println("receive!!!");
    }
}
class subclass2 extends subclass1{
	void call() {
		System.out.println("speak");
	}
	
}


class main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subclass2 in=new subclass2();
		in.message();
		in.view();
		in.call();
		

	}

}
