package JavaExapmles;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Mapbully2 {
	
	public static final Logger logger1 = LogManager.getLogger(Mapbully2.class);
	
//problem Statement = >
//Modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values,
//remove them both.

//mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
//mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
//mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
	
	public Map<String, String> Mapbully2(Map<String, String> map) {
		
	if(map.containsKey("a")&& map.containsKey("b")) {
	}
	
			
			if(map.get("a").equals (map.get("b"))) {
			}
				map.remove("a");
				
				map.remove("b");
	
				return map;
	
	}
	public static void main(String[] args) {
		
		Map <String,String> map = new HashMap<>();
		
		map.put("a", "aaa");
		map.put("b", "bbb");
		
		logger1.info(map);
	//	System.out.println(map);
		
		
		
		if(map.containsKey("a")&& map.containsKey("b")) {
			
			if(map.get("a").equals (map.get("b"))) {
				
				map.remove("a");
				
				map.remove("b");
				
				logger1.info(map);
				//System.out.println(map);
				
			}
			
			
		}
		
		
	}
	}
	


