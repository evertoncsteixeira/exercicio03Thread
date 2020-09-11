package view;

import java.util.Random;

import controller.ThreadMatriz;

public class Principal {

	public static void main(String[] args) {
		int[][] m = new int[3][5];
		m = carregarMatriz(m);
		for (int i = 0; i < 3; i++) {
			ThreadMatriz tMatriz = new ThreadMatriz(i+1,m);
			tMatriz.start();
		}
		

	}
	public static int[][] carregarMatriz(int m[][]) {
		Random r = new Random(); 
		for (int i = 0;  i < 3; i++){
			for (int c=0; c < 5; c++) {
				m[i][c] = r.nextInt();
			}
			
			
		}
		return m;
	}
}
