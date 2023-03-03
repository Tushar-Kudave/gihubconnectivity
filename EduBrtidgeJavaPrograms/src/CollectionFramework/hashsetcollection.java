package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class hashsetcollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>(); // no duplicate value - single entry
		hs.add("Tushar");
		hs.add("Siddhant");
		hs.add("Kshitij");
		hs.add("Siddhant");
		System.out.println(hs);
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
