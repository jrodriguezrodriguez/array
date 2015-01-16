package array;

public class EjemploArray {

	public static void main(String[] args) {
		
		int[][] valores ={
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11,12}
		};
		for (int f=0; f<valores.length;f++) {
			for (int c=0; c<valores[f].length;c++) {
				System.out.print("\t"+valores[f][c]);	
			}
			System.out.println("\n");
		}
	}
	
}
