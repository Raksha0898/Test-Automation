package Abstract
interface Plant
{
	void seed();
}
class Tulsi implements Plant
{
	public void seed() 
	{
		System.out.println("Tulsi");
	}
}
class Sunflower implements Plant
{
	public void seed()
	{
		System.out.println("Sf");
	}
}
class Marigold implements Plant
{
	public void seed()
	{
		System.out.println("Mg");
	}
}
class Water 
{
	static void oxygen(Plant p)
	{
		p.seed();
		
	}
}
public class ab5 
{
	public static void main(String[] args) 
	{
     Tulsi t=new Tulsi();
     Sunflower s=new Sunflower();
     Marigold m=new Marigold();
     Water.oxygen(t);
     Water.oxygen(s);
     Water.oxygen(m);
	}

}
