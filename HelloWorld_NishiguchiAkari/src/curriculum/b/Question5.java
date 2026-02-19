package curriculum.b;

public class Question5 {
	
	public static void helloWorld() { //Q1：メソッドの定義
			
			System.out.println("Hello,Wold");
		}
		

	    public static int doubleValue(int num) { //Q2：メソッドの定義
		
		    return num * 2;
        }
	    
	    public static boolean isEven(int result) { //Q3：メソッドの定義
	    	
			return result % 2 == 0 ? true : false;
	    }
	    
	    public static void displayResult(int result) {
	    	
	    	if (isEven(result)) {
	            System.out.println(result + " は偶数です。");
	            
	        } else {
	        	
	            System.out.println(result + " は奇数です。");
	            
	        }
	    }
	    

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		/*Q1*/System.out.println("*【Q1】");
		
	    helloWorld();
		
		
		/*Q2*/System.out.println("*【Q2】");	
		
		int num = doubleValue(10);
		
		System.out.println("10を2倍すると" + num + "です");
		
		
		/*Q3*/System.out.println("*【Q3】");	
		int num1 =7 ;
		int num2 = 10;
		
        displayResult(num2);
        

        displayResult(num1);
        
        
        /*Q4*/System.out.println("*【Q4】");	
        
	}//------------------------------------------------------------

		
}//-----------------------------------------------------------------------

       







