public class Client{
	public static void main(String[] args){
		Animal a= new Animal(); //will print Animal constructor, Animal a = ref of Animal
		
		Dog b=new Dog();
		//Dog constructor 
		//member functions of dog available
		a.walk();
		Animal d= new Dog();
		//Animal and Dog constructor displayed as it has super() in its code and 
		//even if it is not written explicitly, it is implemented implicitly
		d.walk();
		//d.bark not allowed as ref type if Animal
		
		Animal l=new Labrador();
		l.walk();
		//l.bark() again won't work because ref is Animal
		
		play(a);
		play(d);//ref=Animal therefore OK
		play(l);//ref=Animal
		//reason : Polymorphism
	}


public static void play(Animal animal){
	System.out.println("Playing ");
}

}
//protected members can be accessed by child class not private!!
class Animal{
	public Animal(){
		super();
		System.out.println("Animal constructor called");
	}
	public void walk(){
		System.out.println("Animal is walking");
	}
	private void run(){
		System.out.println("Animal is running");
	}
}

class Dog extends Animal{
	public Dog(){
		super();
		System.out.println("Dog constructor is called");
	}
	@Override
	//overriding the method of parent class
	public void walk(){
		System.out.println("Dog is walking");
	}
	public void bark(){
		System.out.println("Dog is barking");
	}
}

class Labrador extends Dog{
	public Labrador(){
		System.out.println("Labrador constructor called");
	}
}
