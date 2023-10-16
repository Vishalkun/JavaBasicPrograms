package core;
abstract class Animal1 {
	  public abstract void animalSound();
	  public void sleep() {
	    System.out.println("Zzz");
	  }
	}

	class Pig extends Animal1 {
	  public void animalSound() {
	    System.out.println("The pig says: wee wee");
	  }
	}
public class Abstraction {

	public static void main(String[] args) {
		Pig myPig = new Pig(); 
	    myPig.animalSound();
	    myPig.sleep();

	}

}
