package oops;

class Animal
{
	public void animalfood()
	{
		System.out.println("animalfood");
	}
}
class Dog extends Animal
{
	public void breed()
	{
		System.out.println("lab");
	}
}
class Babydog extends Dog
{
	public void babydogfeauture()
	{
		System.out.println("babydog");
		
	}
}

public class Singleinheritance {

	public static void main(String[] args) {
	Dog ob=new Dog();
	ob.animalfood();
	ob.breed();
	Babydog baby=new Babydog();
	baby.animalfood();
	baby.babydogfeauture();
	baby.breed();

	}

}
