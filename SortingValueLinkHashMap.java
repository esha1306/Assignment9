import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Comparator;

public class SortingValueLinkHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, Integer> sortmap = new LinkedHashMap<String, Integer>();
		
		sortmap.put("Jethalal", 65);
		sortmap.put("Popatlal", 80);
		sortmap.put("Sodhi", 70);
		sortmap.put("Mehta", 85);
		sortmap.put("Hathi", 97);
		sortmap.put("Bhide", 89);
		sortmap.put("Iyer", 100);
		
		List<Map.Entry<String, Integer>> entries = new ArrayList<Map.Entry<String, Integer>>(sortmap.entrySet());
		
		Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>(){
			 
		    public int compare(Entry<String, Integer> entry1, Entry<String, Integer> entry2) {                
		        return entry1.getValue() - entry2.getValue();
		    }
		    
		});
		
		System.out.println("LinkedHashMap sorted entries");
		for(Map.Entry<String, Integer> entry : entries){
		    System.out.println( entry.getKey() + "=>" + entry.getValue() );
		}
		sortmap.clear();
		
		for(Map.Entry<String, Integer> entry : entries){
		    sortmap.put(entry.getKey(), entry.getValue());
		}
		
		System.out.println("Linked hashmap contain:" +sortmap);
	}

}
