package training;
interface I
{
	static void m1(){
		System.out.println("interface method");
	}
}

class Test
{
	public static void main(String[] args)
	{
		I.m1();
	}
}

