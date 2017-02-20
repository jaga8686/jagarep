package javafirst;
import java.util.*;
import java.io.*;
class Emp
{
	private int empno;
	private String empname;
	private String addr;
	public int days;
	public int salary;
	public int i;
	Emp(int i,String nm,String a)
	{
		empno=i;
		empname=nm;
		addr=a;
		System.out.println("**********************************************");
		System.out.println("Empno:"+empno);
		System.out.println("Empno:"+empname);
		System.out.println("Empno:"+addr);
	}
	
	public int dsg()
	{
		System.out.println("Enter the desugnation of the employee");
		System.out.println("1.Snr 2.Jnr 3.Fresher");
		Scanner s=new Scanner(System.in);
		int w=s.nextInt();
		return w;
	}
	public int attendance()
	{
		
		int pres;
		System.out.println("The no of days absent");
		
		Scanner s=new Scanner(System.in);
		int j=s.nextInt();
		System.out.println("//");
		Date d=new Date();
		int k=d.getMonth();
		if(k<=7)
		{
			k=k%2;
			if(k==0)
			{
				days=31;
			}
			else{
				days=30;
			}
			
		}
		else if(k>=8)
		{
			k=k%2;
			if(k==1)
			{
				days=31;
			}
			else{
				days=30;
			}
		}
		pres=days-j;
		return pres;
	}
	public int salary(int p,int i)
	{
		//int i;
		if(i==1)
		{
			return (p*2000);
		}
		else if(i==2)
		{
			return p*1500;
		}
		else if(i==3)
		{
			return p*900;
		}
		else{
			return -1;
		}
	}
}
public class Emp1
{
	public static void main(String[] args)
	{
		System.out.println("*********************************************************");
		for(int m=0;m<=2;m++)
		{
			System.out.println("");
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the empno,empname,addr");
		int n=sc.nextInt();
		String na=sc.next();
		String ad=sc.next();
		Emp e=new Emp(n,na,ad);
		int y=e.dsg();
		int v =e.attendance();
		System.out.println("The salary is:"+e.salary(v,y));
	}
}
		
	
		
		
		
		