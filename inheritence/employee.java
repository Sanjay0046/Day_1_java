package inheritence;

public class employee {
	
	void fulltime(double salary) {
		System.out.println(salary);
//		System.out.println(hours);
	}
	void parttime(double salary,double hours) {
		double paidhour=salary*hours;
		System.out.println(paidhour);
		
	}
	void freelancer(double salary,double hour,double bouns) {
		double money=salary*hour+bouns;
		System.out.println(money);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee in=new employee();
		System.out.println("full time worker   :");
		in.fulltime(10000);
		
		System.out.println("half time worker  :");
		in.parttime(100, 8);
		
		System.out.println("freelancer work time  :");
		in.freelancer(1000, 10, 200);
		
	}

}
