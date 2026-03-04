package curriculum.k;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		SalaryReporter reporter = new SalaryReporter();

        // ポリモーフィズムにより、異なる型の社員を同じ Payable として扱える
        Payable[] employees = {
            new FullTimeEmployee("正社員", "田中", 160),
            new ContractEmployee("契約社員","佐藤", 140),
            new PartTime("パート","山田", 140)
        };

        for (Payable e : employees) {
            reporter.report(e);
        }
        
	}

}
