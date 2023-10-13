package oops_concepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AddStringValueUsingMap {

	public static void main(String[] args) {
		Map map = new HashMap<>();
		map.put(1, "Hello");
		map.put(2, "World");
		map.put(3, "Aayushi");
		Set set = map.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			System.out.print(entry.getValue()+" ");
		}
	}
	
}
