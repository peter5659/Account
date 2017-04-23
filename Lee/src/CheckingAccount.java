public class CheckingAccount extends Account{
	private double credit_limit;
	private double interest=1.01;
	private double loan_interest=1.07;
	int month=0;
	
	CheckingAccount(double b,double cl,double interest, double li){
		setBalance(b);
		this.interest=interest;
		credit_limit=cl;
		loan_interest=li;
	}
	
	public void debit(double a){
		if(getBalance()-a<0){
			System.out.println("잔액이 없습니다.");
		}
		/*if(getBalance()-a<credit_limit){
			System.out.println("출금 가능한 금액을 넘었습니다.");
			setBalance(getBalance()+a);
		}*/
		setBalance(getBalance()-a);
	}
	public double getWithdrawableAccount(){
		if(getBalance()<=(-1)*credit_limit){
			return 0.00;
		}
		double result=getBalance()+credit_limit;
		return result;
	}
	public double passTime(int m){
		month+=m;
		setBalance(getBalance()*Math.pow(1+loan_interest, month));
		return getBalance();
	}
	public boolean isBankrupted(){
		if(getBalance()<-1*credit_limit){
			System.out.println("account1 went Bankrupt!");
			return false;
		}
		else{
			return true;
		}
	}
}