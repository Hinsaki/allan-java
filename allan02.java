package tw.org.ikii.allanJava;

public class allan02 {

	public static void main(String[] args) {
		//TODO  變數宣告規則
		/*
		 	1
		 	第一個字元[a-zA-Z$_]
		 	第二個字元開始l[a-zA-Z0-9$_]*
		 	2
		 	不能使用Keyword
		 	3
		 	byte 2*8次
		 	short 2*16
		 	int 2*32
		 	long 2*64
		 	
		 */
		byte var1;
		var1 = 127;
		short 可以用中文變數;
		可以用中文變數 = 32767;
		
		System.out.println(var1);
		System.out.println(可以用中文變數);
	}

}
