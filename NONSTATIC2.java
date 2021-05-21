class Object2
{
	String s="ZARGHAM";
	char ch='M';
	
}


class NONSTATIC2 
{
	public static void main(String[] args) 
	{
		System.out.println("START OF JAVA PROGRAM");
		Object2 dr=new Object2();
		System.out.println("s is"+new Object2().s);
		dr.s="ZAIMY";
		System.out.println(" new  value of s"+dr.s);
		new Object2().s="SHAZI";
		System.out.println("s is"+new Object2().s);
		new Object2().ch='F';
		System.out.println("GENDER is"+new Object2().ch);
		System.out.println("s is"+new Object2().s);
		System.out.println("END OF JAVA CODE");


	}
}
