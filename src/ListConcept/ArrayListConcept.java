package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) 
	{
		Employee emp1=new Employee("Harsha",28,35000);
		Employee emp2=new Employee("Shree",38,45000);
		Employee emp3=new Employee("Veera",22,55000);

		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		
		Iterator<Employee> it = al.iterator();
		while(it.hasNext())
		{
			Employee emp = it.next();
		
		}
		
		ArrayList<Integer> ali = new ArrayList<Integer>();
		ali.add(1000);
		ali.add(2000);
		ali.add(3000);
		System.out.println("Elements of Array List are:");
		for(int i=0;i<ali.size();i++)
		{
			System.out.println(""+ali.get(i));
		}
		
		System.out.println("*************************");
		
		ArrayList<String> als = new ArrayList<String>();
		als.add("Shree");
		als.add("Harsha");
		als.add("Suraj");
		for(int i=0;i<als.size();i++)
		{
			System.out.println(""+als.get(i));
		}
		
		System.out.println("*****************");
		ArrayList<Integer> ali2 = new ArrayList<Integer>();
		ali2.add(5000);
		ali2.add(6000);
		ali2.add(7000);
		System.out.println("Elements of Array List are:");
		for(int i=0;i<ali2.size();i++)
		{
			System.out.println(""+ali2.get(i));
		}
		
		System.out.println("---------------------------------");
		ali.addAll(ali2);
		for(int i=0;i<ali.size();i++)
		{
			System.out.println(""+ali.get(i));
		}	}

}
