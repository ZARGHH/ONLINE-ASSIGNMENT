class  Decrement
{
	public static void main(String[] args) 
	{
		System.out.println("START OF JAVA PROGRAM");
		int a=5;
		int b=7;
			int res=--a+5;
		System.out.println(res);
		System.out.println(a);

		int res2=a--+--a;
		System.out.println(res2);

int res3=--a+a--+4;
System.out.println(res3);

int res4=++a + ++b + --a + --b;
System.out.println(res4);
System.out.println("end of java program");
}
}