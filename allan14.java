package tw.org.ikii.allanJava;

public class allan14 {

	public static void main(String[] args) {
		for (int k = 0; k < 2; k++) {
			for (int j = 1; j <= 9; j++) {
				for (int i = 2; i <= 5; i++) {
					int newi = i+k*4;
					int result = newi * j;
					System.out.print(newi + "X" + j + "=" + result + "\t");
				}
				System.out.println();
			}
			System.out.println("---------");
		}

	}

}
