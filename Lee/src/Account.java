
public abstract class Account{
		private double balance;
		/*Account(double a){
			setBalance(a);
		}*/
		public void credit(double a){
			if(a<0){
				System.out.println("�ԱݺҰ��ݾ�");
				return ;
			}
			else{
				balance+=a;
			}
		}
		public void debit(double a){
			if(a<0){
				System.out.println("��ݺҰ��ݾ�");
				return ;
			}
			else{
				balance-=a;
			}
			if(a>getBalance()){
				balance+=a;
				System.out.println("����Ϸ��� �ݾ��� �ܾ׺��� Ů�ϴ�.");
			}	
		}
		public void setBalance(double a){
			balance=a;
		}
		public double getBalance(){
			return balance;
		}
		public abstract double getWithdrawableAccount();
		public abstract double passTime(int month);
}

