package no.hvl.dat100;

public class Temperatur {

	public static void main(String[] args) {
		
		final int ANT_OBS = 3;
		final int ANT_DAG = 7;
		
		int[][] temp = new int[ANT_OBS][ANT_DAG];
		
		int[] obsSum = new int[ANT_OBS];
		int[] dagSum = new int [ANT_DAG];
		
		for (int obsnr = 0; obsnr < ANT_OBS; obsnr++) {
			System.out.print("obs " + (obsnr+1));
			for (int dagnr = 0; dagnr < ANT_DAG; dagnr++) {
				obsSum[obsnr] += temp[obsnr][dagnr];
				dagSum[dagnr] += temp[obsnr][dagnr];
				System.out.print("  " + temp[obsnr][dagnr]);
			}
			System.out.print(" " + obsSum[obsnr]/ANT_DAG + "\n");
		}
		System.out.print("snitt");
		for (int dagnr = 0; dagnr < ANT_DAG; dagnr++) {
			System.out.print("   " + dagSum[dagnr]/ANT_OBS);
		}
		System.out.println();
		
	}

}
