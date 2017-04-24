
public class ValuableTest {
	public static void main(String[] args) {
		Valuable[] objectList=new Valuable[4];
		Car c1=new Car("Mycar",5000);
		Human h1=new Human("Mark",20);
		CheckingAccount ca1=new CheckingAccount(100,50,0.01,0.07);
		SavingAccount s1=new SavingAccount(100,0.05);
		objectList[0]=ca1;
		objectList[1]=s1;
		objectList[2]=h1;
		
		objectList[3]=c1;
		
		for(int i=0;i<objectList.length;i++){
			System.out.println(objectList[i]);
			System.out.println("6 months later Valuable:"+objectList[i].EstimateValue(6));
		}
	}



}
