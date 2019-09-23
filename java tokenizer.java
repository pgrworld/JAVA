package training;
import java.util.*;
class Test
{
	public static void main(String[] args)
	{
		StringTokenizer st = new StringTokenizer("HAII ANNNA HOW ARE YOU");
		System.out.println("no of tokens:"+st.countTokens());
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
}
