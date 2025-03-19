package JavaExapmles;

import java.util.HashMap;
import java.util.Map;

//public class MapFirstChar {

    //Problem Statement ->
	//Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen, 
	//with the value of all the strings starting with that character appended together in the order they appear in the array.

	//firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
	//firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
	//firstChar([]) → {}

//	public static void main(String[] args) {
//
//
//		Map<String,String> map = new HashMap <>();
//		
//		//map.put("s" ,"saltsoda");
//		
//		//map.put("t", "teatoast");
//		
//		String[] strings = { "salt", "tea", "soda", "toast"};
//		
//		String firstchar = 
//		
//		for (String s : strings) {
//			
//			map.put(s,map.get(s));
//			
//			System.out.println(s);
//			
//			
//		}
//
//	}
//
//}
	
	public class FirstCharCompute {
	    public static void main(String[] args) {
	        String[] words = {"salt", "tea", "soda", "toast"};
	        System.out.println(firstChar(words));
	    }

	    public static Map<String, String> firstChar(String[] words) {
	        Map<String, String> result = new HashMap<>();
	        
	        // Iterate through each word
	        for (String word : words) {
	            // Use compute to append the word to the existing value or create a new one
	            result.compute(String.valueOf(word.charAt(0)), (key, oldValue) -> oldValue == null ? word : oldValue + word);
	        }
	        
	        return result;
	    }
	}
