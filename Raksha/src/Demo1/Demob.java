package Demo1;

class Demob
{
public static void main(String[] args) 
		{
			try 
			{
				Demob d=null;
				System.out.println(d.hashCode());
		      }
			catch(NullPointerException e)
			{
			System.out.println("caught");
		}
	}
}
