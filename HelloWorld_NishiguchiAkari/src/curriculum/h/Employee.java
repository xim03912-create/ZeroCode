package curriculum.h;

abstract class Employee {

	protected String employeed;
	protected String name;
	
	
	public Employee(String id, String name) { //コンストラクタ
		
		this.employeed = id;
		this.name = name;
		
	}
	
	
	public abstract int calculateDailyWage(int hoursWorked); //メソッド
	
	
}
    class FullTimeEmployee extends Employee {
		
		private static final int HOURLY_RATE = 1200; //定数
		
		public FullTimeEmployee(String id, String name) {
			super(id, name);
			// TODO 自動生成されたコンストラクター・スタブ
		}
		
		@Override
		public int calculateDailyWage(int hoursWorked) { 
			
			if (hoursWorked <= 8) {
				return hoursWorked * HOURLY_RATE;
			} else {
				int regularPay = 8 * HOURLY_RATE;
				int overtimeHours = hoursWorked - 8;
				
				int overtimePay = (int) (overtimeHours * HOURLY_RATE * 1.25);
				return regularPay + overtimePay;
			}
		}
	
	}
    
	class PartTimeEmployee extends Employee {//---
			
		private static final int HOURLY_RATE = 1000; //定数
			
		public PartTimeEmployee(String id, String name) {
			super(id, name);
			// TODO 自動生成されたコンストラクター・スタブ
		}
	 
		@Override
		public int calculateDailyWage(int hoursWorked) { 
			
			return hoursWorked * HOURLY_RATE;
		}
		
	
	}//---
	
	


