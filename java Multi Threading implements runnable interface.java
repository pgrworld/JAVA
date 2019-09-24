package training;
class MyThread implements Runnable
{
	public void run()
	{
		for(int i =0;i<10;i++)
		{
			System.out.println("USER THREAD:"+i);
		}
	}

}

class Test
{
	public static void main(String[] args)
	{
		MyThread mt = new MyThread();
		Thread t = new Thread();
		  t.start();
		for(int i=0;i<10;i++)
		{
		System.out.println("Main Thread"+i);	
		}
		System.out.println(Thread.activeCount());
	}
}
