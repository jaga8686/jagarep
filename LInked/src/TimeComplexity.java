import java.util.ArrayList;
//import java.util.LinkedHashSet;
import java.util.LinkedList;


public class TimeComplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al= new ArrayList<Integer>();
		LinkedList<Integer> ll= new LinkedList<Integer>();
		for(int i=0;i<10001;i++){
			al.add(i);
			ll.add(i);
		}
		//Finding time taken to add element at particular index
		Long l=System.nanoTime();
		al.add(10000,200);//add(index,element)
		
		long addTimeAl=System.nanoTime()-l;
		
		l=System.nanoTime();
		ll.add(10000,200);
		long addTimeLl=System.nanoTime()-l;
		
		System.out.println((addTimeAl>addTimeLl)?"addTimeLl Time is less "+(addTimeAl-addTimeLl):"addTimeAl Time is less "+(addTimeLl-addTimeAl));
		
		//Finding time taken to random access of an element at prticular index
		 l=System.nanoTime();

			al.get(10000);
			long randomTimeAl=System.nanoTime()-l;
			l=System.nanoTime();
			ll.get(10000);
			long randomTimeLl=System.nanoTime()-l;
			
			System.out.println((randomTimeAl>randomTimeLl)?"randomTimeLl Time is less "+(randomTimeAl-randomTimeLl):"randomTimeAl Time is less "+(randomTimeLl-randomTimeAl));
		
		//Finding time taken to remove element at particular index
		 l=System.nanoTime();
		al.remove(10000);
		long removeTimeAl=System.nanoTime()-l;
		l=System.nanoTime();
		ll.remove(10000);
		long removeTimeLl=System.nanoTime()-l;
		
		System.out.println((removeTimeAl>removeTimeLl)?"removeTimeLl Time is less "+(removeTimeAl-removeTimeLl):"removeTimeAl Time is less "+(removeTimeLl-removeTimeAl));
		
			
		
	}
	

}