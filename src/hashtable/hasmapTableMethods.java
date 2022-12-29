package hashtable;

import java.util.Hashtable;

public class hasmapTableMethods {

	public static void main(String[] args) {
		Hashtable<Integer, String> h = new Hashtable<Integer, String>();
		h.put(1, "praveen");
		h.put(2, "kiran");
		h.put(4, "so");
		h.put(5, "po");
		h.put(7, "ko");
		System.out.println(h);
		System.out.println(h.get(2));
		System.out.println(h.values());
		System.out.println(h.keySet());
		System.out.println(h.entrySet());
		System.out.println(h.size());
		System.out.println(h.containsKey(6));

	}

}
