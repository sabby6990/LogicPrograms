package randomcodes;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
 public static void main(String[] args) {
	Set set = new HashSet<>();
	
	System.out.println(set.add("a"));
	System.out.println(set.add("b"));
	System.out.println(set.add(null));
	System.out.println(set.add("b"));
	
}
}
