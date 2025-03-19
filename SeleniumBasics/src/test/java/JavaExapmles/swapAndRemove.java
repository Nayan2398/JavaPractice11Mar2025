package JavaExapmles;

import java.util.HashMap;
import java.util.Map;

import org.checkerframework.checker.units.qual.s;

public class swapAndRemove {


	//private static int s;

	//private static Object FirstChar  [] str ;

	//Problem Statement -> 
	//We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and 
	//then return the given array of non-empty strings as follows: if a string matches an earlier string in the array,
	//wap the 2 strings in the array. When a position in the array has been swapped, it no longer matches anything. Using a map,
	//this can be solved making just one pass over the array. More difficult than it looks.
	//
	//allSwap(["ab", "ac"]) → ["ac", "ab"]
	//allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
	//allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]


	//public static void main(String[] args) {

	//Map<String,Integer> map = new HashMap<>();

	public static void main(String[] args) {
		String[] strings = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
		swapAndRemove(strings);

		// Printing the modified array after swaps
		for (String s : strings) {
			System.out.println(s);
		}
	}

	public static void swapAndRemove (String[]strings) {

		Map<Character,Integer> map = new HashMap<>();

		for(int i = 0; i< strings.length;i++) {

			char firstChar = strings [i].charAt(0);

			if(map.containsKey(firstChar)) {

				int indexToSwap = map.get(firstChar);

				String temp = strings[i];
				strings[i] = strings[indexToSwap];
				strings[indexToSwap] = temp;

				map.remove(firstChar);

			}else {
				// If the first character is not in the map, add it with the current index
				map.put(firstChar, i);
			}

		}


	}
}


