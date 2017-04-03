import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("credit_limit:");
		double credit=sc.nextDouble();
		
		CheckingAccount a1=new CheckingAccount(100,credit,1.01,1.07);
		CheckingAccount a2=new CheckingAccount(100,credit,1.01,1.07);
		while(true){
			System.out.println("1.deposit 2.withdrawal 3.nextmonth");
			double choose=sc.nextInt();
			if(choose==1){
				System.out.println("1.Account1 2.Account2");
				double choose2=sc.nextInt();
				if(choose2==1){
					System.out.println("how much?");
					double money=sc.nextDouble();
					a1.debit(money);
				} else if(choose2==2){
					System.out.println("how much?");
					double money=sc.nextDouble();
					a2.debit(money);
				}
				System.out.println("Account1 balance:"+a1.getBalance());
				System.out.println("Account2 balance:"+a2.getBalance());
			}
			if(choose==2){
				System.out.println("1.Account1 2.Account2");
				double choose2=sc.nextInt();
				if(choose2==1){
					System.out.println("how much?");
					double money=sc.nextDouble();
					a1.credit(money);
				} else if(choose2==2){
					System.out.println("how much?");
					double money=sc.nextDouble();
					a2.credit(money);
				}
				System.out.println("Account1 balance:"+a1.getBalance());
				System.out.println("Account2 balance:"+a2.getBalance());
			}
			if(choose==3){
				a1.nextmonth();
				a2.nextmonth();
				System.out.println("next month!");
				System.out.println("Account1 balance:"+a1.getBalance());
				System.out.println("Account2 balance:"+a2.getBalance());
			}
		}
		
	}
}
