package curriculum.b;

import java.util.Random;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
	/*Q1*/
		for (int i = 1; i <= 10; i++) {
			
			System.out.println("カウント" + i);
			
		}
		
	/*Q2*/
		for (int even = 2; even <= 20; even++) {
			
			if(even % 2 == 0) {
				
				System.out.println("カウント" + even);
				
			}
		}
		
	/*Q3*/
		for (int down = 10; down >= 1; down--) {
			
			System.out.println("カウント" + down);
		}
		
	/*Q4*/
		int sum = 0;
		for (int num = 1; num <= 100; num++) {
			
			sum += num;
			
			System.out.println("合計：" + sum);
			
		}
		
	/*Q5*/
		int lines = 5;
		
		for (int a = 1; a <= lines; a++) {
			
			for (int b = 0; b < a; b++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	/*Q6*/
		int count = 1;
		while (count <= 10) {
			System.out.println("カウント" + count);
			count++;
		}
		
	/*Q7*/
		int e = 2;
		while (e % 2 == 0 || e <= 20) {
			System.out.println("偶数：" + e);
			e++;
		}
	
	/*Q8*/
		int d = 10;
		while (d >= 1) {
			System.out.println("カウント" + d);
			d--;
		}
		
	/*Q9*/
		int suM = 0;
		int nuM = 1;
		
		while (nuM <= 100) {
			suM += nuM;
			nuM++;
		}
		
		System.out.println("合計値：" + suM);
		
	/*Q10*/
		
		Scanner scanner = new Scanner(System.in); // Scannerの作成
		
		System.out.println("入力⇒");

		int x;
		
		while (true) {
			x = scanner.nextInt();
			if (x == 0) {
				System.out.println("終了しました");
				break;
			}
			
			System.out.println("入力された値：" + x);
		}
		
		
		
	/*Q11*/
		
		for (int y = 1; y <= 9; y++) {
			
			for (int z = 1; z <= 9; z++) {
				
				System.out.print( "0" + y + "*" + "0" + z + "=" + "0" + (y*z) + "||" );
			}
			
			System.out.println();
		}
		
	/*Q12*/
		
		Scanner sc = new Scanner(System.in).useDelimiter("、"); // 文字のScannerの作成
		sc.useDelimiter("、");
		
		System.out.println("いずれかの製品を入力⇒");
		
		String str = sc.nextLine();
		
		String products[] = {str};
		
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ,11};
		
		for (int n = 0; n < products.length; n++) {
			String product = products[n];
			
			Random rand = new Random();
			int number = rand.nextInt(11);
			
			String category = "";
			switch (product) {
			
			  case "パソコン":
			  
			  case "冷蔵庫":
			  
			  case "扇風機":
			  
			  case "洗濯機":
			 
			  case "加湿器":
			  
			  case "テレビ":
			  case "ディスプレイ":
				  category = "tv";
			  System.out.println(str + "の残りの台数は" + number + "です");
			  break;
				  
			  default:
			  System.out.println("『" + str + "』" + "は指定の商品ではありません");  
			  break;
			  
			}
			
					
		}
		
		
	}//------------------------------------------------------------


}


