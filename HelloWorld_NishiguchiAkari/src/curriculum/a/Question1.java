/**********************************************************************************
* [概要] curriculum.a 変数① 各型の変数の宣言及び初期値の設定の処理
* [詳細] 各型の変数の宣言及び初期値の設定をした後、して位置を代入する。
**********************************************************************************/
package curriculum.a;

public class Question1 {
	public static void main(String[] args) {
	/*Q1:各型の変数の宣言及び初期値の設定*/
		
		byte byteNum = 0; // byteNumの初期値を設定
		System.out.println("初期値: " + byteNum);
		
		short shortNum = 0; // shortNumの初期値を設定
		System.out.println("初期値: " + shortNum);
		
		int intNum = 0; // intNumの初期値を設定
		System.out.println("初期値: " + intNum);
		
		long longNum = 0; // longNumの初期値を設定
		System.out.println("初期値: " + longNum);
		
		float floatNum = 0; // floatNumの初期値を設定
		System.out.println("初期値: " + floatNum);
		
		double doubleNum = 0; // doubleNumの初期値を設定
		System.out.println("初期値: " + doubleNum);
		
		char letter = '0'; // letterの初期値を設定
		System.out.println("初期値: " + letter);
		
		String letters = "aaa"; // lettersの初期値を設定
		System.out.println("初期値: " + letters);
		
		boolean isBoolean = false;	// isBooleanの初期値を設定
		System.out.println("初期値: " + isBoolean);
		
	/*Q2:Q1で宣言した各型の変数に指定された値を代入*/
		
		byteNum =  10; // byteNumの指定値を設定
		System.out.println("更新後: " + byteNum);
		
		shortNum = 100; // shortNumの指定値を設定
		System.out.println("更新後: " + shortNum);
		
		intNum = 1000; // intNumの指定値を設定
		System.out.println("更新後: " + intNum);
		
		longNum = 10000; // longNumの指定値を設定
		System.out.println("更新後: " + longNum);
		
		floatNum = 9.5f; // floatNumの指定値を設定
		System.out.println("更新後: " + floatNum);
		
		doubleNum = 10.5; // doubleNumの指定値を設定
		System.out.println("更新後: " + doubleNum);
		
		letter = 'a'; // letterの指定値を設定
		System.out.println("更新後: " + letter);
		
		letters = "ハロー"; // lettersの指定値を設定
		System.out.println("更新後: " + letters);
		
		isBoolean = true; // isBooleanの指定値を設定
		System.out.println("更新後: " + isBoolean);
		
		
	/*Q3:値を代入した変数を用いて出力*/
		
		// 11110を出力
		longNum = longNum + intNum + shortNum + byteNum;
		System.out.println(longNum);
		
		// 20を出力
		doubleNum = doubleNum + floatNum;
		System.out.println(doubleNum);
		
		// a ハロー trueを出力
		letters = "a" + letters + "ture"; 
		System.out.println(letters);
		
		// 数字を全て足して出力	
		longNum = 10000; /* 変数の初期化 */	
		doubleNum = 10.5; /* 変数の初期化 */	
		
		doubleNum = doubleNum + floatNum +longNum + intNum + shortNum + byteNum;
		System.out.println(doubleNum);
		
		// 小数点以外の数字を全てかけて出力
		longNum = longNum * intNum * shortNum * byteNum;
		System.out.println(longNum);
		
		// 10.5割る100をして出力
		doubleNum = 10.5; /* 変数の初期化 */
		doubleNum = doubleNum / 100;
		System.out.println(doubleNum);
		
		// 10引く100をして出力
		byteNum = (byte) (byteNum - 100); //強制型変換
		System.out.println(byteNum);
		
		
	/*Q4:*/
		String name = "山田太郎";
		System.out.println( "こんにちは、" + name + "さん!");
		
    /*Q5*/
		int age = 25;
		System.out.println( "年齢:" + age);
	/*Q6*/
		int num1 = 10;
		int num2 = 5;
		int sum = num1 + num2;
		System.out.println(sum);
    /*Q7*/
		int score = 80;
		score = score + 20;
		System.out.println( "最終スコア:" + score);
	}

}
