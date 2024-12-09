package Array;

public class AlphaNumSplarray 
	{
	public static void main(String[] args) 
	{
	  String s="Hell!@.1o";
	  char[] ch=s.toCharArray();
	  String alpha="";
	  String num="";
	  String spl="";
	  for(int i=0;i<=ch.length-1;i++)
	  {
		  if(Character.isAlphabetic(ch[i]))
			  alpha=alpha+ch[i];
		  else if(Character.isDigit(ch[i]))
			  num=num+ch[i];
		  else
			  spl=spl+ch[i];
	  }
System.out.println(alpha);
System.out.println(num);
System.out.println(spl);
}

}

