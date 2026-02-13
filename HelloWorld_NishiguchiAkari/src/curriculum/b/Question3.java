package curriculum.b;

import java.util.Random;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in); // Scannerの作成
		
		
		
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
		}
		
		System.out.println("合計：" + sum);
		
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
		while (e <= 20) {
			System.out.println("偶数：" + e);
			e += 2;
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
				
				int seki = y*z;
				
				String 九九 = String.format("%02d * %02d = %02d ||" , y , z , seki );

			
			System.out.print(九九);
			}
			
			System.out.println();
         }

	/*Q12*/
		
		System.out.println("いずれかの製品を入力⇒");
		
        String[] products = scanner.next().split("、");
		
        
		Random random = new Random();
		int stock;
		int tvstock = random.nextInt(12); // 0～11までの12個の数字
		int disstock = 11 - tvstock;
		
		for (String product : products) {
			stock = random.nextInt(12);
			
			switch (product) {
			// stock
			case "パソコン":
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":
				
		    System.out.println(product + "残りの台数は" + stock + "台です");
		    break;
		    
		    //tvstock
			case "テレビ":
			case "ディスプレイ":
				
			System.out.println(product.equals("テレビ") ?"テレビの残り台数は" + tvstock + "台です":
					"ディスプレイの残り台数は" + disstock + "台です");
			break;
			
			//disstock
			default:
				System.out.println("『" + product + "』" + "は指定の商品ではありません");
				break;
				
				
			}
		}
		
		
		
	/*Q12*/ //----String inputで商品一覧を指定するやり方---------------------------------------------------------------------------
		
		System.out.println("いずれかの商品を入力⇒");
		
		String input = "パソコン、冷蔵庫、扇風機、洗濯機、加湿器、テレビ、ディスプレイ、その他商品";
		
		String[] proDct = input.split("、"); //※
		
		input = scanner.next(); // 入力を待つために記述
		
		Random rand = new Random();
		
		int stK;
		int tv = rand.nextInt(12);
		int dis = 11 - tv;
		
		for (String proD : proDct) { //(要素と同じ型の定義：※)
			stK = rand.nextInt(12);
			
			switch (proD) {
			
			case "パソコン":
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":
				
		    System.out.println(proD + "残りの台数は" + stK + "台です");
		    
		    break;
			
			case "テレビ":
			case "ディスプレイ":
				
			System.out.println(proD.equals("テレビ") ?"テレビの残り台数は" + tv + "台です":
					"ディスプレイの残り台数は" + dis + "台です");
			
			break;
			
			default:
				System.out.println("『" + proD + "』" + "は指定の商品ではありません");
				break;
		}
					
		}

	    // breakが効かず入力した要素以外も全部出てきてしまう
		
	}//--------------------------------------------------------
		
		
	}//------------------------------------------------------------





