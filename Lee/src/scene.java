import java.util.Scanner;

public class scene {
	public int date=1;
	void daypass(int day){
		date+=day;
	}	
	static int rose[][]=new int[5][2];
	int cosmos[]=new int[5];
	int sunflower[]=new int [5];
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int p=0;
		while(true){
			System.out.println("1. ���Է� 2.�Է¿Ϸ�\n");
			int choose=scanner.nextInt();
			if(choose==1){
				while(true){
					System.out.println("1.��� 2.�ڽ��� 3.�عٶ��\n");
					for(int i=0;i<5;i++){
						System.out.println("rose:"+rose[i][0]);
					}
					int whichflower=scanner.nextInt();
					if(whichflower==1){
						if(p>=5){
							System.out.println("���� ������ �����մϴ�.\n");
							break;
						}
						else{
							rose[p][0]=p+1;
							rose[p][1]=4;
							System.out.println("��̰���:"+(p+1));
							p=p+1;
							break;
						}
					}
					else if(whichflower==2){
						
					}
					else if(whichflower==3){
						
					}
				}
			}
			else if(choose==2){
				int date=1;
				for(int i=0;i<365;i++){
					System.out.println("������ "+date+"�� �Դϴ�.\n");
					for(i=0;i<p-1;i++){
						if(rose[i][1]==4){
							System.out.println("������"+rose[i][0]+"��° rose�� ���� �ִ� ���Դϴ�.");
						}
						//if(cosmos[i][1]==5){
							
						//}
						else{
							continue;
						}
							
					}
					date++;
					
					
				}
			}
			else{
				System.out.println("�߸� �����̽��ϴ�.");
				break;
			}
		}
	}
}
