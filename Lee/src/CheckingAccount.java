public class CheckingAccount extends Account{
	private double credit_limit;
	private double interest=1.01;
	private double loan_interest=1.07;
	CheckingAccount(double b,double cl,double interest, double li){
		super(b);
		this.interest=interest;
		credit_limit=cl;
		loan_interest=li;
	}
	
	public void debit(double a){
		if(getBalance()-a<0){
			System.out.println("�ܾ��� �����ϴ�.");
		}
		if(getBalance()-a<credit_limit){
			System.out.println("��� ������ �ݾ��� �Ѿ����ϴ�.");
			setBalance(getBalance()+a);
		}
		setBalance(getBalance()-a);
	}
	public void nextMonth(){
		if(getBalance()>0){
			setBalance(getBalance()*interest);
		}
		else{
			setBalance(getBalance()*loan_interest);
		}
	}
}
