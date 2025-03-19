package JavaExapmles;

import java.util.HashMap;
import java.util.Map;

import fileUpload.Main;

public class MapWordCount {

    //Problem Statement ->
	//Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array,
	//always with the value 0. For example the string "hello" makes the pair "hello":0.
	//We'll do more complicated counting later, but for this problem the value is simply 0.
	
	//word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0}
	//word0(["a", "b", "a", "c", "b"]) → {"a": 0, "b": 0, "c": 0}
	//word0(["c", "b", "a"]) → {"a": 0, "b": 0, "c": 0}
		
    
	


	public static void main(String[] args) {

		Map<String,Integer> map = new HashMap<>();
		
         // String s = "hello";
  
		String strings = "hello";
		//		map.put("a",0);
//		map.put("b", 0);
//		
//		if (map.containsKey("a")&& map.containsKey("b")) {
//			
//			map.put("a",0);
//			map.put("b",0);
//			
//		System.out.println(map);
//		}
//		if(map.containsKey("c")) {
//			
//			map.put("c",0);
//			
//		System.out.println(map);
//		}
//	
//		System.out.println(map);
//		
	//	for (String s:strings) {
	//	    map.put(s, 0);
		    
		    System.out.println(map);
		  }
		//  return map;
		}
//}	




