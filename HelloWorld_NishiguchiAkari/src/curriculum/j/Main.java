package curriculum.j;

import java.util.ArrayList;
import java.util.List;

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
