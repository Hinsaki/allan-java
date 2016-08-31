package tw.org.ikii.allanJava;

public class allan21 {

	public static void main(String[] args) {
		int i = 0, n = 100, sum = 0;
		while (i < n) {
			sum += i++;
			System.out.println("1+2+3+...+"+n+"="+sum);
		}
	}

}
