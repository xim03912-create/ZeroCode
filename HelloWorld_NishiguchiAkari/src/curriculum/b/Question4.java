package curriculum.b;

import java.util.Arrays;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
	
		Scanner scanner = new Scanner(System.in); // Scannerの作成
		
		
	/*Q1*/
		System.out.println("*【Q1】");
		
		int[] numbers = {1,2,3,4,5,}; 
		
		for (int number : numbers) {
			System.out.println(number);
		}

		
    /*Q2*/
		System.out.println("*【Q2】");
		
		int[] numS = {10,20,30,40,50};
		
		for (int i = numS.length - 1; i >= 0; i-- ) {
			System.out.println(numS[i]);
		}
		
		
	/*Q3*/
		System.out.println("*【Q3】");
		
		int[] odd = {3,5,7,9,11};
		
		int sum = 0;
		
		for(int x = 0; x < odd.length; x++) {
			
			sum += odd[x];
		}
		
		System.out.println("配列の合計値:" + sum);
		
		
	/*Q4*/
		System.out.println("*【Q4】");
		
		int[] mix = {12,7,9,21,5,18};
		
		int max = mix[0];
		int min = mix[0];
		
		for(int a = 1; a < mix.length; a++) {
			
			if(max < mix[a]) {
				max = mix[a];
			}
			
			if(min > mix[a]) {
				min = mix[a];
			}
		}
		
		System.out.println("最大値：" + max);
		System.out.println("最小値：" + min);
		
		
	/*Q5*/
		System.out.println("*【Q5】");
		
		int[] num = {1,2,3,4,5};
		
		for (int z : num) {
			
			System.out.println(z * 2);
		}
		
		
	/*Q6*/
		System.out.println("*【Q6】");
		
		int[] rans = {4,7,10,15,20};
		
		System.out.println("いずれかの値を入力⇒");
		
		int input = scanner.nextInt();
		
		boolean exists = Arrays.stream(rans).anyMatch(n -> n == input);
		
		if (exists) {
			System.out.println(input + "は配列に含まれています");
		}else {
            System.out.println(input + "は含まれていません。");
        }
		
	/*Q7*/
		System.out.println("*【Q7】");
		
	    int[][] array = {{1,2},{3,4},{5,6}};
	    
	    for (int A = 0; A < array.length; A++) {
	    	
	    	for (int B = 0; B < array[A].length; B++) {
	    		System.out.println(array[A][B] + "");
	    	}
	    	
	    	System.out.println(); 
	     }
	    
	/*Q8*/
	    System.out.println("*【Q8】");
	    
	    int[][] array1 = {
	    		
	    		{10,20,30},
	    		{40,50,60},
	    		{70,80,90}
	    		
	    };
	    
	    int sumS = 0;
	    
	    for (int[] row : array1) {
	    	
	    	for (int value : row) {
	    		
	    		sumS += value;
	    	}
	    }
	    
	    System.out.println("合計値：" + sumS);
	    
	    
	 /*Q9*/
	    System.out.println("*【Q9】");
	    
	    int[][] matrix = {
	    		
	    		{12,15,8},
	    		{6,19,25},
	    		{30,2,10}
	    		
	    };
	    
	    int max1 = matrix[0][0];
	    int min1 = matrix[0][0];
	    
	    for(int[] row : matrix) {
	    	for (int value : row) {
	    		
	    		if (value > max1) {
	    			max1 = value;
	    		}
	    		
	    		if (value < min1) {
	    			min1 = value;
	    			
	    		}
	    	}
	    }
	    
	    System.out.println("最大値：" + max1);
		System.out.println("最小値：" + min1);
	    
		
	/*Q10*/
		System.out.println("*【Q10】");
		
		int[][][] all = {
				
				{{1,2},{3,4}},
				{{5,6},{7,8}}
				
		};
		
		for(int[][] xx : all) {
			
		
			for(int[] yy : xx) {
				
				for(int zz : yy) {
					System.out.print(zz + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
		
	}//--------------------------------------------------

}//---------------------------------------------------------------------
