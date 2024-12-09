package Abstract;
interface Esanjeevani
{
	public abstract void opd();
}
class Derma implements Esanjeevani
{
      public void opd()
      {
    	  System.out.println("Derma");
      }
}
class Neuro implements Esanjeevani
{
      public void opd()
      {
    	  System.out.println("Neuro");
      }
}
class Ortho implements Esanjeevani
{
      public void opd()
      {
    	  System.out.println("Ortho");
      }
}
class Tc
{
	static void online(Esanjeevani e)
	{
		e.opd();
	}
}
public class ab2 
{
	public static void main(String[] args) 
	{
		Derma d=new Derma();
		Neuro n=new Neuro();
		Ortho o=new Ortho();
		Tc.online(d);
		Tc.online(n);
		Tc.online(o);
		// TODO Auto-generated method stub

	}

}
