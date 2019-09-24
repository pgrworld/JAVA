package clientapp;
import java.io.*;
import java.net.*;
public class clientApp
{
	public static void main(String[] args)
	{
		Socket s = new Socket("localhost",4444);
		OutputStream os = s.getOutputStream();
		PrintStream ps = new PrintStream(os);
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
		InputStream is= s.getInputStream();
		BufferedReader br2 = new BufferedReader(new InputStreamReader(is));
		
		while(true)
		{
			String data1 = br1.readLine();
			ps.println(data1);
			String data2= br2.readLine();
			System.out.println(data2);
			if(data1.equals("bye")&& data2.equals("bye"))
					{
				    System.exit(0);
					}
			
		}
		
	}
}
