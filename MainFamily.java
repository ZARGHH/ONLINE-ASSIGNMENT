class Father
{
	void getHead()
	{
		System.out.println("Father is the head of the family");
	}
		}
		class Mother extends Father
		{
			void getWife()
			{
				System.out.println("MOTHER IS WIFE OF FATHER");
			}

		}
		class Child extends Mother
		{
			void getChild()
			{
				System.out.println("Child is the son of both father  and mother");
				}
		}




class MainFamily 
{
	public static void main(String[] args) 
	{
		System.out.println("Start Of Java Code");
		Father res1=new Father();
		res1.getHead();
		Mother res2=new Mother();
		res2.getWife();
		Child res3=new Child();
		res3.getChild();
		System.out.println("End Of Java Code");

	}
}
