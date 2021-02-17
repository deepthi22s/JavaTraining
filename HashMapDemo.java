import java.util.HashMap;
import java.util.Map;
class HashMapDemo{
	public static void main(String[] args) {
		HashMap map = new HashMap();

		// Add elements to the map
		map.put("Shreya", 5680.90);
		map.put("Nivedha", 7778.90);
		map.put("Nikhil", 2500.78);
		map.put("Teju", 777.999);

		System.out.println(map);

		// Traverse through the map
		java.util.Set set =  map.entrySet();
		for(Object value :  set){
			Map.Entry m = (Map.Entry) value;
			System.out.print("Key : " + m.getKey());
			System.out.println(", Vaue : " + m.getValue());
		}

		// Get the value for Nivedha
		Double value = (Double) map.get("Nivedha");

		//Update it
		map.put("Nivedha", value + 5000);

		// Display the updated value for Nivedha
		System.out.println("Nivedha's new value : " + map.get("Nivedha"));

	}
}
