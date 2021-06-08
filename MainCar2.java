abstract class Bike
{
	abstract void getStart();
	abstract void getEngine();
	abstract void getStop();
}
abstract class Sample1 extends Bike
{
	void getStart()
	{
		System.out.println("PUT THE KEY IN BIKE AND START");
	}
}
abstract class Sample2 extends Sample1
{
	void getEngine()
	{
		System.out.println("WHEN THE ENGINE IS START  THE BIKE START MOVING");
}
}
class Sample3 extends Sample2
{
	void getStop()
	{
		System.out.println("WHEN BIKE START IT GO SOMWHERE AND THEN STOP");

	}
}

class MainCar2 
{
	public static void main(String[] args) 
	{
		System.out.println("START OF JAVA CODE");
		Bike d2=new Sample3();
		d2.getStart();
		System.out.println("**********************");
		d2.getEngine();
		System.out.println("**********************");
		d2.getStop();
		System.out.println("**********************");
		System.out.println("END OF JAVA CODE");
	}
}
