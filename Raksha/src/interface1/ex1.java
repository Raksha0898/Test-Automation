package interface1;

abstract interface Demo
{
	public abstract void cool();
	public abstract void disp();
}
class Sample implements Demo
{
	public void cool()
	{
		System.out.println("take shoes");
	}
    public void disp()
    {
    	System.out.println("take bags");
    }
    class ex1
    {
	public static void main(String[] args) 
	{
		Sample s=new Sample();
		s.cool();
		s.disp();
	}
  }
}


