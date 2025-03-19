package JavaExapmles;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Mapbully5 {

	//public static final Logger logger1 = LogManager.getLogger(Mapbully4.class);
	 
	public static final Logger logger2 = LogManager.getLogger(Mapbully5.class);
    // problem Statement -> 
	//Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value. 
	//In all cases remove the key "c", leaving the rest of the map unchanged.

	//mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
	//mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
	//mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
	
	
	public Map<String, String> mapShare(Map<String, String> map) {
        if (map.get("a") != null) {
       	  
       	  map.put("b", map.get("a") );
       	  
       	 // System.out.println(map);
       	  
         }if (map.containsKey("c")) {
       	  
       	  map.remove("c");
         }
			
		//	 System.out.println(map);
		return map;

}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		 Map<String,String> map = new HashMap();
		 
		 map.put("a", "aaa");
		 map.put("b", "aaa");
		 
          if (map.get("a") != null) {
        	  
        	  map.put("b", map.get("a") );
        	  
        	  logger2.info(map);
        	  
        	//  System.out.println(map);
        	  
          }if (map.containsKey("C")) {
        	  
        	  map.remove("c");
          }
    	     logger2.info(map);

		//	 System.out.println(map);
			 
			 
		 }
		 
		 
	}


