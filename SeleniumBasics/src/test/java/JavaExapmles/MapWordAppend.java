package JavaExapmles;

import java.util.HashMap;
import java.util.Map;

public class MapWordAppend {

    //Problem Statement ->
	//The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each 
	//different string, with the value the number of times that string appears in the array.

	//wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
	//wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
	//wordCount(["c", "c", "c", "c"]) → {"c": 4}


	 
	public Map<String, Integer> wordCount(String[] strings) {

		String result ="";

		Map<String,Integer> map = new HashMap<>();
		
		for (int i = 0;i < strings.length; i++) {

			if (map.containsKey(strings[i])) {

				map.put(strings[i],map.get(strings[i])+1);
			}else {

				map.put(strings[i],1);
			}if(map.get(strings[i])== 2 || map.get(strings[i])== 4 || map.get(strings[i])==6) {
				result+=strings[i];

				//System.out.println(result);
			}

		}
		return map;

   //   return result ;
		 
	}
	

	public static void main(String[] args) {

		String result ="";

		Map<String,Integer> map = new HashMap<>();

		String[] strings = {"a", "b", "a", "c", "b"};
		//for (String s :strings)
		for (int i = 0;i < strings.length; i++) {

			if (map.containsKey(strings[i])) {

				map.put(strings[i],map.get(strings[i])+1);
			}else {

				map.put(strings[i],1);
			}if(map.get(strings[i])== 2 || map.get(strings[i])== 4 || map.get(strings[i])==6) {
				result+=strings[i];

				System.out.println(result);
			}

		}



	}
	


}
