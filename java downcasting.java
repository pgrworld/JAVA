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
		A a = new B();
		B b = (B)a;
		b.m1();
		b.m2();
	}
}
