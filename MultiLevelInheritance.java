package core;
class Shape {
	   public void display() {
	      System.out.println("display");
	   }
	}
	class Rectangle extends Shape {
	   public void area() {
	      System.out.println("area");
	   }
	}
	class Cube extends Rectangle {
	   public void volume() {
	      System.out.println("volume");
	   }
	}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		Cube cube = new Cube();
	      cube.display();
	      cube.area();
	      cube.volume();
	}

}
