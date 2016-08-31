package tw.org.ikii.allanJava;

public class allan20 {

	public static void main(String[] args) {
		int[][] a = new int[3][4];
		int[][] b = new int[3][];
		b[0] = new int[2];
		b[1] = new int[3];
		b[2] = new int[4];
		b[0][1] = 1;
		b[1][2] = 2;
		b[2][3] = 3;

		for (int[] v : b) {
			for (int vv : v) {
				System.out.print(vv + " ");
			}
			System.out.println();
		}
		System.out.println("------");
		int[] f = new int[] { 1, 2, 3, 4, 5 };
		System.out.println(f.length);
		System.out.println(f[2]);

	}

}
