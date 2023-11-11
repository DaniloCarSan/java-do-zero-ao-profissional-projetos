package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		usuarios.put(1,"Danilo");
		usuarios.put(2,"Ana");
		usuarios.put(2,"João");
		usuarios.put(3,"Maria");
		usuarios.put(4,"Clarisse");
		
		System.out.println(usuarios);
		
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		System.out.println(usuarios.containsValue("Maria"));
		
		System.out.println(usuarios.get(2));
		
		for(int key: usuarios.keySet()) {
			System.out.println(key);
		}
		
		for(String value: usuarios.values()) {
			System.out.println(value);
		}
		
		for(Entry<Integer, String> u: usuarios.entrySet()) {
			System.out.println(u.getKey());
			System.out.println(u.getValue());
		}
		
	}

}
