
public abstract class Account {
	protected double balance;
	public double getBalance(){
		return balance;
	}
	public void debit(double a){
		balance-=a;
		if(balance<a){
			System.out.println("�ܰ� �����ϴ�!");
		}
		if(a<0){
			System.out.println("�׷� �ݾ��� �ȵſ�!");
			balance+=a;
		}
	}
	protected void setBalance(double a){
		balance=a;
	}
	public void credit(double a){
		balance+=a;
		if(a<0){
			System.out.println("�׷� �ݾ��� �ȵſ�!");
			balance-=a;
		}
	}
	public abstract double getWithdrawableAccount();
	public abstract double passTime(int m);
}
