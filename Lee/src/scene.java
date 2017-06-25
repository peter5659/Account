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
			System.out.println("1. 꽃입력 2.입력완료\n");
			int choose=scanner.nextInt();
			if(choose==1){
				while(true){
					System.out.println("1.장미 2.코스모스 3.해바라기\n");
					for(int i=0;i<5;i++){
						System.out.println("rose:"+rose[i][0]);
					}
					int whichflower=scanner.nextInt();
					if(whichflower==1){
						if(p>=5){
							System.out.println("저장 공간이 부족합니다.\n");
							break;
						}
						else{
							rose[p][0]=p+1;
							rose[p][1]=4;
							System.out.println("장미개수:"+(p+1));
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
					System.out.println("오늘은 "+date+"일 입니다.\n");
					for(i=0;i<p-1;i++){
						if(rose[i][1]==4){
							System.out.println("오늘은"+rose[i][0]+"번째 rose에 물을 주는 날입니다.");
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
				System.out.println("잘못 누르셨습니다.");
				break;
			}
		}
	}
}
