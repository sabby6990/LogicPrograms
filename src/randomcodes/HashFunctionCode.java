package randomcodes;

import java.io.Serializable;

public class HashFunctionCode implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4346625860891001579L;


	static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

	
	public static void main(String[] args) {
		Object key = 157384649;
		Object key1 = 157384649;
		
		System.out.println(hash(key));
		System.out.println(hash(key1));
		
		int hashCode = key.hashCode();
		int hashCode1 = key1.hashCode();
		System.out.println(hashCode);
		System.out.println(hashCode1);
		
		System.out.println((hashCode>>>16));
		
		System.out.println(key.equals(key1));
	}
}
