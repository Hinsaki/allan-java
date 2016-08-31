package tw.org.ikii.allanJava;

public class allan13 {

	public static void main(String[] args) {
		int mount = 11;
		switch(mount){
		case 1:case 3:case 5:case 7:case 8:case 10:
			System.out.println("31天");
			break;
		case 4:case 6:case 9:case 11:
			System.out.println("30天");
			break;
		case 2:
			System.out.println("28天");
			break;
		}

	}

}
