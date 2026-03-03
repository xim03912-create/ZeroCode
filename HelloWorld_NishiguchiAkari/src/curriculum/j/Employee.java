package curriculum.j;

// インターフェイス Billable
interface Billable {

	int costForDay(int hoursWorked); //メソッド

	String getName();
}


abstract class Employee implements Billable { //抽象クラス

	private int id;
	private String name;
	
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

}

// FullTimeEmployee
class FullTimeEmployee extends Employee {

 public FullTimeEmployee(int id, String name) {
     super(id, name);
 }

 @Override
 public int costForDay(int hoursWorked) {
     int regularPay = Math.min(hoursWorked, 8) * 1250;
     int overtimePay = (int) (Math.max(0, hoursWorked - 8) * 1250 * 1.25);
     return regularPay + overtimePay;
     
     
 }
 
}

// ContractEmployee
class ContractEmployee extends Employee {

 public ContractEmployee(int id, String name) {
     super(id, name);
 }


 @Override
 public int costForDay(int hoursWorked) {
     return hoursWorked * 1000;
 }


}

