package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBagunçado {
	
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("test");
		conjunto.add(1);
		conjunto.add('a');
		
		System.out.println(conjunto.size());
		
		conjunto.add("test");
		
		System.out.println(conjunto.size());
		
		
		System.out.println(conjunto.remove("opa"));
		
		System.out.println(conjunto.remove("test"));
		
		System.out.println(conjunto.size());
		
		System.out.println(conjunto.contains('a'));
		
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		conjunto.addAll(nums);
		System.out.println(conjunto);
		
		
		
		
	}

}
