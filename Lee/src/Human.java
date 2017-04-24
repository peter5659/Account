
public class Human implements Valuable{
	String name;
	int age;
	public Human(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String toString(){
		return String.format("Human name:"+name+"\n"+"registered age:"+age);
	}
	public double EstimateValue(int m){
		return Double.POSITIVE_INFINITY;
	}
}
