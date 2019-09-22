package pentakota;
interface I
{
	void m1();
	void m2();
	void m3();
   default void m5(){
		System.out.println("DEFAULT METHOD");
	}
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
		System.out.println(" ");
	}
	public void m4(){
		System.out.println("method-4");
		
		}	
}

class Test
{
	public static void main(String[] args)
	{
		I i = new A();
		i.m1();
		i.m2();
		i.m3();
		//i.m4();
		
		A a = new A();
		a.m1();
		a.m2();
		a.m3();
		a.m4();
		a.m5();
	}
}

