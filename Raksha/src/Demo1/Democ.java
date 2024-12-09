package Demo1;

class Democ {

	public static void main(String[] args) {
		try {
   int[] arr= {1,2,3,4};
   System.out.println(arr[5]);
	}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("done");
		}
		}

}
