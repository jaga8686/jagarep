package javafirst;

public class Trycatchtest {
		   public static void main(String args[]) {
		     int a,b,c;
		     try { 
		        // Try block to handle code that may cause exception
		        a= 0;
		        b = 62;
		        c= b/a;
		        System.out.println("Try block message");
		     } catch (ArithmeticException e) { 
		            // This block is to catch divide-by-zero error
		            System.out.println("Error: Don't divide a number by zero");
		       }
		     System.out.println("I'm out of try-catch block in Java.");
		   }
		}
