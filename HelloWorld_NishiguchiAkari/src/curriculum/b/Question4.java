package curriculum.b;

import java.util.Arrays;
import java.util.Scanner;

public class Question4 {

	private static final String N = null;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
	
		Scanner scanner = new Scanner(System.in); // Scannerの作成
		
		
	/*Q1*/
		
		int[] numbers = {1,2,3,4,5,}; 
		
		for (int number : numbers) {
			System.out.println(number);
		}

		
    /*Q2*/
		
		int[] numS = {10,20,30,40,50};
		
		for (int i = numS.length - 1; i >= 0; i-- ) {
			System.out.println(numS[i]);
		}// なぜlengthがいるの？
		
		
	/*Q3*/
		
		int[] odd = {3,5,7,9,11};
		
		int sum = 0;
		
		for(int x = 0; x < odd.length; x++) {
			
			sum += odd[x];
		}
		
		System.out.println("配列の合計値:" + sum);
		
		
	/*Q4*/
		
		int[] mix = {12,7,9,21,5,18};
		
		int Max = mix[0];
		int Min = mix[0];
		
		for(int a = 1; a < mix.length; a++) {
			
			if(Max < mix[a]) {
				Max = mix[a];
			}
			
			if(Min > mix[a]) {
				Min = mix[a];
			}
		}
		
		System.out.println("最大値：" + Max);
		System.out.println("最小値：" + Min);
		
		
	/*Q5*/
		
		int[] num = {1,2,3,4,5};
		
		for (int z = 0; z < num.length; z++) {
			num[z] = num[z] * 2;
		}
		System.out.println("【2倍した数】" );
		
		for (int n : num) {
			System.out.println(n);
		}
		
	/*Q6*/
		
		int[] rans = {4,7,10,15,20};
		
		System.out.println("いずれかの値を入力⇒");
		
		int input = scanner.nextInt();
		
		boolean exists = Arrays.stream(numbers).anyMatch(n -> n == input);
		
		if (exists) {
			System.out.println(input + "は配列に含まれています");
		}else {
            System.out.println(input + "は含まれていません。");
        }
		
	/*Q7*/
		
	    
	}//--------------------------------------------------

}//---------------------------------------------------------------------
