class Conditinal3 
{
	public static void main(String[] args) 
	{
		System.out.println("Start of java Program");
		int a=5, b=6, c=7;
		if(a==b && b==c && c==a)
		{
			System.out.println("Triangle is equilateral");
		}
		else if(a==b && b==c && c!=a)
		{
			System.out.println("trinagle is isocles triangle");
		}
		else if(a!=b && b!=c && c!=a)
		{
			System.out.println("Triangle is scalene");
		}
		System.out.println("END OF JAVA PROGRAM");
	}
}
