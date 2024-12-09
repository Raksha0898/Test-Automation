package Abstract;
interface Sample
{
	void shape();
}
class Circle implements Sample
{
	public void shape()
	{
		System.out.println("circle");
	}
}
class Triangle implements Sample
{
	public void shape()
	{
		System.out.println("triangle");
	}
}
class Rectangle implements Sample
{
	public void shape()
	{
		System.out.println("rect");
	}
}
class Artist
{
	static void art(Sample s)
	{
		s.shape();
	}
}
public class ab4 
{
	public static void main(String[] args) 
	{
		Circle c=new Circle();
		Triangle t=new Triangle();
		Rectangle r=new Rectangle();
		Artist.art(c);
		Artist.art(t);
		Artist.art(r);
		// TODO Auto-generated method stub

	}

}
