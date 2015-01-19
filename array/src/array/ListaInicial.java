package array;

import java.util.ArrayList;

public class ListaInicial {
	
	public static void main(String[] args) {
		//creamos una lista vacia
		ArrayList list = new ArrayList();
		
		System.out.println("Tamaño de la lista: "+list.size());
		
		list.add("madrid"); list.add("berlin"); list.add("oslo");
		list.add("paris"); list.add("londres"); list.add("roma");
		list.add("florencia"); list.add("glasgow"); list.add("dublin");
		
		System.out.println("Tamaño de la lista: "+list.size());
		System.out.println(list);
		list.add(2, "barcelona");
		System.out.println("Tamaño de la lista: "+list.size());
		System.out.println("Esta Madrid?: "+list.contains("madrid"));
		System.out.println("Esta Zaragoza: "+list.contains("zaragoza"));
		//quitamos un objeto
		list.remove("londres");
		System.out.println("Posicion de madrid: "+list.indexOf("madrid"));
		list.remove(0);
		System.out.println("Tamaño de la lista: "+list.size());
		System.out.println("Esta madrid?: "+list.contains("madrid"));
		//imprimimos los valores
		System.out.println(list);
	}

}
