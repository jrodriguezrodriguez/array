package array;

import java.util.ArrayList;
import java.util.List;

public class RecorrerArrayList {
	
	public static void main(String[] args) {
		//creams lista de Integer
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		int[] arrayEnteros = {1,2,3,4,5,6,7,8,9};
		//recorro el array y lo añado a la lista
		for (int i = 0;i<arrayEnteros.length; i++){
			lista.add(arrayEnteros[i]);
		}
		Integer numero = new Integer(10);
		lista.add(0, numero);//añado numero a la posicion 0
		System.out.println(lista);
		Integer numero2 = new Integer(100);
		lista.set(5, numero2);
		System.out.println(lista);
		//vamos a descubrir cuantos contadores son pares
		int contadorPares = 0;
		for (int i = 0; i< lista.size(); i++){
			if (0 == (lista.get(i)%2))
				contadorPares++;
		}
		System.out.println("Valores pares en la lista: "+contadorPares);
		List<Integer> listaImpares = new ArrayList<Integer>();
		for (Integer integer : lista) {
			if (0!= (integer%2))
				listaImpares.add(integer);
		}
		System.out.println("Lista de impares: "+listaImpares);
	}

}
