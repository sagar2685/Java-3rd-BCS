package bcs3rd;
class Animal{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
void bark(){System.out.println("barking...");}  
}  
class Cat extends Animal{  
void meow(){System.out.println("meowing...");}  
}  
public class add {
	public static void main(String[] args) {
		// heirarchical inheritance
		Cat c=new Cat();  
		Dog d = new Dog();
		c.meow();  
		c.eat();  
		d.bark();
		d.eat();
		
		}}  