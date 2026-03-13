package curriculum.g;

public class Employee {

	private String employeeId; //employeeId（文字列型）
	private String name; //name（文字列型）
	
	public void setEmployeeId(String id) {
		
		this.employeeId = id;
		
	}
	
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	
	public String getEmployeeId() {
		return employeeId;
	}
	public String getName() {
		return name;
	}
	
	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Employee employee = new Employee ();
		
		employee.setEmployeeId("E002");
		employee.setName("田中花子");
		
		String id  = employee.getEmployeeId();
		String n  = employee.getName();
		
		System.out.println("社員ID：" + id + "," + "名前：" + n);
	} //----------------------------------------------

}//------------------------------------------------
