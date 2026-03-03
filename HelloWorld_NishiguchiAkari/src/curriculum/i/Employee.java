package curriculum.i;

import java.util.ArrayList;
import java.util.List;

abstract class Employee {

	String name;
	Employee(String name){ this.name = name; }
	
	abstract double calculateDailyWage();
	
}
	class FullTimeEmployee extends Employee { //FullTimeEmployee 
		double monthlySalary;
		FullTimeEmployee(String name, double monthlySalary) {
			super(name);
			this.monthlySalary = monthlySalary;
		}
		@Override
	    double calculateDailyWage() {
	        return Math.round(monthlySalary / 20.0); // 月20日勤務換算
	    }
	}
	
	class ContractEmployee extends Employee { //ContractEmployee 
	    double hourlyRate;
	    int hoursPerDay;
	    ContractEmployee(String name, double hourlyRate, int hoursPerDay) {
	        super(name);
	        this.hourlyRate = hourlyRate;
	        this.hoursPerDay = hoursPerDay;
	    }

	    @Override
	    double calculateDailyWage() {
	        return hourlyRate * hoursPerDay;
	    }
	    
	    
	public static void main1(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

       List<Employee> employees = new ArrayList<>();
        
         employees.add(new FullTimeEmployee("田中",1250));
         employees.add(new ContractEmployee("佐藤", 1500, 8));
         employees.add(new FullTimeEmployee("鈴木", 300000));
     
         for (Employee e : employees) { //or-each ループで calculateDailyWage を呼び出し、各社員の給料を出力する
             System.out.println(e.name + "さんの本日の給与: " + e.calculateDailyWage() + "円");
         }
         
	}

}
