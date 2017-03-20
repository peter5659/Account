// acc1,acc2 따로 생각하지말고!
public class Account {
	private double balance;
	public double getBalance(double balance){
		return balance;
	}
	public void debit(double m){
		balance-=m;
		if(m<0){
			System.out.println("인출하려고 하는 돈이 이상합니다.");
			balance+=m;
		}
	}
	public void credit(double m){
		balance+=m;
		if(m<0){
			System.out.println("입금하려는 돈이 이상합니다.");
			balance-=m;
		}
	}
}	

	 

