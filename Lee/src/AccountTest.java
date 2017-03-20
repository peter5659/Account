import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Account account1=new Account();
		Account account2=new Account();
		Scanner sc=new Scanner (System.in);
		System.out.println("account1 balance:$");
		double balance1= sc.nextDouble();
		System.out.println("account2 balance:$");
		double balance2= sc.nextDouble();
		while(true){
			System.out.println("1. debit 2. credit 3. check the balance 4. break\n");
			double choice=sc.nextInt();
			if(choice==1){
				System.out.println("1. account1 2. account2");
				double choice2= sc.nextInt();
				if(choice2==1){
					System.out.println("얼마를 인출하겠습니까?");
					double debit1=sc.nextDouble();
				} else if(choice2==2){
					System.out.println("얼마를 인출하겠습니까?");
					double debit2= sc.nextDouble();
				} 
			} else if(choice==2){
				System.out.println("1. account1 2. account2");
				double choice3= sc.nextInt();
				if(choice3==1){
					System.out.println("얼마를 입금하겠습니까?");
					double debit1=sc.nextDouble();
					account1.credit(debit1);
				} else if(choice3==2){
					System.out.println("얼마를 입금하겠습니까?");
					double debit2=sc.nextDouble();
					account2.credit(debit2);
				}
			} else {
				System.out.println("choose another number\n");
			}
		}
	}
}

