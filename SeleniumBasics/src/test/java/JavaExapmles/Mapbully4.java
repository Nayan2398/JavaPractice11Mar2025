package JavaExapmles;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Mapbully4 {
	
	public static final Logger logger1 = LogManager.getLogger(Mapbully4.class);


	//Problem Statement - >
	//Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths,
	//then set "c" to have the longer value. If the values exist and have the same length, change them both to the empty 
	//string in the map.

	//mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
	//mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
	//mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
	
	
	
	public Map<String, String> Mapbully4(Map<String, String> map) {

		if(map.containsKey("a")&& map.containsKey("b")){
			String a = map.get("a");
			String b = map.get("b");

			//System.out.println(map);
			if (a.length() != b.length()) {

				map.put("c", a.length() > b.length() ? a : b);

			}else {
				map.put("a", "");
				map.put("b", "");
				map.put("c", "");

				// System.out.println(map);
			}

			//  System.out.println(map);

		}
		return map;

	}


	public static void main(String[] args) {

		Map<String,String> map = new HashMap<>();

		map.put("a", "aaa");
		map.put("b", "bb");
		map.put("c", "aaa");

		if (map.containsKey("a")&& map.containsKey("b")) {

			//			int x = map.get("a").length();
			//			int y = map.get("b").length();
			//			
			//		   System.out.println(map);
			//			
			//			if (x > y) {
			//				
			//				map.put("c",map.get("a"));
			//				
			//				System.out.println(map);
			//				
			//			}else if  (x < y) {
			//		    	
			//		    	map.put("c",map.get("b"));
			//		    	
			//		    	System.out.println(map);
			//		    }else {
			//				map.put("a","");
			//				map.put("b", "");
			//				
			//		    	System.out.println(map);
			//
			//		    }
			//				
			//			}
			//			
			//			System.out.println(map);

			String a = map.get("a");
			String b = map.get("b");
			logger1.info(map);
			//System.out.println(map);
			if (a.length() != b.length()) {

				map.put("c", a.length() > b.length() ? a : b);

			}else {
				map.put("a", "");
				map.put("b", "");
				map.put("c", "");

				logger1.info(map);
				//System.out.println(map);
			}
			logger1.info(map);
			//System.out.println(map);

		}

	}

}

