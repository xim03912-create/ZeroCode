package curriculum.i;

import java.util.ArrayList;
import java.util.List;


abstract class Employee { //抽象クラス
	protected String id;
	protected String name;
	
	Employee(String id, String name) { //コンストラクタ
		this.id = id;
		this.name = name;
	}
	
	public abstract int calculateDailyWage(int hoursWorked);
	

}//-----------------------------------
class FullTimeEmployee extends Employee { 
		
	    FullTimeEmployee(String id, String name) {
		    super(id, name);
	    }
	    @Override
	    
	    public int calculateDailyWage(int hoursWorked) {
	    	
		    int hourlyRate = 1250;
            int overtime = Math.max(0, hoursWorked - 8);
            int regularHours = hoursWorked - overtime;
            
            return (regularHours * hourlyRate) + (int)(overtime * hourlyRate * 1.25);
        }
    }//FullTimeEmployee
	
	class ContractEmployee extends Employee {
		
	    ContractEmployee(String id, String name) {
			super(id, name);
		}
		@Override
		public int calculateDailyWage(int hoursWorked) {
			
			int hourlyRate = 1000;
			
			return hoursWorked * hourlyRate;
		}
	}//ContractEmployee

public class Main {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		
		
		employees.add(new FullTimeEmployee("F001", "佐藤"));
		
		employees.add(new FullTimeEmployee("F002", "山田"));
		
		employees.add(new ContractEmployee("C002", "田中"));
		
		
		int workHours = 9; 
        
        for (Employee e : employees) { //ポリモーフィズム?
            int dailyWage = e.calculateDailyWage(workHours);
            System.out.println("ID:" + e.id + " 名前:" + e.name + " 給与:" + dailyWage + "円");
        }
	}

}
