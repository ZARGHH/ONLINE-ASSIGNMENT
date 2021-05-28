class Nokia
{
	void callInfo()
	{
		System.out.println("NOKIA HAS SYSTEM OF CALL ONLY");
		}
}
class Nokia1 extends Nokia
{
	void bluetooth()
	{
		System.out.println("Nokia phone has  bluetooth and use for call");
		}
}
class Nokia2 extends Nokia1
{
	void camera()
	{
		System.out.println("Nokia phone has bluetooth,camera and use for call");
	}
}

class MainMobile 
{
	public static void main(String[] args) 
	{
		 System.out.println("Start Of Java Code");
		  Nokia n1=new Nokia();
		   n1.callInfo();
		  Nokia1 n2=new Nokia1();
			 n2.bluetooth();
		  Nokia2 n3=new Nokia2();
		  n3.camera();
		 System.out.println("end  Of Java Code");

	}
}
