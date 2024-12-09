package Shadhi.com;

public class shadhidotcom 
{
      static void submit()throws ShadhiException
      {
	  int age=17;
	  if(age>18)
		  System.out.println("Happy Life");
	  else
		  throw new ShadhiException("Lost Life");
}
  public static void main(String[] args) 
  {
	 try
	 {
	  submit();
  }
	 catch(ShadhiException e)
	 {
		 System.out.println(e.getmsg());
	 }
  } 
}