package curriculum.b;


import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
    
		Scanner s = new Scanner(System.in); //
		
	/*Q1*/
		int score = 75;
		
		if (score >= 60) {
			
			System.out.println("合格です！");
		}
		
		
    /*Q2*/
		int age = 25;
		
		if (age >= 20 && age <= 30) {
			
			System.out.println("適性年齢です！");
			
		}else {
			
			System.out.println("対象外です");
			
		}
		
	/*Q3*/
		int age1 = 18;
		
		if(age1 >= 20) {
			
			System.out.println("成人です");
			
		}else if (age1 >= 13 && age1 <= 19){
			
			System.out.println("ティーンエイジャーです");
			
		}else{
			
			System.out.println("子どもです");
			
		}
		
	/*Q4*/
		int x = 30;
		int y = 15;
		int z = 50;
		
		int max3 = Math.max(x, Math.max(y, z));
		System.out.println(max3);
		
		
	/*Q5*/
		
		System.out.println("いずれかの値を入力⇒");
		
		int num = s.nextInt();
		
		
		if (num > 0) {
			
			System.out.println("正の数です");
			
		}else if (num == 0) {
			
			System.out.println("0です");
			
		}else {
			
			System.out.println("負の数です");
			
		}
	
		
	/*Q6*/
		
		System.out.println("いずれかの値を入力⇒");
		
		int value = s.nextInt();
		
		if (value % 2 == 0) {
			
			System.out.println("偶数です");
			
		}else {
			
			System.out.println("奇数です");
			
		}
		
	/*Q7*/
		
		System.out.println("0～100の数値を入力⇒");
		
		int scr = s.nextInt();
		
		if (scr >= 90) {
			
			System.out.println("優");
			
		}else if(scr >= 70){
			
			System.out.println("良");
			
		}else if(scr >= 50) {
			
			System.out.println("可");
			
		}else {
			
			System.out.println("不可");
			
		}
		
	/*Q8*/
		Scanner scanner = new Scanner(System.in); // 文字のScannerの作成
		
		
		System.out.println("いずれかの文字を入力⇒");
		
		String str = scanner.nextLine();
		
		if (str == null || str.isEmpty()) {
			
			System.out.println("入力が無効です");
			
		}else {
			
			System.out.println("入力された文字: " + str);
			
		}
		
	/*Q9*/
		
		System.out.println("1～7のいずれかの値を入力⇒");
		
		int day = s.nextInt();
		
		switch (day) {
		 
		 case 1:
			System.out.println("月曜日");
			break;
			
		 case 2:
			System.out.println("火曜日");
			break;
			
		 case 3:
			System.out.println("水曜日");
			break;
				
		 case 4:
			System.out.println("木曜日");
			break;
			
		 case 5:
			System.out.println("金曜日");
			break;
				
		 case 6:
			System.out.println("土曜日");
			break;
			
		 case 7:
			System.out.println("日曜日");
			break;
			
		 default:
			System.out.println("無効な入力です");
			
		}
		
	/*Q10*/
		
		System.out.println("1～12のいずれかの値を入力⇒");
		
		int month = s.nextInt();
		
		switch (month) {
		
		 case 12,1,2:
			System.out.println("冬");
		    break;
		    
		 case 3,4,5:
			System.out.println("春");
		    break;
		    
		 case 6,7,8:
			System.out.println("夏");
		    break;
			    
		 case 9,10,11:
			System.out.println("秋");
		    break; 
			   
		 default:
			 System.out.println("無効な月です");
			 
		}
		
	}//---------------------------------------------------------------
	

}
