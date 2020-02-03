package test_fb;

import java.util.ArrayList;
import java.util.Iterator;


public class collection_link {

	public static void main(String[] args)
	{
		ArrayList<String> list=new ArrayList<>();

		list.add("ide");
		list.add("webdriver");
		list.add("selenium");
		list.add("mindq");
		
		int obj_size=list.size();
		System.out.println(obj_size);
		
		boolean flag=list.remove("ide");
		System.out.println(flag);
		
		boolean cont=list.contains("selenium");
		System.out.println(cont);
		
		String itr=list.iterator().next();
		System.out.println(itr);
		 
		String get=list.get(2);
		System.out.println(get);
		
		boolean listemp=list.isEmpty();
		System.out.println(listemp);
		
		//for (int i = 0; i < list.size(); i++) 
		{
		//	String eachobj=list.get(i);
					
		//	System.out.println(eachobj);
			
		}
		
		for (String string : list) 
		{
			System.out.println(string);
			
			
		}
		Iterator<String> itre=list.iterator();
		while (itre.hasNext()) 
			{
			String obj =  itre.next();
			System.out.println(obj);
			
		}
		
		
		
		
		
		
		
	}

}
