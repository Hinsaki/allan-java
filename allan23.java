package tw.org.ikii.allanJava;

public class allan23 {

	public static void main(String[] args) {
		String s1 = "allan";
		String s2 = "allan";
		String s3 = new String("allan");
		String s4 = new String("allan");
		Bike myBike = new Bike();
		Bike urBike = new Bike();
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		System.out.println(s3.equals(s4));
		System.out.println(myBike.equals(urBike));
	}

}
