package curriculum.e;

public class Employee { // 1

    String name; // 2
	
	public Employee(String name) {
		
		this.name = name;
	}
		
	public void work() { //メソッド
			
		System.out.println(name + "は働いています。");
			
	}
	
	
	
	public static void main(String[] args) { // 3
		// TODO 自動生成されたメソッド・スタブ

		Employee e1 = new Employee("山田太郎"); //オブジェクト
		
		e1.work();
		
	}//-------------------------------------------------------------

}//----------------------------
