package Pas;

interface I1
{
	final int k=10;
public int add(int a,int b);
}
class Impl1 implements I1
	{	
			public int add(int c,int d)
		{
		int k=c+d;
		return k;
		}
	}
	public class I3
	{
		public static void main(String args[])
		{
			Impl1 i=new Impl1();
				int k=i.add(2,3);
				System.out.println(k);
		}
	}
