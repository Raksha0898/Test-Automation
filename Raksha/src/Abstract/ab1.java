package Abstract;
interface Car
{
	public abstract void speed();
}
class Maruthi implements Car
{
	public void speed()
	{
		System.out.println("Hey");
	}
}
class Creta implements Car
{
	public void speed()
	{
		System.out.println("Hi");
	}
}
class Scorpio implements Car
{
	public void speed()
	{
		System.out.println("Hello");
	}
}
class Accelator
{
	static void brake(Car c)
	{
		c.speed();
	}
}
public class ab1 
{
	public static void main(String[] args) 
	{
		Maruthi m=new Maruthi();
		Creta c=new Creta();
		Scorpio s=new Scorpio();
		Accelator.brake(m);
		Accelator.brake(c);
		Accelator.brake(s);

	}

}
