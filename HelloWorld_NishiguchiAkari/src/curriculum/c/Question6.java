package curriculum.c;

import java.util.Random;
import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner s = new Scanner (System.in);
		Player p = new Player(s);
		CPU cpu = new CPU();
		
		
		
		while (true) {
			System.out.println("✊（0）,✌（1）,✋（2）を入力");
			
			
			int playerHand = p.chooseHand();
			
			if (playerHand < 0 || playerHand > 2) {
				continue;
			}
			
			int cpuHand = cpu.generateHand();
			
			 // 手の表示
            System.out.println("あなたの手: " + getHandName(playerHand));
            System.out.println("CPUの手  : " + getHandName(cpuHand));
			
			if (playerHand == cpuHand) {
				
				System.out.println("【あいこ】");
				
			}else if (
					  (playerHand == 0 && cpuHand == 1) ||
					  (playerHand == 1 && cpuHand == 2) ||
					  (playerHand == 2 && cpuHand == 0)) {
				
				System.out.println("【勝ち】");
				
				break;
				
			}else {
				
				System.out.println("【負け】");
			}
			
			
		}
		
	}//-------------------------------
	
	
    private static String getHandName(int hand) {
    	
	    switch(hand) {
	    
	      case 0: return "✊";
	      case 1: return "✌";
	      case 2: return "✋";
	      default:return "不明";
	    
		}
	}
    
}//-----------------------------------------

class Player {
	private Scanner s;
	
	public Player(Scanner scanner) {
		this.s = scanner;
	}
	
	public int chooseHand() {
		return s.nextInt();
	}
}

class CPU {
	private Random random = new Random();
	
	public int generateHand() {
		return random.nextInt(3);
	}
	
}