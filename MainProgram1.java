class Watch1
{
int a=8;
void time()
	{
System.out.println("all clock shows ttime");
	}	
}
class Watch2 extends Watch1
{
	void clock()
	{
		System.out.println("CLOCK ARE OF MANY TYPE");
	}
}
class Program1
{ 
	void execute(Watch1 ref)
	{
		System.out.println( ref.a);
		ref.time();
}
}
class MainProgram1 
{
	public static void main(String[] args) 
	{
		System.out.println("Start of Java Code");
		Program1 p1=new Program1();
		p1.execute(new Watch2());//upcasting
		System.out.println(" End oof Java Code");


	}
}
