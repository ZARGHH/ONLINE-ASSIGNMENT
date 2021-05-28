class Vehicle
{
	String name;
	double milage;
	String quality;
	double cost;
	Vehicle()//zero argument constructor started
	{ 
		name="Maruti";
		milage=80.5;
		quality="Goodd";
		cost=200000.7879;
	}

}

class MainVehicle 
{
	public static void main(String[] args) 
	{
		System.out.println("Start of Java code");
		Vehicle s1=new Vehicle();
		System.out.println("name is"+s1.name);
		System.out.println("Milage is"+s1.milage);
		System.out.println("Quality is"+s1.quality);
		System.out.println("Cost is"+s1.cost);
		System.out.println("**************************");
       Vehicle s2=new Vehicle();
        System.out.println("name is"+s2.name);
		System.out.println("Milage is"+s2.milage);
		System.out.println("Quality is"+s2.quality);
		System.out.println("Cost is"+s2.cost);
		System.out.println("**************************");
		Vehicle s3=new Vehicle();
		 System.out.println("name is"+s3.name);
		System.out.println("Milage is"+s3.milage);
		System.out.println("Quality is"+s3.quality);
		System.out.println("Cost is"+s3.cost);
		System.out.println("**************************");
		System.out.println(" end of java code");



	}
}
