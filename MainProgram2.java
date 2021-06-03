class Program1
{
	void execute()
	{
		System.out.println(" class is being executed");
}
}
class Program2 extends Program1
{
	int a=7;
	int b=6;

void initalize()
	{
	System.out.println(a+b);
	}
void print()
	{
	System.out.println("Result is being Printed");

}
}
class Program3 extends Program2
{ 
	double res=8.9;
	
}

class MainProgram2 
{
	public static void main(String[] args) 
	{
		System.out.println("Start of Java Code");
		Program3 p1=new Program3();
		System.out.println("a is"+p1.a);
		System.out.println("b is"+p1.b);
		Program2 p2=p1;//upcasting
		p2.execute();
		p2.initalize();
		p2.print();
		Program1 p3=p2;
		p3.execute();
		System.out.println("END of Java Code");

	}
}
