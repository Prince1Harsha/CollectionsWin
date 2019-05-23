package MapConcept;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		
		/* Features of Hash Map
		 * 1.Hash map is Non-synchronized i.e not thread safe, multiple threads can access and perform operations on hashmap
		 * 2.Hash map is class in collection which implements map interface and stores elements in form key value pair achieved using EntrySet
		 * 3.Hash map allows only 1null key with multiple null values
		 * 4.Performance compared to Hash table is fast since its not thread safe
		 * 5.Hash map maintains unordered storage of elements since no indexing like in list(No insertion order)  
		 * 6.Hash map doesn't allow duplicate keys
		 */

		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(0, "Selenium");
		hm.put(1, "Core Java");
		hm.put(2, "TestNG");
		hm.put(3, "POM");
		hm.put(4, "Jmeter");
		hm.put(5, "soap");
		for(int i=0;i<hm.size();i++)
		{
			System.out.println(""+hm.get(i));		
		}
		
		hm.remove(5);
		System.out.println("After removing the element map has following elements:\n"+hm);
		
		Employee emp1=new Employee("Shree",28,"QA");
		Employee emp2=new Employee("Suraj",29,"Dev");
		Employee emp3 = new Employee("Harsha",28,"Dev");
		
		HashMap<Integer,Employee> emp = new HashMap<Integer,Employee>();
		emp.put(0,emp1);
		emp.put(1,emp2);
		emp.put(2,emp3);
		
		
		for(Entry<Integer,Employee> m:emp.entrySet())
		{
			int key = m.getKey();
			Employee value = m.getValue();
			System.out.println("Employee info is:"+key);
			System.out.println("Values are:"+value.name+" "+value.age+" "+value.dept);		
		}
		
		System.out.println("********************");
		Student s1 = new Student("Shree","Harsha",123,50000.78);
		Student s2 = new Student("Suraj","Rathore",456,87000.50);
		
		
		HashMap<Integer,Student> st = new HashMap<Integer,Student>();
		st.put(0, s1);
		st.put(1, s2);
		
		for(Entry<Integer,Student> e:st.entrySet())
		{
			int key = e.getKey();
			Student values = e.getValue();
			
			System.out.println("Student details are:"+key);
			System.out.println("First Name of Student is:"+values.firstName+"\n"+"Last Name of Student is:"+values.lastName+"\n"+"Roll Number of the Student is:"+values.studentNumber+"\n"+"Fees of Student is:"+values.fees+"\n");
		}
	}

}
