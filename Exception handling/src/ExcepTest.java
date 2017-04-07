import java.io.*;

public class ExcepTest {

   public static void main(String args[]) {
   int a=10;
   int b=0;
   try{
	   int[] jaga=new int[5];
	   System.out.println(jaga[5]);
	   
	   int c=a/b;
	   System.out.println(c);
   }catch(ArithmeticException e){
	   
	   System.out.println("exception occured is :"+e );
	   
   }catch(ArrayIndexOutOfBoundsException e){
	   System.out.println("Exception occurred is :"+e);
   }
System.out.println("out of block");
   }
   }