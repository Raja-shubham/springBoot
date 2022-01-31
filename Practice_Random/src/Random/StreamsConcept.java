package Random;

import java.util.*;
import java.util.Map.Entry;

public class StreamsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aabbbccdeeeee";
		HashMap<String,Integer> hm=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			if(!hm.containsKey(Character.toString(str.charAt(i))))
			hm.put(Character.toString(str.charAt(i)), 1);
			else
				hm.put(Character.toString(str.charAt(i)), hm.get(Character.toString(str.charAt(i)))+1);
		}
		for(Entry<String, Integer> x:hm.entrySet()) {
			System.out.print(x.getKey()+x.getValue());
		}
	}

}
