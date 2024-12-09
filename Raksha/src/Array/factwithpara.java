package Array;

class factwithpara {

	static void mul(int a,int b)
	{
		int fact=1;
		for(int i=b;i>=a;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mul(1,5);
	}

}
