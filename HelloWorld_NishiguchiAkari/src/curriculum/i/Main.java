package curriculum.i;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<Employee> employees = new ArrayList<>();
		

		 employees.add(new FullTimeEmployee("田中", 400000));
	     employees.add(new ContractEmployee("佐藤", 1500, 8));
	     employees.add(new FullTimeEmployee("鈴木", 400000));
	     employees.add(new ContractEmployee("山本", 1500, 10));
	     
	        for (Employee e : employees) {
	        	
	            System.out.println(e.name + "さんの給与: " + e.calculateDailyWage() + "円");
	        }
	}

}
