import java.util.Scanner;
public class scene {
	public static void main(String[] args) {
		int choose;
		Scanner scanner=new Scanner(System.in);
		int date=1;
		System.out.println("1.���Է� 2.�Է¿Ϸ� ");
		choose=scanner.nextInt();
		if(choose==1){
			int stage=0;
			System.out.println("1.��� 2.�ڽ��� 3.�عٶ��");
			int chose;
			chose=scanner.nextInt();
			if(chose==1){
				rose r=new rose("���","������ ���",5);
				while(true){
					System.out.println("������ "+date+"���Դϴ�.");
					if((date-1)%r.getwatercycle()==0){
						System.out.println("������ ��̿� ���� �ִ� ���Դϴ�.\n");
						stage++;
						if(stage>30){
							System.out.println("���Ű� ���� ���Դϴ�.");
						}
						else if(stage>20){
							System.out.println("���� �� ���Դϴ�..");
							
						}
						else if(stage>10){
							System.out.println("���� Ʋ ���Դϴ�.");
						}
					}
					date+=1;
					if(date==365){
						break;
					}
				}
			}
			else if(chose==2){
				cosmos c=new cosmos("�ڽ���","����",7);
				while(true){
					System.out.println("������ "+date+"���Դϴ�.");
					if((date-1)%c.getwatercycle()==0){
						System.out.println("������ �ڽ��𽺿� ���� �ִ� ���Դϴ�.\n");
					}
					date+=1;
					if(date==365){
						break;
					}
				}
			}
			else if(chose==3){
				sunflower s=new sunflower("�عٶ��","��ٸ�",4);
				while(true){
					System.out.println("������ "+date+"���Դϴ�.");
					if((date-1)%s.getwatercycle()==0){
						System.out.println("������ �عٶ�⿡ ���� �ִ� ���Դϴ�.\n");
					}
					date+=1;
					if(date==32){
						break;
					}
				}
			}
		}
	}
}
	

