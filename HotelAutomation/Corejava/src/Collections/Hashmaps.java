package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Hashmaps {

	public static void main(String[] args) {
		HashMap<Integer,String> hmap = new HashMap<Integer,String>();
		
		hmap.put(12,"Ala");
		hmap.put(2,"Hola");
		hmap.put(4,"Wer");
		hmap.put(6,"Qaz");
		
		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();
		
		while(iterator.hasNext())
		{
			
		}
	}

}
