package rcb;
class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  try
  {
	  int a=1/10; //throw new ArithmenticException("/by zero")
	  System.out.println(a);
  }
  catch(ArithmeticException e)
  {
	  System.out.println("handled");
    }
	}
}
  
	  

