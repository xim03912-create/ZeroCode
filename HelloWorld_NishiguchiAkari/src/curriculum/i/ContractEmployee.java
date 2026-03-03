package curriculum.i;

public class ContractEmployee extends Employee{

	double hourlyRate;
    int hoursPerDay;
	public ContractEmployee(String name, double hourlyRate, int hoursPerDay) {
		super(name);
		this.hourlyRate = hourlyRate;
        this.hoursPerDay = hoursPerDay;
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public double calculateDailyWage() { return hourlyRate * hoursPerDay; }
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
