import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Account account1=new Account(50.00);
		Account account2=new Account(0.00);
		Scanner sc=new Scanner(System.in);
		System.out.println("account1 balance:"+account1.getBalance()+"\n"+
				"account2 balance:"+account2.getBalance());
		while(true){
			int choose;
			double b;
			System.out.println("1. 입금, 2. 출금, The others:종료");
			System.out.println("choose:");
			choose= sc.nextInt();
			if(choose==1){
				System.out.println("1. account1 2. account2");
				int chose=sc.nextInt();
				if(chose==1){
					System.out.println("How much?");
					b=sc.nextDouble();
					account1.credit(b);
					System.out.println("account1 balance:"+account1.getBalance()+"\n"+
							"account2 balance:"+account2.getBalance());
				}
				else if(chose==2){
					System.out.println("How much?");
					b=sc.nextDouble();
					account2.credit(b);
					System.out.println("account1 balance:"+account1.getBalance()+"\n"+
							"account2 balance:"+account2.getBalance());
				}
				else{
					break;
				}
			}
			else if(choose==2){
				System.out.println("1. account1 2. account2");
				int chose=sc.nextInt();
				if(chose==1){
					System.out.println("How much?");
					b=sc.nextDouble();
					account1.debit(b);
					System.out.println("account1 balance:"+account1.getBalance()+"\n"+
							"account2 balance:"+account2.getBalance());
				}
				else if(chose==2){
					System.out.println("How much?");
					b=sc.nextDouble();
					account2.debit(b);
					System.out.println("account1 balance:"+account1.getBalance()+"\n"+
							"account2 balance:"+account2.getBalance());
				}
				else{
					break;
				}
			}
			else{
				System.out.println("잘못누르셨습니다.");
				break;
			}
		}
	}
}
