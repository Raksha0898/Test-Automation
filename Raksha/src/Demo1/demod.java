package Demo1;

class demod {
     
	public static void main(String[] args) {
      try {
		int[] arr= {1,2,3,4};
      System.out.println(arr[5]);
	}
      catch(ArithmeticException e)
      {
    	System.out.println("done");  
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
    	System.out.println("done");  
      }
	}
}
	
	
	