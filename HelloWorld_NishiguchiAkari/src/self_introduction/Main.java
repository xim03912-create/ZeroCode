package self_introduction;

class Person {
	// インスタンスフィールドを定義
	String name;
	int age;
	double height;
	double weight;
	double bmi;
	
	static int count = 0;
	
	
	 // コンストラクタを定義しインスタンスフィールドに値をセット
	 Person(String n, int age, double h, double w){
		 
		 this.name = n;
		 this.age = age;
		 this.height = h;
	     this.weight = w;
	     
	     
	     Person.count++;
	 }
	 
	 //インスタンスメソッドbmiの定義
	 
	 public double bmi() {
		 
		 return ( this.weight / (this.height * this.height) );
	 }
	 
	 public void print() {
		 System.out.println("名前は" + this.name + "です");
		 System.out.println("年は" + this.age + "です");
		 System.out.println("BMIは" + this.bmi() + "です");
	 }
	 
	 public static void printCount() {
	        System.out.println("合計" + Person.count + "人です");
	 }
	 
}



public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Person person1 = new Person("鈴木太郎", 20, 1.7, 60.0);
	    
	    person1.print();
	    
	    Person.printCount();
	}
	
	

}
