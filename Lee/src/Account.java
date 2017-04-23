/*
  <첫번째실습> 
 public class Account{
 
		private double balance;
		public Account(double a){
			setBalance(a);
		}
		public void credit(double a){
			if(a<0){
				System.out.println("입금불가금액");
				return ;
			}
			else{
				balance+=a;
			}
		}
		public void debit(double a){
			if(a<0){
				System.out.println("출금불가금액");
				return ;
			}
			else{
				balance-=a;
			}
			if(a>getBalance()){
				balance+=a;
				System.out.println("출금하려는 금액이 잔액보다 큽니다.");
			}	
		}
		public void setBalance(double a){
			balance=a;
		}
		public double getBalance(){
			return balance;
		}
}

*/
public class Account{
		private double balance;
		public Account(double a){
			setBalance(a);
		}
		public void credit(double a){
			if(a<0){
				System.out.println("입금불가금액");
				return ;
			}
			else{
				balance+=a;
			}
		}
		public void debit(double a){
			if(a<0){
				System.out.println("출금불가금액");
				return ;
			}
			else{
				balance-=a;
			}
			if(a>getBalance()){
				balance+=a;
				System.out.println("출금하려는 금액이 잔액보다 큽니다.");
			}	
		}
		public void setBalance(double a){
			balance=a;
		}
		public double getBalance(){
			return balance;
		}
}

