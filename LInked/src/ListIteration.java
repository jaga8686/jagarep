	import java.util.*;
	public class ListIteration 
	{
		public static void main(String[] args) 
		{
			List<Pet> pets = Pets.arrayList(7);
			ListIterator<Pet> it = pets.listIterator();
				while(it.hasNext())
				{
					Pet p= it.next();
					System.out.print(p.id() + ", " +p.getName()+ ", " + it.nextIndex() +
							", " + it.previousIndex() + "; ");
				}
				System.out.println();
				// Backwards:
				while(it.hasPrevious())
					System.out.print(it.previous().id() + " ");
				System.out.println();

				it.next().id="500";
				System.out.println(pets);
				it = pets.listIterator(3);		
				while(it.hasNext()) {
					it.next();
					it.set(Pets.randomPet());
				}
				System.out.println(pets);
		}
	}
