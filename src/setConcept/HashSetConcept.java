package setConcept;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetConcept 
{
	public static void main(String[] args)
	{
		HashSet<String> hs = new HashSet<String>();
		hs.add("Java");
		hs.add("Java");
		hs.add("C");
		
		System.out.println(hs);
		
		Iterator<String> it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("************");
		hs.remove("C");
		System.out.println(hs);
		
		System.out.println("**************");
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("Me");
		System.out.println(lhs);
		lhs.remove("Me");
		System.out.println(lhs);
		
		
		System.out.println("**************");		
	TreeSet<Integer> ts = new TreeSet<Integer>();
	ts.add(100);
	ts.add(50);
	ts.add(200);
	System.out.println(ts);
	System.out.println("***************");
	
	Iterator<Integer> ite = ts.iterator();
	while(ite.hasNext())
	{
		System.out.println(ite.next());
	}
	
	}
}
