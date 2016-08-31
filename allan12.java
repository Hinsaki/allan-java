package tw.org.ikii.allanJava;

public class allan12 {
//TODO switch型別限制
	public static void main(String[] args) {
		int a = 10;//switch只能用常數比較，不可使用變數
		final int b = 8;//final固定變數為8
//switch只可比較byte、short、int、char及String(java6無此項)， 不可比較型別long
		switch(a){
		case 1:
			System.out.println("A");
			break;
		case 10:
			System.out.println("B");
			break;
		case b+3:
			System.out.println("C");
			break;
		default:
			System.out.println("D");
			break;
		}

	}

}
