package curriculum.b;

public class Question2 {

	public static void main(String[] args) {
    
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
		
		System.out.println("【いずれかの値を入力】\n ⇒");
		@SuppressWarnings("resource")
		int num = new java.util.Scanner(System.in).nextInt();
		
		if(num > 0) {
			
			System.out.println("正の数です");
			
		}else if (num == 0) {
			
			System.out.println("0です");
			
		}else{
			
			System.out.println("負の数です");
			
		}
		
	/*Q6*/
		
		System.out.println("【いずれかの値を入力】\n ⇒");
		@SuppressWarnings("resource")
		int value = new java.util.Scanner(System.in).nextInt();
		
		if(value % 2 == 0) {
			
			System.out.println("偶数です");
			
		}else {
			
			System.out.println("奇数です");
			
		}
		
	/*Q7*/
		
		System.out.println("0～100の数字を入力 \n ⇒");
		@SuppressWarnings("resource")
		int score1 = new java.util.Scanner(System.in).nextInt();
		
		if(score1 >= 90) {
			
			System.out.println("優");
			
		}else if(score1 >= 70){
			
			System.out.println("良");
			
		}else if(score1 >= 50) {
			
			System.out.println("可");
			
		}else {
			
			System.out.println("不可");
			
		}
		
	/*Q8*/
		
		System.out.println("nullまたは(\"\")を入力 \n ⇒");
		@SuppressWarnings("resource")
		String str = new java.util.Scanner(System.in).nextLine();
		
		if(str.equals("null") || str.equals("")) {
			
			System.out.println("入力が無効です");
			
		}
	}

}
