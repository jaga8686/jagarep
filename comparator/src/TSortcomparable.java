	import java.lang.Comparable;
	//comparable available in lang pack
	import java.util.*;//comparator
	//comparator available in util pack
	import java.io.*;
	class Student implements Comparable<Student>{
		int rollno;
		String name;
		int age;
		Student(int rollno,String name,int age)
		{
			this.rollno=rollno;
			this.name=name;
			this.age=age;
		}

		public int compareTo(Student st){
			if(age==st.age)
				return 0;
			else if(age>st.age)
				return 1;
			else
				return -1;
		}

	}

	public class TSortcomparable{
		public static void main(String args[]){
			
			ArrayList<Student> al=new ArrayList<Student>();
			al.add(new Student(10,"jaga",23));
			al.add(new Student(16,"sai",27));
			al.add(new Student(25,"bhargav",21));

			Collections.sort(al);
			for(Student st:al){
				System.out.println(st.rollno+" "+st.name+" "+st.age);
			}
		}
	}
	
	
