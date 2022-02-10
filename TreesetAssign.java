package Newassign;
import java.util.Collection;

import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;


public class TreesetAssign {
	public static void main(String[] args) {
		Set<String> tree=new TreeSet<String>();
		tree.add("suma");
		tree.add("amma");
		tree.add("nanna");
		Set<String>res=((TreeSet<String>) tree).descendingSet();
		System.out.println(res);
		Iterator<String> iterator = tree.iterator();

		if (iterator != null) {

			while (iterator.hasNext()) {

				System.out.println(iterator.next());}
			}
		
		
		boolean is =tree.contains("suma");
		System.out.println(is);
		
	}

}
