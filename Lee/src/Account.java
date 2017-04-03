
public abstract class Account {
	protected double balance;
	public double getBalance(){
		return balance;
	}
	public void debit(double a){
		balance-=a;
		if(balance<a){
			System.out.println("잔고가 없습니다!");
		}
		if(a<0){
			System.out.println("그럼 금액은 안돼요!");
			balance+=a;
		}
	}
	protected void setBalance(double a){
		balance=a;
	}
	public void credit(double a){
		balance+=a;
		if(a<0){
			System.out.println("그런 금액은 안돼요!");
			balance-=a;
		}
	}
	public abstract double getWithdrawableAccount();
	public abstract double passTime(int m);
}
