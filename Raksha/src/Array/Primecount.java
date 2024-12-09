package Array;

public class Primecount {
	
     int no=5;
     int count=0;
     for(int i=1;i<=no;i++)
     {
    	 if(no%i==0)
    		 count++;
     }
     if(count==2)
     {
    	 System.out.println("it is a prime no");
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	}

}
