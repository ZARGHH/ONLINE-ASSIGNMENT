class Sample1
{
	void select()
	{
		System.out.println("Select the option");
	}

}
class Sample2 extends Sample1
{
	void initialize()
	{
		System.out.println("option get initailized");
	}
	void start()
	{
		System.out.println(" Process get start");
	}
}
class Sample3 extends Sample2
{
	void end()
	{
		System.out.println("process end here");
	}
}
class Program
{
	void getStart(Sample1 e1)
	{
		System.out.println("Getstart method start here");
		e1.select();
		System.out.println("Getstart  method end here");
	}
	void getProcess(Sample2 e2)
	{
		System.out.println("GetProcess method start here");
		e2.select();
		e2.initialize();
		e2.start();
		System.out.println("GetProcess method ends here");
	}
	void processEnd( Sample3 e3)
	{
		System.out.println("ProcessEnd method start here");
		e3.select();
		e3.initialize();
         e3.start();
		e3.end();
		System.out.println("ProcessEnd method end here");
}
}
class MainProgram 
{
	public static void main(String[] args) 
	{
		System.out.println("Start of Java Program");
		Program p1=new Program();
         p1.processEnd( new Sample3());//same class
		 System.out.println("*************************");
		p1.getProcess(new Sample2());//same class
		p1.getProcess(new Sample3());//sub class -upcasting
	    System.out.println("*************************");
		p1.getStart(new Sample1());//same class
		p1.getStart(new Sample2());//sub class up casting
		p1.getStart(new Sample3());//sub class up casting
       System.out.println("*************************");
	    System.out.println("End Of Java Code");
	}
}
