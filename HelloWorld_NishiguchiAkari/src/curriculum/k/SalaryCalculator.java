package curriculum.k;

/*class SalaryCalculator { //SalaryCalculator は 依存を抽象化（インターフェイス/抽象クラス） する
	
	public void calculateSalary(Employee e) {
		
		
		if (e.getType().equals("FullTime")) {
			System.out.println(e.getName() + " の給料は " + (e.getHours() * 1200) + " 円");
		}else if (e.getType().equals("Contract")) {
			
		}System.out.println(e.getName() + " の給料は " + (e.getHours() * 1000) + " 円");
	}
	
	
}//-----------------------------------------------------

class Employee { //Employee に型情報を持たせるのではなく、ポリモーフィズムを活用！
	private String name;
	private String type;
	private int hours;
	
	public Employee(String name, String type, int hours) {
		this.type = type;
		this.hours = hours;
	}
	
	public String getName() { return name; }
	public String getType() { return type; }
	public int getHours() { return hours; }
	

}//-------------------------------------------------------

*/


	
	interface Payable { // インターフェイス
		
		int calculateSalary();

		String getType();

		String getName();
	}

	abstract class Employee implements Payable { //抽象クラス
		// フィールド
		private String name;
		private String type;
		private int hours;
	}
	
	
	
    // FullTimeEmployee
	class FullTimeEmployee implements Payable { // 計算ルールを変えたい場合 S
		private String name;
		private String type;
		private int hours;
		
		//コンストラクタ
		public FullTimeEmployee(String type, String name, int hours) {
			this.name =name;
			this.type = type;
			this.hours = hours;
		}
		
		@Override
	    public String getType() {
	        return type;
	    }
		@Override
		public String getName() {
			return name;
		}
		@Override
	    public int calculateSalary() { //メソッド
	        return hours * 1200; 
	    }
	}
	
	// ContractEmployee
	class ContractEmployee implements Payable { // 計算ルールを変えたい場合 S
	    private String name;
	    private String type;
	    private int hours;

	    public ContractEmployee(String type, String name,  int hours) {
	        this.name = name;
	        this.type = type;
	        this.hours = hours;
	    }
	    
	    @Override
	    public String getType() {
	        return type;
	    }
	    
	    @Override
	    public String getName() {
	        return name;
	    }

	    @Override
	    public int calculateSalary() { //メソッド
	        return hours * 1000;
	    }
	}
	
	class PartTime implements Payable { // 新たな社員タイプを追加
	    private String name;
	    private String type;
	    private int hours;
		

	    public PartTime(String type, String name,  int hours) {
	        this.name = name;
	        this.type = type;
	        this.hours = hours;
	    }
	    
	    @Override
	    public String getType() {
	        return type;
	    }
	    
	    @Override
	    public String getName() {
	        return name;
	    }

	    @Override
	    public int calculateSalary() { //メソッド
	        return hours * 1000;
	    }
	}
	
	

	class SalaryReporter { //表示形式を変えたい場合
		public void report(Payable payable) {
			
			System.out.println(payable.getType() + "：" +  payable.getName() + "：" + payable.calculateSalary() + "円");
			
		}
	}
	

	
	
	
	
	
	
	
	
	