package ListConcept;

import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) 
	{
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Selenium");
		ll.add("TestNG");
		ll.add("Jmeter");
		System.out.println("Elements in the linked list are:"+ll);
		
		//2.Elements added at required index in linked list
		ll.add(1,"POM");
		System.out.println("New Element added at 1st index:"+ll);
		
		//3.Get element at specified index
		System.out.println(	ll.get(2));
		
		//4.Set element at specified index
		ll.set(2, "Postman");
		System.out.println(""+ll);
		
		//5.Remove Elements from linked list
		ll.remove(2);
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println(""+ll);
		
		ll.add("Selenium");
		ll.add("TestNG");
		ll.add("Jmeter");
		System.out.println("***********************");
		
		//6.Retrieve all the elements of linked list using for loop
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
		
		System.out.println("***********************");
		//7.Retrieve all the elements using for each loop
		for(String str:ll)
		{
			System.out.println(str);
		}
		System.out.println("*************************");
	
		String str="I am Harsha";			
	String str2= str.replaceAll("[^A-Za-z0-9]","");
	System.out.println(str2);
	}

}
