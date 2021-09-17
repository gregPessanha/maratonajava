package academy.devdojo.maratonajava.introducao;

import java.util.Iterator;

public class Aula08ArraysMultiDimensionais2 {

	public static void main(String[] args) {

		int[][] arrayInt = new int[12][];
		
		arrayInt[0] = new int[31];
		arrayInt[1] = new int[28];
		arrayInt[2] = new int[31];
		arrayInt[3] = new int[30];
		arrayInt[4] = new int[31];
		arrayInt[5] = new int[30];
		arrayInt[6] = new int[31];
		arrayInt[7] = new int[31];
		arrayInt[8] = new int[30];
		arrayInt[9] = new int[31];
		arrayInt[10] = new int[30];
		arrayInt[11] = new int[31];

		for (int[] arrayBase : arrayInt) {
			System.out.println("\n--------");
			for (int num : arrayBase) {
				System.out.print(num + " ");
			}
		}

	}
}
