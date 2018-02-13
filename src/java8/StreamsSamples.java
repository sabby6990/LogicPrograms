package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsSamples {

	public static void main(String[] args) {
		
		List<String> stringList = new ArrayList<>();
		stringList.add("h");
		stringList.add("e");
		stringList.add("l");
		stringList.add("l");
		stringList.add("o");

		List<Integer> integerList = new ArrayList<>();
		integerList.add(3);
		integerList.add(4);
		integerList.add(2);
		integerList.add(1);
		integerList.add(7);
		
		//matching
		System.out.println(stringList.stream().allMatch(elements -> elements.contains("h")));
		System.out.println(stringList.stream().anyMatch(elements -> elements.contains("h")));
		System.out.println(stringList.stream().noneMatch(elements -> elements.contains("h")));
		
		//reducing
		System.out.println(integerList.stream().reduce((a,b)->a+b));
		
		System.out.println(integerList);
		
		//collecting
		List<String> upperCaseStringList = stringList.stream().map(elements -> elements.toUpperCase()).collect(Collectors.toList());
		
		//stringList.stream().map(elements -> elements.toUpperCase()).collect(Collectors.toMap(keyMapper, valueMapper));
		System.out.println(upperCaseStringList);
		
	}
}
