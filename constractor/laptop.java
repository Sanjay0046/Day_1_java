package constractor;

public class laptop {
	
	String name;
	String RAM;
	
	laptop(String name,String RAM){
		this.name=name;
		this.RAM=RAM;
		
	}
	
	laptop(laptop copy){
		this.name=copy.name;
		this.RAM=copy.RAM;
	}
	void display() {
		System.out.println("Laptop details  :"+" "+name+" "+RAM+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---Enter the Detials---");
		laptop in=new laptop("HP","8 GB");
		in.display();
		
		System.out.println("---Copy the lap Detials---");
		laptop in2=new laptop(in);
		in2.display();
		
		
		
		
		
	}

}
