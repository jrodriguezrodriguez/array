package ejerciciosArray;

import java.util.Arrays;

public class Datos {
	//atributos
	private double[] temperaturas;
	//constructor
	public Datos() {
		this.temperaturas = new double[10];
	}
	//getter y setter
	public double[] getTemperaturas() {
		return temperaturas;
	}
	public void setTemperaturas(int posicion, double valor) {
		this.temperaturas[posicion]=valor;
	}
	//valor medio de temperaturas
	public double valorMedio(){
		double suma=0;
		for (int i=0; i<temperaturas.length; i++){
			suma+=temperaturas[i];
		}
		return suma/temperaturas.length;
	}
	//la desviacion tipica de temperaturas
	public double desviacionTipica(){
		double resultado=0;
		for (int i=0; i<temperaturas.length; i++){
			resultado+=(temperaturas[i]-valorMedio())*(temperaturas[i]-valorMedio())/temperaturas.length;
		}
		return Math.sqrt(resultado);
	}
	//numero de datos por debajo de la media
	public int debajoMedia(){
		int contador=0;
		for (int i=0; i<temperaturas.length; i++){
			if (temperaturas[i]<valorMedio()) contador++;
		}
		return contador;
	}
	//valor minimo
	public double valorMinimo(){
		double numeroMenor=temperaturas[0];
		for (int i=0; i<temperaturas.length; i++){
			if (numeroMenor>temperaturas[i]){
				numeroMenor=temperaturas[i];
			}
		}
		return numeroMenor;
	}
	//valor maximo
	public double valorMaximo(){
		double numeroMayor=temperaturas[0];
		for (int i=0; i<temperaturas.length; i++){
			if (numeroMayor<temperaturas[i]){
				numeroMayor=temperaturas[i];
			}
		}
		return numeroMayor;
	}
	//toString
	@Override
	public String toString() {
		return "temperaturas: " + Arrays.toString(temperaturas);
	}
	//prueba main
	public static void main(String[] args) {
		Datos d1 = new Datos();
		d1.setTemperaturas(0, 18.7); d1.setTemperaturas(1, 21.8);
		d1.setTemperaturas(2, 18.1); d1.setTemperaturas(3, 20.4);
		d1.setTemperaturas(4, 17.7); d1.setTemperaturas(5, 23.2);
		d1.setTemperaturas(6, 17.4); d1.setTemperaturas(7, 25.3);
		d1.setTemperaturas(8, 16.9); d1.setTemperaturas(9, 9.1);
		System.out.println(d1.toString());
		System.out.printf("%.2f",d1.valorMedio());
		System.out.println();
		System.out.printf("%.2f",d1.desviacionTipica());
		System.out.println();
		System.out.println(d1.debajoMedia());
		System.out.println(d1.valorMinimo());
		System.out.println(d1.valorMaximo());
	}

}
