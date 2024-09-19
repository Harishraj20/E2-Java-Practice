package hashMaps;
import java.util.HashMap;


public class HashMap1 {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Abi", 23);
        map.put("Bala", 10);
        map.put("Clara", 30);

        map.put(null,23);

        map.put("ashok", null);
        map.put("krish", null); 
        
        System.out.println("HashMap before inserting duplicate key: "+map);
        
        map.put("Clara", 21); // Duplicate key
        
        System.out.println("HashMap after inserting duplicate key: "+map);
        
        System.out.println("Size of map is: " + map.size());
        System.out.println(map);

        System.out.println("Value for null key: " + map.get(null));
        System.out.println("Contains null value: " + map.containsValue(null));
        
        //KeySet and get
        for (String i : map.keySet()) {
        	System.out.println("The value of "+i+" is : "+map.get(i));
		}
        for (Integer i : map.values()) {
        	if(i == 10) {
        	System.out.println( i);
		}else {
			System.out.println("Not found");
		}
        }
    }
}
