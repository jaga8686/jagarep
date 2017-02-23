import java.util.*;

public class Pets {
	static ArrayList<Pet> al=new ArrayList<Pet>();
	public static List<Pet> arrayList(int i) {
		// TODO Auto-generated method stub
		Pet p=new Pet(Integer.toString(100),Integer.toString(100));
		for(int j=0; j<i;j++){
			al.add(new Pet(Integer.toString(i+100),Integer.toString(i+100)));
			//al.add(p);
		}
		return al;
	}

	public static Pet randomPet() {
		// TODO Auto-generated method stub
		return al.get((int)Math.ceil((Math.random()*al.size())-1));
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		ListIterator<Pet> l= al.listIterator();
//		StringBuffer sb= new StringBuffer();
//		sb.append("id :")
		System.out.println(al.toString());
		return al.toString();
	}

}