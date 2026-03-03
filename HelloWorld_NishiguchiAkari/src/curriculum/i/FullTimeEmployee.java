package curriculum.i;

public class FullTimeEmployee extends Employee {
    double monthlySalary;
	public FullTimeEmployee(String name, double monthlySalary) {
		super(name);
		this.monthlySalary = monthlySalary;
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
    public double calculateDailyWage() { return Math.round(monthlySalary / 20.0); }
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
