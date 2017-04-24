
public class Car implements Valuable{
	String name;
	double price;
	int month=0;
	public Car(String name,double price){
		this.name=name;
		this.price=price;
	}
	public String toString(){
		return String.format("car name:"+name+"initial price:"+price);
	}
	public double EstimateValue(int m){
		month+=m;
		return price*0.8*Math.pow(0.99, month);
	}
}
