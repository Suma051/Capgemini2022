package Newassign;
import java.util.HashSet;
import java.util.Iterator;



public class HashSetAssign2 {
	public static void main(String[] args) {
	HashSet<String> names=new HashSet<String>();
	names.add("suma");
	names.add("heman");
	names.add("sushma");
	names.add("suman");
	names.add("suma");
	Iterator ite= names.iterator();
	if(ite != null) {
		while(ite.hasNext()) {
	
	System.out.println(ite.next());
	
	
		}
	}
}
}