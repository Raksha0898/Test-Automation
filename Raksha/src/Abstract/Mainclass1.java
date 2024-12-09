package Abstract;
interface Animal
{
	void noise();
}

class Dog implements Animal
{
	public void noise()
	{
		System.out.println("bow bow");
	}
}
class Cat implements Animal
{
	public void noise()
	{
		System.out.println("meow meow");
	}
}
class Cow implements Animal
{
	public void noise()
	{
		System.out.println("ambaa ambaa");
	}
}

class Stimulator
{
	static void ansim(Animal a)
	{
		a.noise();
	}
}
public class Mainclass1 
{
	public static void main(String[] args) 
	{
		Dog d=new Dog();
		Cat c=new Cat();
		Cow cw=new Cow();
		Stimulator.ansim(d);
		Stimulator.ansim(c);
		Stimulator.ansim(cw);
		// TODO Auto-generated method stub

	}

}
