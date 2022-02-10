package collections;
import java.util.ArrayList;
/*
 * 1.Type-safety: We can hold only a single type of objects in generics. It doesnt 
 */

public class ArrayListWithDiffrentDataType {
	public static void main(String[] ars) {
		ArrayList k=new ArrayList();//
		k.add(12);
		k.add("rr");
		k.add(2.6);
		//Integer.valueOf(k);
		System.out.println(k);
		
	}
	

}
