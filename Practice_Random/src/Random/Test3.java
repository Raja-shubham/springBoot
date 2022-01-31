package Random;

import java.util.*;



public class Test3 {

	public static void main(String[] args) {
		String st = "BANANA";
		int ch[] = new int[27];
		
		for(int i = 0 ;i < st.length();i++) {
			int asci = (int)st.charAt(i);
			System.out.println(asci);
			ch[asci-66]++;
					
		}
		
		for(int i = 0 ; i < ch.length ; i++) {
			
			if(ch[i] > 0)
				System.out.println(ch[i]);
		}
		
	}

}
