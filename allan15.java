package tw.org.ikii.allanJava;

public class allan15 {

	public static void main(String[] args) {
		abc:
		for(int i = 0 ; i < 5 ; i++){
			for(int j = 5 ; j > 0 ; j--){
				System.out.println(i+":"+j);
			}
			if(i == 2){
			break abc;
			}
		}

	}

}
