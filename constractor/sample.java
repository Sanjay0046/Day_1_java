package constractor;

public class sample {
	String language;
	String name;
	int num;

	
	sample(String name,int num) {
		this.name=name;
		this.num=num;
		this.language=language;
	}
		public sample(sample copy) {
			this.name=copy.name;
			this.num=copy.num;
			this.language=copy.language;
		
	}
		void Display() {
		System.out.println("user define  :"+" "+name+" "+num+" "+"language"+" ");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----original constractor----");
		
		sample ref=new sample("java",2005);
		ref.Display();
		
		// copy constactor
		System.out.println("----Copy constractor----");
		sample ref2=new sample(ref);
		ref2.Display();

	}

}
