package curriculum.i;

public abstract  class Employee {

	public String name; // publicにするかgetterを作る
    public Employee(String name) { this.name = name; }
    public abstract double calculateDailyWage();
    
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
