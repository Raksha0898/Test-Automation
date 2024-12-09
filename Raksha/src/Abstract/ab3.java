package Abstract;
interface PM
{
	public abstract void pay();
	
}
class Credit implements PM
{
	public void pay()
	{
		System.out.println("Credit");
	}
}
class Debit implements PM
{
	public void pay()
	{
		System.out.println("Debit");
	}
}
class COD implements PM
{
	public void pay()
	{
		System.out.println("cod");
	}
}
class UPI
{
	static void gp(PM p)
	{
		p.pay();
	}
}
public class ab3 
{
	public static void main(String[] args) 
	{
	 Credit c=new Credit();
	 Debit d=new Debit();
	 COD co=new COD();
	 UPI.gp(c);
	 UPI.gp(co);
	 UPI.gp(d);
		// TODO Auto-generated method stub

	}

}
