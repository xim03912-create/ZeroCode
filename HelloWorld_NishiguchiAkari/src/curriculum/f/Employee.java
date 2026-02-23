package curriculum.f;

public class Employee {

	private static String employeeId; // employeeId（文字列型）フィールド
	private static String name;

	public Employee(String employeeId , String name) {
		
		this.employeeId = employeeId;
		this.name = name;
	}
	
	public void showInfo() { //showInfo() メソッド：社員ID: [employeeId], 名前: [name] と出力する
		
		System.out.println("社員ID：" + employeeId +  "," + "名前：" + name);
			
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Employee id = new Employee("E001", "佐藤太郎"); // employeeId に「E001」、name に「佐藤太郎」を設定する
		
		id.showInfo(); // showInfo() を呼び出して、出力を確認する
	
	}

}
