import java.util.Scanner;
public class scene{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int roseNum=0;
		int cosmosNum=0;
		int sunflowerNum=0;
		int strawberryNum=0;
		while(true){
			System.out.println("1. ���Է� 2.�Է¿Ϸ�\n");
			int choose=scanner.nextInt();
			if(choose==1){
				while(true){             
					System.out.println("1.��� 2.�ڽ��� 3.�عٶ�� 4.���� 5.�������\n");
					int whichflower=scanner.nextInt();
					if(whichflower==1){
						if(roseNum>=1){
							System.out.println("���� ������ �����մϴ�.\n");
							break;
						}
						else{
							rose.rose[roseNum]=2;
							roseNum++;
							break;
						}
					}
					else if(whichflower==2){
						if(cosmosNum>=1){
							System.out.println("���� ������ �����մϴ�.\n");
							break;
						}
						else{
							cosmos.cosmos[cosmosNum]=3;
							cosmosNum++;
							break;
						}
					}	
					else if(whichflower==3){
						if(sunflowerNum>=1){
							System.out.println("���� ������ �����մϴ�.\n");
							break;
						}
						else{
							sunflower.sunflower[sunflowerNum]=3;
							sunflowerNum++;
							break;
						}
					}
					if(whichflower==4){
						if(strawberryNum>=1){
							System.out.println("���� ������ �����մϴ�.\n");
							break;
						}
						else{
							strawberry.strawberry[strawberryNum]=7;
							roseNum++;
							break;
						}
					}
					if(whichflower==5){
						System.out.println("�߰� �� ������ �ϰڽ��ϴ�.");
						break;
					}
				}
			}
			else if(choose==2){
				int n=100000;
				for(int i=date.getday();i<=n;i++){
					System.out.println("������"+i+"���� �Դϴ�.\n");
					if(rose.rose[0]==2){
						if((i-1)%2==0){
							System.out.println(i+" "+date.day);
							System.out.println("��̿� ���� �ּ���!\n");
						}
					}
					if(cosmos.cosmos[0]==3){
						if((i-1)%3==0){
							System.out.println("�ڽ��𽺿� ���� �ּ���!\n");
						}
					}											
					if(sunflower.sunflower[0]==3){
						if((i-1)%3==0){
							System.out.println("�عٶ�⿡ ���� �ּ���!\n");
						}
					}
					if(strawberry.strawberry[0]==7){
						if((i-1)%7==0){
							System.out.println("���⿡ ���� �ּ���!\n");
						}
					}
					date.daypass();
				}
			}
			else{
				System.out.println("�߸� �����̽��ϴ�.");
				break;
			}
		}
	}
}
