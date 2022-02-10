package collections;
import java.util.concurrent.*;
import java.util.lang;

public class ConcurrentHashMapDemo {
	public static void main(String args[]) {
		
		ConccurrentHashMap<Integer, String> m= new ConcurrentHashMap<Integer, String>();
	    m.put(1, "sum");
		m.put(2, "suma");
		m.put(3, "sumanth");
		m.put(4, "suman");
		m.putIfAbsent(3,"mynmaeissuma");
		System.out.println(m);
	}

}
