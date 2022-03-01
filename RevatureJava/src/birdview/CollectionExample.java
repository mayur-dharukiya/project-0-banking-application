package birdview;

import java.util.*;

import sample.Animal;

public class CollectionExample {
	
	public static void main(String[] args)
	{
		
		//SingleObject obj=new SingleObject();
		
		SingleObject object=SingleObject.getInstance();
		
		object.showMessage();
		
		
		//Non-Generic
		
		ArrayList al=new ArrayList();
		al.add(10);
		al.add("10");
		al.add("Hello");
		
		String s=(String)al.get(0);
		
	
		
		ArrayList<String> list= new ArrayList<String>();
		//add elements 
	   list.add("Mango");
	   list.add("Apple");
	   list.add("Banana");
	   list.add("Grapes");
	   list.add("101");
	   //list.add(10);
	  // list.add(32);
	   
	   String s1=list.get(0);
	   
	   //remove elements
	   
	   list.remove("Grapes");
	   list.remove(1);
	   
	   
	   //second arraylist
	   
	   ArrayList<String> secondList= new ArrayList<String>();
		//add elements 
	   secondList.add("Yellow");
	   secondList.add("Red");
	   
	   list.addAll(secondList);
	   
	   list.removeAll(secondList);
	   
	   list.clear();
	   
	   System.out.println("checkig is list is empty or not"+list.isEmpty());
	  
	   
	 
	  // list.add(1);
	   
	   System.out.println(list);
	   
	   //iterate through elements
	   
	   //Traversing list through Iterator
	   
	   Iterator itr=list.iterator();
	   
	   while(itr.hasNext())
	   {
		   System.out.println("I am the current Element\t"+itr.next());
		   
	   }
	   
	   for(String fruit:list)
	   {
		   System.out.println("Using For Each Loop \t"+fruit);
	   }
	   
	   //accessing elements
	   
	   
	   System.out.println("Returning elements \t"+list.get(0));
	   
	   list.set(0, "Indian Mango");
	   
	   for(String fruit:list)
	   {
		   System.out.println("New List afer modification \t"+fruit);
	   }
	   
	//sorting arraylist
	   
	   Collections.sort(list);
	   
	   for(String fruit:list)
	   {
		   System.out.println("Sorted Array Elements \t"+fruit);
	   }
	   
	   List<Integer> list2= new ArrayList<Integer>();
	   
	   list2.add(21);
	   list2.add(11);
	   list2.add(1);
	   list2.add(101);
	   list2.add(2);
	   
	   //list2.remove(21);
	   list2.remove(2);
	   
	   //sorting 
	   
	   Collections.sort(list2);
	   
	   for(Integer number:list2)
	   {
		   System.out.println("Numeric Sorting \t"+number);
	   }
	   
	   //iterating through standard For loop
	   
	   for(int i=0;i<list2.size();i++)
	   {
		   
		   System.out.println("Using For Loop\t "+list2.get(i));
	   }
	   
	   //using ListIterator
	   
	   ListIterator<Integer> list1=list2.listIterator(list2.size());
	   
	   while(list1.hasPrevious())
	   {
		   
		   System.out.println("List Iterator \t" + list1.previous());
	   }
	   
	   //custom objects stored in ArrayList
	   
	   Animal dog=new Animal(1,"Dog");
	   Animal parrot=new Animal(2,"parrot");
	   Animal sparrow=new Animal(3,"Sparrow");
	   
	   ArrayList<Animal> am=new ArrayList<Animal>();
	   
	   am.add(sparrow);
	   am.add(parrot);
	   am.add(dog);
	   
	   Iterator it=am.iterator();
	   
	   while(it.hasNext())
	   {
		   
		   Animal all=(Animal)it.next();
		   
		   System.out.println("Custom Collection Objects\t"+all.id+"Name\t"+all.myName);
	   }
	   
	   //LinkedList
	   
	   LinkedList<String> a1=new LinkedList<String>();
	   
	   a1.add("Mayur");
	   a1.add("Alec");
	   
	   //Vector
	   
	   Vector<String> vc=new Vector<String>();
	   
	   //Stack
	   
	   Stack<String> stack=new Stack<String>();
	   
	   stack.push("Hello");
	   stack.pop();
	   
	   //Queue
	   
	   
	   PriorityQueue<String> pq=new PriorityQueue<String>();
	   
	   
	   //Set Interface
	   
	   //HashSet
	   
	   HashSet<String> hs=new HashSet<String>();
	   
	 //  LinkedHashset
	   
	   //TreeSet
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   		
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
		
		
		
		
	}

}
