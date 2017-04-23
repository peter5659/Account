
public class SavingAccount extends Account{
	public int month=0;
	public double interest;
	
	public void debit(double a){
		if(month>12){
			setBalance(getBalance()-a);
		} 
	}
	SavingAccount(double b,double i){
		setBalance(b);
		interest=i;
	}
	public double getWithdrawableAccount(){
		if(month<13){
			return 0.00;
		}
		else{
			return getBalance();
		}
	}
	public double passTime(int m){
		month+=m;
		if(month==12){
			setBalance(getBalance()*Math.pow(1+interest, month));
			return getBalance();
		}
		else{
			return getBalance();
		}
	}
}
