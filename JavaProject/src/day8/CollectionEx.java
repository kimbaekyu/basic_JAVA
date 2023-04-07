package day8;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionEx {
	static void printList(LinkedList <String> I) {
		Iterator<String> iterator=I.iterator();
		
		String separator;
		while(iterator.hasNext()) {
			String e=iterator.next();
			if(iterator.hasNext())
				separator="->";
			else
				separator="\n";
			System.out.print(e+separator);
		}
	}
	public static void main(String[] args) {
		LinkedList<String> myList=new LinkedList<String>();
		myList.add("transformer");
		myList.add("starwars");
		myList.add("metrix");
		myList.add(0,"terminator");
		myList.add(2,"avatar");
		
		Collections.sort(myList);
		printList(myList);
		
		Collections.reverse(myList);
		printList(myList);
		
		int index=Collections.binarySearch(myList, "avatar")+1;
		System.out.println("Avatar index: "+index);
		
		index=Collections.binarySearch(myList, "transformer")+1;
		System.out.println("transformer index: "+index);
	}
}
