package JavaExapmles;

import java.util.HashMap;
import java.util.Map;

public class firstSwap {

	//  problem Statement ->
	//	We'll say that 2 strings "match" if they are non-empty and their first chars are the same. 
	//	Loop over and then return the given array of non-empty strings as follows: if a string matches 
	//  an earlier string in the array, swap the 2 strings in the array. A particular first char can only cause 1 swap, 
	//	so once a char has caused a swap, its later swaps are disabled. Using a map, this can be solved making just
	//	one pass over the array. More difficult than it looks.
	//
	//	firstSwap(["ab", "ac"]) → ["ac", "ab"]
	//	firstSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"]
	//	firstSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "ai", "aj", "bx", "by"]

	public static void main(String[] args) {

		String [] strings = {"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};
		firstSwap (strings);
		for (String s : strings)
			System.out.println(s);


	}


	public static void firstSwap(String []strings) {

		Map <String , Integer> map = new HashMap<>();

		for (int i =0; i< strings.length;i++) {

			String s = strings[i];
			String first = s.substring(0,1);

			if(!map.containsKey(first)) {

				map.put(first, i);
			} else if (map.get(first) >= 0) {

				int lastSeen = map.get(first);
				strings [i] = strings[lastSeen];
				strings [lastSeen] = s;
				map.put(first, -1);

			}

		}



	}	 


}



