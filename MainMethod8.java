class Method1
{
void execute()
	{
	System.out.println("METHOD 1 GOT EXECUTED");
	}
}
class Method2 extends Method1
{
void execute()
{ 
	System.out.println("METHOD 1 GOT EXECUTED");
	System.out.println("****************************");
	System.out.println("METHOD 2 GETS WHEN  METHOD 1 GET EXECUTED");
}
}


class MainMethod8
{
	public static void main(String[] args) 
	{
		System.out.println("START OF JAVA CODE");
		Method2 sc=new Method2();
		sc.execute();
		System.out.println("END OF JAVA CODE");

	}
}
