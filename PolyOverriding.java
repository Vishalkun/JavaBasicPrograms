package core;
class Vehicle{  
	  void run(){System.out.println("Vehicle is moving");}  
	}  
	class Car2 extends Vehicle{  
	  void run()
	  {
		  System.out.println("car is running safely");
		  }  
	  }
	  
public class PolyOverriding {

	public static void main(String[] args) {
		  Car2 obj = new Car2();
		  obj.run();
	}

}
