// acc1,acc2 ���� ������������!
public class Account {
	private double balance;
	public double getBalance(double balance){
		return balance;
	}
	public void debit(double m){
		balance-=m;
		if(m<0){
			System.out.println("�����Ϸ��� �ϴ� ���� �̻��մϴ�.");
			balance+=m;
		}
	}
	public void credit(double m){
		balance+=m;
		if(m<0){
			System.out.println("�Ա��Ϸ��� ���� �̻��մϴ�.");
			balance-=m;
		}
	}
}	

	 

