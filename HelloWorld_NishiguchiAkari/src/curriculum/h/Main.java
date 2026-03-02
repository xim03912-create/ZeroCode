package curriculum.h;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

        FullTimeEmployee ft = new FullTimeEmployee("F001","正社員A");
		
		PartTimeEmployee pt = new PartTimeEmployee("P001","パート社員B");
		
		
		int hours = 9;
		
		System.out.println("正社員の給与：" + ft.calculateDailyWage(hours) + "円");
		System.out.println("パート社員の給与：" + pt.calculateDailyWage(hours) + "円");
	}

}
