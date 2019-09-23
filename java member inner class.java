package training;
class A
{
	void m1(){
		System.out.println("method-a");
	}
	
	class B extends A  
	{
		void m2(){
			System.out.println("method-b");
		}
	}
	
}

class Test
{
	public static void main(String[] args)
	{
		A.B ab = new A().new B();
		ab.m2();
		ab.m1();
	}
}
