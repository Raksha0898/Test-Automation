package Array;

class Factwithreturntype {
	
	static int mul()
	{
		int no=5;
		int fact=1;
		for(int i=no;i>=1;i--)
		{
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(mul());
	}

}
