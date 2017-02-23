import java.util.*;
public class Timecomok{
	public static void main(String[] args)
	{
		
	ArrayList<Integer>  al = new ArrayList<Integer>();
al.add(3);
al.add(2);		
al.add(1);
al.add(4);
al.add(5);
al.add(6);
al.add(6);
Iterator iter1 = al.iterator();
while(iter1.hasNext()){
	System.out.println(iter1.next());
}
 
long startTime = System.nanoTime();
 
for (int i = 0; i < 100000; i++) {
	al.add(i);
}
long endTime = System.nanoTime();  
long duration = endTime - startTime;
System.out.println("ArrayList add:  " + duration);
 startTime = System.nanoTime();
 
for (int i = 0; i < 10000; i++) {
	al.get(i);
}
endTime = System.nanoTime();
duration = endTime - startTime;
System.out.println("ArrayList get:  " + duration);
 startTime = System.nanoTime();
 
for (int i = 9999; i >=0; i--) {
	al.remove(i);
}
endTime = System.nanoTime();
duration = endTime - startTime;
System.out.println("ArrayList remove:  " + duration);
	}
}

 