package funprograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeating {

	
	
	public static void main(String[] args) {
	String stringValue="mississippi";
	char[] charArray = stringValue.toCharArray();
	Map<String,Integer> mapCount = new LinkedHashMap<>();
	System.out.println(charArray.length);
	
	
	for(int i=0;i<=charArray.length-1;i++){
		Integer count=0;
		// --> check this part for bugs
		if(mapCount.containsKey(Character.toString(charArray[i]))){
			//--> chance to save a loc
			count = mapCount.get(Character.toString(charArray[i]));
			mapCount.put(Character.toString(charArray[i]), ++count);
		}else{
			mapCount.put(Character.toString(charArray[i]), 1);
		}
		
	}
	mapCount.forEach((k,v)->{
		System.out.println(k+" --> "+v);
	});
	
	System.out.println(mapCount.entrySet().stream().min(Map.Entry.comparingByValue()).get().getKey());
	}
}
