package ejerciciosArray;

public class TestColecciones1 {
	public static void main(String[] args) {
		Colecciones1 c1 = new Colecciones1();
		
		//ejercicio1
		System.out.println("Asigna el valor 5 al ultimo elemento:");
		c1.getLista()[11]=5;
		for (int i=0; i<c1.getLista().length; i++){
			System.out.print(c1.getLista()[i]+"\t");
		}
		System.out.println("\n");
		
		//ejercicio2
		System.out.println("Asigna el resto de valores con un bucle que el primer elemento sea 3 y los restantes el doble del anterior:");
		int contador=0;
		for (int i=0; i<c1.getLista().length; i++){
			if (i==0){
				c1.getLista()[i]=3;
				System.out.print(c1.getLista()[i]+"\t");
			}
			else{
				c1.getLista()[i]=c1.getLista()[contador]*2;
				System.out.print(c1.getLista()[i]+"\t");
				contador++;
			}
		}
		System.out.println("\n");
		
		//ejercicio3
		System.out.println("Mediante un bucle calcula la suma de todos los elementos del array:");
		int suma=0;
		for (int i=0; i<c1.getLista().length; i++){
			suma+=c1.getLista()[i];
		}
		System.out.println(suma);
		System.out.println();
		
		//ejercicio4
		System.out.println("Cambia el valor del array y divide por 3 todos los ultimo cinco valores:");
		for (int i=0; i<c1.getLista().length; i++){
			if (i<7){
				System.out.print(c1.getLista()[i]+"\t");
			}else{
			c1.getLista()[i]/=3;
			System.out.print(c1.getLista()[i]+"\t");
			}
		}
		System.out.println("\n");
		
		//ejercicio5
		System.out.println("Calcula ahora el valor mas pequeño almacenado en el array:");
		int numeroMenor=c1.getLista()[0];
		for (int i=0; i<c1.getLista().length; i++){
			if (numeroMenor>c1.getLista()[i]){
				numeroMenor=c1.getLista()[i];
			}
		}
		System.out.println(numeroMenor);
		System.out.println();
		
		//ejercicio6
		System.out.println("Muestra todos los valores en tres filas de cuatro columnas, con una separacion de cinco espacios:");
		int c=0;
		for (int i=0; i<c1.getLista().length; i++){
			c++;
			if (c<3){
				System.out.print(c1.getLista()[i]+"\t");
			}else{
				System.out.print(c1.getLista()[i]+"\t");
				System.out.println();
				c=0;
			}
		}
	}
}
