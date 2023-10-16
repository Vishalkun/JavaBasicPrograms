package core;
 class Animal
{
	public void eat() {
		System.out.println("Animal is eating");
	}

}
 class Dog extends Animal{
	 public void bark() {
		 System.out.println("Dog is barking");
	 }
 }
public class SingleLevelInheritance {
	public static void main(String[] args) {
		Dog D = new Dog();
		D.bark();
		D.eat();
				
	}

}
