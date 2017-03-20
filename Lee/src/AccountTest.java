import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		double acc1=50.00;
		double acc2=0.00;
		Account account1=new Account(acc1);
		Account account2=new Account(acc2);
		System.out.println("account1 balance:$"+(double)acc1);
		System.out.println("account2 balance:$"+(double)acc2);
		while(true){
			System.out.println("Enter withdrawal amount for account1:");
			Scanner sc=new Scanner(System.in);
			double money=sc.nextDouble();
			account1.minus(acc1, money);
			if(acc1<0){
				System.out.println("Debit amount exceeded account balance ");
				break;
				} 
			System.out.println("substracting "+money+"from account1 balance");
			
		}
	}
}

