package JavaExapmles;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Mapbully {
	
//Problem Statement = >
//Given a map of food keys and topping values, modify and return the map as follows: 
//if the key "potato" has a value, set that as the value for the key "fries". If the key "salad" has a value, 
//set that as the value for the key "spinach".

//topping3({"potato": "ketchup"}) → {"potato": "ketchup", "fries": "ketchup"}
//topping3({"potato": "butter"}) → {"potato": "butter", "fries": "butter"}
//topping3({"salad": "oil", "potato": "ketchup"}) → {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}
	
	
	public static final Logger logger1 = LogManager.getLogger(Mapbully.class);

	
	public Map<String, String> Mapbully(Map<String, String> map){
		
		if ( map.get("potato") != null) {
			map.put("fries",map.get("potato"));
		}
			
			if ( map.get("Salad") != null) {
				map.put("Spinach",map.get("Salad"));
			}
				
		return map;
		
	}

	public static void main(String[] args) {
		
		Map <String,String> map = new HashMap<>();
		
		map.put("salad", "oil");
		map.put("potato", "ketchup");
		
		logger1.info(map);
		
		//System.out.println(map);
		
		if ( map.get("potato") != null) {
			map.put("fries",map.get("potato"));
			
			logger1.info(map);
			
			//System.out.println(map);
		}
		if ( map.get("salad") != null) {
			map.put("spinach",map.get("salad"));
			
			logger1.info(map);
			
			//System.out.println(map);
		}
		
	}

}
