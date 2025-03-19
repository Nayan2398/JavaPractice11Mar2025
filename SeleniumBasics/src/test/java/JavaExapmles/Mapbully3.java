package JavaExapmles;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Mapbully3 {

	 
	public static final Logger logger1 = LogManager.getLogger(Mapbully3.class);
	
	//Problem Statement = >
	//Modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value in the map (but not both), 
	//set the other to have that same value in the map.

	//mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
	//mapAB3({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}
	//mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c": "cake"}
	

	public Map<String, String> Mapbully3(Map<String, String> map) {
		
		if(map.getOrDefault("a", "aaa") != null) {
			map.put("b", map.getOrDefault("a", "aaa"));
			
			System.out.println(map);}
			
			if(map.getOrDefault("b", "bbb") != null) {
				map.put("a", map.getOrDefault("b", "bbb"));
			}
			return map;	
		
		
		
	}

	public static void main(String[] args) {

		Map<String,String> map = new HashMap<>();
        
		map.put("a", "aaa");
		map.put("b", "bbb");
		map.put("c","cake");
		logger1.info(map);
		//System.out.println(map);
		
		if(map.getOrDefault("a", "aaa") != null) {
			map.put("b", map.getOrDefault("a", "aaa"));
			
			logger1.info(map);
		//	System.out.println(map);
			}
			
			if(map.getOrDefault("b", "bbb") != null) {
				map.put("a", map.getOrDefault("b", "bbb"));
				

			}
			logger1.info(map);
			//	System.out.println(map);
		}
		

	}


