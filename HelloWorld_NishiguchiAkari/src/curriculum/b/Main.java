package curriculum.b;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		/*Q4*/System.out.println("*【Q4】");
		
		Greeting greeting = new Greeting();
		
		greeting.sayHello();
		
		
		
		/*Q5*/System.out.println("*【Q5】");

		Animal lion = new Animal();
		
		lion.setName("ライオン");
		lion.setLength(2.1);
		lion.setSpeed(80);
		
		
		
		System.out.println("動物名：" + lion.getName());
		System.out.println("体長：" + lion.getLength() + "m");
		System.out.println("速度：" + lion.getSpeed() + "km/h");
	}


}
