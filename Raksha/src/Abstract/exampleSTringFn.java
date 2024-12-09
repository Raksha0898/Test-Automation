package Abstract;

class exampleSTringFn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s1="Java";
     String x=s1.toUpperCase();
     System.out.println(x);
     
     String s2="JAVA";
     String y=s2.toLowerCase();
     System.out.println(y);	
     
     String s3="java";
     char z=s3.charAt(0);
     System.out.println(z);
     
     String s4="javamava";
     int len=s4.length();
     System.out.println(len);
     
     String s5="java";
     String w=s5.replace('a','c');
     System.out.println(w);
     
     String s7="javamava";
     char[] ch=s7.toCharArray();
     for(int i=0;i<=ch.length-1;i++)
     {
     System.out.print(ch[i]);
	}
     System.out.println();
     for(int i=ch.length-1;i>=0;i--)
     {
     System.out.print(ch[i]);
	}
     
     System.out.println();
     String s8="java";
     boolean n=s8.contains("j");
     System.out.println(n);
    
     String s9="    ABC    ";
     String x1=s9.trim();
     System.out.println(x1);
}
}