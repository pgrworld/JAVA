package pentakota;
class A
{
	void m1(){
		System.out.println("class-a");
	}
}

class B extends A
{
	void m2(){
		System.out.println("class-b");
	}
}

class Test
{
	public static void main(String[] args)
	{
		
		B b = new B();
		b.m1();
		b.m2();
		A a =b;
		a.m1();
	}
}
