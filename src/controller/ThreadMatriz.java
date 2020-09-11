package controller;

public class ThreadMatriz extends Thread{
	private int[][] m;
	private int n;
	public ThreadMatriz(int n,int m[][]) {
		this.m = m;
		this.n = n;
	}
	
	@Override
	public void run() {
		int total = 0;
		for (int i=0; i<5; i++){
			total += this.m[n-1][i];
		}
		System.out.println("A soma dos valores da linha " + this.n + " é = " + total);
		
	}
}
