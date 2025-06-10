package Encapsulation;

class sbiacc{
	private String Accholder;
	private int Balance;
	
	sbiacc(String Accholder,int Balance){
		this.Accholder=Accholder;
		this.Balance=Balance;
		
	}
	public String getAccholder(){
		return Accholder;
	}
	public int getBalance() {
		return Balance;
	}
	public void deposit(int dep) {
		if (Balance>0) {
			 Balance += dep;
			 System.out.println("Deposit Amount :"+dep);
			 System.out.println("Now Current Balance   :"+Balance);
		}
	}
	
	
	public void getAccholder(String Accholder) {
		this.Accholder=Accholder;
	}
	public void getBalance(int Balance) {
		this.Balance=Balance;
	}
	public void setWithdraw(int Withdraw) {
		Balance -=Withdraw;
		System.out.println("withdraw amount  :"+Withdraw);
	}
}
public class BankStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sbiacc in=new sbiacc("Jack sparrow",20000);
		System.out.println("Account Holder Name :"+in.getAccholder());
		in.getAccholder("watson");
		System.out.println("Updated Account holder  :"+in.getAccholder());
		System.out.println(in.getBalance());
		in.deposit(2000);
		System.out.println("deposit amount");
		in.setWithdraw(900);
	}

}
