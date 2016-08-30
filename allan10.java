package tw.org.ikii.allanJava;

public class allan10 {

	public static void main(String[] args) {

		  int year = 2016 ; 
          //設定欲判斷之年        

         System.out.print("西元" + year + "年") ;
        
         if (year%4==0)//可被4除盡
         {
                 if (year%100==0)
                  //可被4、100除盡
                 {
                         if (year%400==0)
                         {
                        	//可被4、100、400除盡    
                        	 System.out.println("是閏年！") ;

                         }else
                         {
                        	//可被4、100除盡，不可被400除盡    
                        	 System.out.println("不是閏年！");
                         }
                 }else
                 {
                 System.out.println("是閏年！");
                 //可被4除盡，不可被100除盡               
                 }
         }else 
         {
          //不可被4除盡
                 System.out.println("不是閏年！");  
         }

	}

}
