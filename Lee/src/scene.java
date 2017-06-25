import java.util.Scanner;
public class scene{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int roseNum=0;
		int cosmosNum=0;
		int sunflowerNum=0;
		int strawberryNum=0;
		while(true){
			System.out.println("1. 꽃입력 2.입력완료\n");
			int choose=scanner.nextInt();
			if(choose==1){
				while(true){             
					System.out.println("1.장미 2.코스모스 3.해바라기 4.딸기 5.여기없음\n");
					int whichflower=scanner.nextInt();
					if(whichflower==1){
						if(roseNum>=1){
							System.out.println("저장 공간이 부족합니다.\n");
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
							System.out.println("저장 공간이 부족합니다.\n");
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
							System.out.println("저장 공간이 부족합니다.\n");
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
							System.out.println("저장 공간이 부족합니다.\n");
							break;
						}
						else{
							strawberry.strawberry[strawberryNum]=7;
							roseNum++;
							break;
						}
					}
					if(whichflower==5){
						System.out.println("추가 해 놓도록 하겠습니다.");
						break;
					}
				}
			}
			else if(choose==2){
				int n=100000;
				for(int i=date.getday();i<=n;i++){
					System.out.println("오늘은"+i+"일차 입니다.\n");
					if(rose.rose[0]==2){
						if((i-1)%2==0){
							System.out.println(i+" "+date.day);
							System.out.println("장미에 물을 주세요!\n");
						}
					}
					if(cosmos.cosmos[0]==3){
						if((i-1)%3==0){
							System.out.println("코스모스에 물을 주세요!\n");
						}
					}											
					if(sunflower.sunflower[0]==3){
						if((i-1)%3==0){
							System.out.println("해바라기에 물을 주세요!\n");
						}
					}
					if(strawberry.strawberry[0]==7){
						if((i-1)%7==0){
							System.out.println("딸기에 물을 주세요!\n");
						}
					}
					date.daypass();
				}
			}
			else{
				System.out.println("잘못 누르셨습니다.");
				break;
			}
		}
	}
}
