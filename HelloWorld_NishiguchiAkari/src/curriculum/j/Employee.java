package curriculum.j;

import java.util.ArrayList;
import java.util.List;

// 1. インターフェースの定義
interface Billable {
    int costForDay(int hoursWorked);
}


abstract class Employee implements Billable {

	protected int id;
	protected String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public abstract int costForDay(int hoursWorked);
	
	
	public String getName() {
		return name;
	}

}

//3. サブクラス: 正社員 (FullTimeEmployee)
class FullTimeEmployee extends Employee {
 private static final int HOURLY_RATE = 1250;
 private static final int REGULAR_HOURS = 8;

 public FullTimeEmployee(int id, String name) {
     super(id, name);
 }

 @Override
 public int costForDay(int hoursWorked) {
     if (hoursWorked <= REGULAR_HOURS) {
         return hoursWorked * HOURLY_RATE;
     } else {
         int overtime = hoursWorked - REGULAR_HOURS;
         return (int) (REGULAR_HOURS * HOURLY_RATE + overtime * HOURLY_RATE * 1.25);
     }
 }
}

//3. サブクラス: 契約社員 (ContractEmployee)
class ContractEmployee extends Employee {
 private static final int HOURLY_RATE = 1000;

 public ContractEmployee(int id, String name) {
     super(id, name);
 }

 @Override
 public int costForDay(int hoursWorked) {
     return hoursWorked * HOURLY_RATE;
 }
}

 class Main {
	 public static void main(String[] args) {
	     // List<Billable> として管理（ポリモーフィズム）
	     List<Billable> staffList = new ArrayList<>();

	     staffList.add(new FullTimeEmployee(101, "田中さん")); // 8時間勤務想定
	     staffList.add(new FullTimeEmployee(102, "佐藤さん")); // 10時間勤務想定（残業あり）
	     staffList.add(new ContractEmployee(201, "鈴木さん")); // 8時間勤務想定

	     // 勤務時間のシミュレーションデータ
	     int[] hours = {8, 10, 8};

	     System.out.println("--- 日給計算一覧 ---");
	     for (int i = 0; i < staffList.size(); i++) {
	         Billable staff = staffList.get(i);
	         int pay = staff.costForDay(hours[i]);
	         
	         // Note: 名前を表示したい場合は Employee にキャストするか、BillableにgetNameを入れる検討が必要ですが、
	         // 今回は要件通り Billable 型として振る舞い(costForDay)を呼び出します。
	         System.out.println("スタッフ " + (i + 1) + " の日給: " + pay + "円");
	     }
	 }
}
 