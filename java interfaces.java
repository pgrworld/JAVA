package pentakota;
interface I
{
	void m1();
	void m2();
	void m3();
}
class A implements I
{
	public void m1(){
		System.out.println("method-1");
	}
	public void m2(){
		System.out.println("method-2");
	}
	public void m3(){
		System.out.println("method-3");
	}
	public void m4(){
		System.out.println("method-4");
	}	
}

class Test
{
	public static void main(String[] args)
	{
		A a = new A();
		a.m1();
		a.m2();
		a.m3();
		a.m4();
	}
}

