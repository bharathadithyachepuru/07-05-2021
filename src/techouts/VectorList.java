package techouts;

import java.util.Iterator;
import java.util.Vector;

public class VectorList {

	public static void main(String[] args) {
		
		Vector<String> v=new Vector<String>();  
		v.add(" ");  
		v.add("Hyderabad");  
		v.add("Ashish");  
		v.add("Garima");  
		Iterator<String> itr=v.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}

}
