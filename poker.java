package tw.org.ikii.allanJava;

import java.util.Arrays;

public class poker {

	public static void main(String[] args) {
		// 洗牌
		int[] poker = new int[52];
		for (int i=0; i<poker.length; i++){
			int temp;
			// 檢查機制
			boolean isRepeat;
			do {
				temp = (int)(Math.random()*52);
				isRepeat = false;
				for (int j=0; j<i; j++){
					if (temp == poker[j]){
						isRepeat = true;
						break;
					}
				}
			}while(isRepeat);
			poker[i] = temp;
		}
		
		// 發牌
		int[][] player = new int[4][13];
		for (int i=0; i<poker.length; i++){
			player[i%4][i/4] = poker[i];
		}
		//攤牌
		String[] suit={"桃","心","方","花"};
		String[] value={"A","1","2","3","4","5","6","7","8","9","10","J","Q","K"};
		for(int[] cards:player){
			for(int card:cards){
				Arrays.sort(cards);
				System.out.print(suit[card/13]+value[card%13]+" ");
			}
			System.out.println();
		}
		
		
	}

}
