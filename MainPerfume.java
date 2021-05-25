class Perfume
{
static String quality ="good";
String name="AXE";
static void quantity ()
	{
	System.out.println(" The Quantity is different for Different Bottle");
	}
	 void process()
	{
		 System.out.println("Processing of the perfume");
	}

}



class MainPerfume
{
	static int a=12;
	void processEnd()
	{
		System.out.println("METHODS END THERE");
	}
	public static void main(String[] args) 
	{
		System.out.println("Start Of Java Program");
		 Perfume ref=new Perfume();
		 System.out.println(ref.name);
		 System.out.println("qualty is"+Perfume.quality);
		 Perfume.quantity();
		 ref.process();
		 System.out.println(" a is"+a);
		 new MainPerfume().processEnd();
		 		System.out.println("End Of Java Program");

	}
}
