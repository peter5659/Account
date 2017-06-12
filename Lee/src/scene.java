import java.util.Scanner;
public class scene {
	public static void main(String[] args) {
		int choose;
		Scanner scanner=new Scanner(System.in);
		int date=1;
		System.out.println("1.꽃입력 2.입력완료 ");
		choose=scanner.nextInt();
		if(choose==1){
			int stage=0;
			System.out.println("1.장미 2.코스모스 3.해바라기");
			int chose;
			chose=scanner.nextInt();
			if(chose==1){
				rose r=new rose("장미","정열의 사랑",5);
				while(true){
					System.out.println("오늘은 "+date+"일입니다.");
					if((date-1)%r.getwatercycle()==0){
						System.out.println("오늘은 장미에 물을 주는 날입니다.\n");
						stage++;
						if(stage>30){
							System.out.println("열매가 맺힐 때입니다.");
						}
						else if(stage>20){
							System.out.println("꽃이 필 때입니다..");
							
						}
						else if(stage>10){
							System.out.println("싹이 틀 때입니다.");
						}
					}
					date+=1;
					if(date==365){
						break;
					}
				}
			}
			else if(chose==2){
				cosmos c=new cosmos("코스모스","순정",7);
				while(true){
					System.out.println("오늘은 "+date+"일입니다.");
					if((date-1)%c.getwatercycle()==0){
						System.out.println("오늘은 코스모스에 물을 주는 날입니다.\n");
					}
					date+=1;
					if(date==365){
						break;
					}
				}
			}
			else if(chose==3){
				sunflower s=new sunflower("해바라기","기다림",4);
				while(true){
					System.out.println("오늘은 "+date+"일입니다.");
					if((date-1)%s.getwatercycle()==0){
						System.out.println("오늘은 해바라기에 물을 주는 날입니다.\n");
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
	

