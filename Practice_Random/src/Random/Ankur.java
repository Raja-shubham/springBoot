package Random;

import java.util.HashMap;
import java.util.Stack;

public class Ankur {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="BANANAA";
		HashMap<Character,Integer> z=new HashMap<>();
		for(Character i:x.toCharArray()) {
			if(z.containsKey(i)) {
				z.put(i, z.get(i)+1);
			}
			else {
				z.put(i,1);
			}
		}
		System.out.println(z);
	}
}
