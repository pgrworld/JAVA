package training;
import java.io.*;
public class Test{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter text");
		String data1= br.readLine();
		System.out.println("Enter the same text again");
		int data2 = br.read();
		System.out.println("first entered:"+data1);
		
		
	}
}
