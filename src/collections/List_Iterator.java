package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List_Iterator {

	public static void main(String[] args) {
		List<Object> mylist = new ArrayList<Object>();
		mylist.add(23);
		mylist.add(24);
		mylist.add(25);
		mylist.add(26);
		mylist.add(27);
		ListIterator<Object> lit = mylist.listIterator();
		{
			while(lit.hasNext())
			{
				if(lit.next()==(Object)24) {
					lit.remove();
					
				}
				System.out.println(lit.next());
			}
		}
	}
}
