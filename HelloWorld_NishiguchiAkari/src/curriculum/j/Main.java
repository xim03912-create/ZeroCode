package curriculum.j;

import java.util.ArrayList;
import java.util.List;


//インターフェイス Billable
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

//FullTimeEmployee
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

//ContractEmployee
class ContractEmployee extends Employee {

public ContractEmployee(int id, String name) {
  super(id, name);
}


@Override
public int costForDay(int hoursWorked) {
  return hoursWorked * 1000;
}


}


public class Main {

	public static void main(String[] args) {
	     // List<Billable> ポリモーフィズム
	     List<Billable> staffList = new ArrayList<>();

	     staffList.add(new FullTimeEmployee(101, "田中")); // 8時間勤務想定
	     staffList.add(new FullTimeEmployee(102, "佐藤")); // 10時間勤務想定（残業あり）
	     staffList.add(new ContractEmployee(201, "鈴木")); // 8時間勤務想定

	    
	     int[] hours = {9, 9, 8};

	     System.out.println("--- 日給計算一覧 ---");
	     for (int i = 0; i < staffList.size(); i++) {
	         
	    	 Billable e = staffList.get(i);
	    	 
	         System.out.println(e.getName() + "さんの日給：" + e.costForDay(hours[i]) + "円");
	     }
	 }
}
