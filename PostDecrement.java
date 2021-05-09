class PostDecrement
{
	public static void main(String[] args) 
	{
		System.out.println("Start of Java Program");
		int a=12,b=17;
			int res1=a-- +21+b--;
		System.out.println(res1);
		int res2=b-- *2+a--+ b--;
		System.out.println(res2);
		int res3=a--+b--+ --a+--b;
		System.out.println(res3);
		System.out.println("End of Jva Program");
	}
}
