class Instagram
{
	void photo()
	{
		System.out.println("we can post only photos in Instagram");
		System.out.println("IT IS A PHOTO EDITING APP");

}
}
class Chat extends Instagram

{
	void photo()
	{
		System.out.println("we can post only photos in Instagram");
		System.out.println("IT IS A PHOTO EDITING APP");
         System.out.println("WE can chat using this appp");

}
}
class Videocall extends Chat
{ 
	void photo()
	{
		System.out.println("we can post only photos in Instagram");
		System.out.println("IT IS A PHOTO EDITING APP");
         System.out.println("WE can chat using this appp");
		 System.out.println("WE CAN DO VIDEO CALL TOO");

}
}

class MainMethod9 
{
	public static void main(String[] args) 
	{
		System.out.println("START OF JAVA CODE");
		Videocall sc=new Videocall();
		sc.photo();
		System.out.println("END OF JAVA CODE");

	}
}
