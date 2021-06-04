class Sample1
{
	void run()
	{
		System.out.println("ALLEN IS RUNNING");
	}
}
class Sample2 extends Sample1
{
	void Stoppage()
	{
		System.out.println("ALLEN STOPPED AT A BUS STOP");
	}
}
class Sample3 extends Sample2
{
	void stop()
	{
		System.out.println("ALLEN STOPPED AND REACHED HOME");
	}
}

class MainClass 
{
	public static void main(String[] args) 
	{
		System.out.println("START OF JAVA CODE");
		Sample1 sc1=new Sample3();//upcasting sub class
		sc1.run();
		System.out.println("***************************");
          Sample2 sc2=(Sample2)sc1;
	       sc2.run();
          sc2.Stoppage();
		System.out.println("***************************");
		Sample3 sc3=(Sample3)sc2;
		sc3.run();
		sc3.Stoppage();
		sc3.stop();
		System.out.println("***************************");
		System.out.println("END OF JAVA CODE");



	}
}
