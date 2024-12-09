package interface1;

	abstract interface Puma
	{
	  public abstract void shoes();
	}
	abstract interface Nike extends Puma
	{
	   public abstract void bags();
	}
	class Raj_outlet implements Nike
	{
		public void shoes()
		{
			System.out.println("take shoes");
		}
		public void bags()
		{
			System.out.println("take bags");
		}
	}
class ex2
{
		public static void main(String[] args) 
		{
			Raj_outlet r=new Raj_outlet();
			r.bags();
			r.shoes();
		}
		}

