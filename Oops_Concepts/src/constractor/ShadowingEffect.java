package constractor;

class Car {
	
	String name; 
	String brand;
	int price;
	String color;
	
	
	//constructor is the special type of method, name as a the class name and without any return type.
	public Car(String name,String brand,int price,String color) {
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	
	public void getCarInfo() {
		
		System.out.println("the car name :" + name);
		System.out.println("the car brand :" + brand);
		System.out.println("the car price$ :" + price);
		System.out.println("the car color :" + color);
	}
}

public class ShadowingEffect {

	public static void main(String[] args) {
		
		Car car = new Car("AUDI","s-10",1200,"white");
		
		car.getCarInfo();
	
	}

}

//Output___Before_this_keyword
//the car name :null
//the car brand :null
//the car price$ :0
//the car color :null // local values are assaigned to local varibles due to high preference.

//output_after_this.keyword
//the car name :AUDI
//the car brand :s-10
//the car price$ :1200
//the car color :white