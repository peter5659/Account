
public class CheckingAccount extends Account{
	int month;
	double interest;
	double credit_limit;
	double loanInterest;
	public double getWithdrawableAccount(){
		if(getBalance()<-1*credit_limit){
			System.out.println("더이상 출금할 수 없다.");
		}
		return -1*(getBalance()-credit_limit);
	}
	public double passTime(int m){
		month=m;
		setBalance(getBalance()*Math.pow(1+interest, month));
		return getBalance();
	}
	CheckingAccount(double a, double credit_limit, double interest,double loanInterest){
		setBalance(a);
		this.credit_limit=credit_limit;
		this.interest=interest;
		this.loanInterest=loanInterest;
	}
}
