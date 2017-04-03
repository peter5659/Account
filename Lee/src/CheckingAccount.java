
public class CheckingAccount extends Account{
	private double creditLimit; //
	private double interest=1.01; //예금이자
	private double loanInterest=1.07; //대출이자
	CheckingAccount(double a,double creditLimit,double interest, double loanInterest){
		//super(balance);
		setBalance(a);
		this.interest=interest;
		this.loanInterest=loanInterest;
	}
	
	public void debit(double a){
		if(getBalance()<creditLimit){
			System.out.println("출금할 수 없습니다.");
			setBalance(getBalance()+a);
		} 
		setBalance(getBalance()-a);
	}
	public void nextmonth(){
		if(getBalance()>0){
			setBalance(getBalance()*interest);
		} else if(getBalance()<0){
			setBalance(getBalance()*interest);
		}
	}
}

