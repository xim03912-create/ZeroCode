package curriculum.d;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

class Player { //Character クラス:共通のキャラクター情報（HP, AT, SP）を管理

	String name;
	int hp;
	int ap;
	int sp;
	
	public Player (String name, int hp, int ap, int sp) {
		this.name = name;
		this.hp = hp;
		this.ap = ap;
		this.sp = sp;
    }
}


public class Question7 {

	public static void main(String[] args) {

// 1 ------------------------------------------------------------------------
		Scanner s = new Scanner(System.in); //Playerの名前を入力し
		Random ran = new Random();//ステータス（HP, AT, SP）をランダム設定

		//名前
		System.out.println("Playerの名前を入力");
		String inputName = s.nextLine();
		
		//ステータス
		int hp = ran.nextInt(51) + 100;
		int ap = ran.nextInt(11) + 10;
		int sp = ran.nextInt(10 + 1);	
		
        Player player = new Player(inputName, hp, ap, sp);

        System.out.println("\n---------------------------");
        System.out.println("YOUSTATUS");
        System.out.println("\n名前: " + player.name);
        System.out.println("HP  : " + player.hp);
        System.out.println("AP  : " + player.ap);
        System.out.println("SP  : " + player.sp);
        System.out.println("\n--------------------------");
        
// 2 ------------------------------------------------------------------------
         //★loadDaemon メソッドを呼び出して敵を生成
        Player daemon = loadDaemon("daemon_status.txt");
        
     // ファイルが読み込めなかった（nullが返った）場合は終了
        if (daemon == null) {
            s.close();
            return;
        }
        
            System.out.println("DAEMONSTATUS");
            System.out.println("\n名前: " + daemon.name);
            System.out.println("HP  : " + daemon.hp);
            System.out.println("AP  : " + daemon.ap);
            System.out.println("SP  : " + daemon.sp);
            System.out.println("\n--------------------------");


        
// 3 ------------------------------------------------------------------------
        
        System.out.println("【BATTLE START】");
        
        try (PrintWriter pw = new PrintWriter(new FileWriter("battle_log.txt"))) { //バトルの結果をテキストファイルに出力
            pw.println("--- バトルログ ---");
            pw.println(player.name + "HP:" + player.hp + "VS" + daemon.name + "HP:" + daemon.hp );
            
        //先攻決定
        Player first,second;
        
		if (player.sp > daemon.sp) { //player
			
			first = player; second = daemon;
			
        } else if (daemon.sp > player.sp) { //daemon
        	
        	first = daemon; second = player;
        	
        } else {
        	
        	if (ran.nextBoolean()) { //player=daemon
        		first = player;
        		second = daemon;
        	}else {
        		first = daemon; second = player;
        	}
        	
        }
		
		System.out.println("先行：" + first.name);
        
        
        // ターン制バトルを行い
        while (player.hp > 0 && daemon.hp > 0) {
            // 先攻の攻撃
            attack(first, second, pw);
            if (second.hp <= 0) break;

            // 後攻の攻撃
            attack(second, first, pw);
        }

        // 決着
        String winner = (player.hp > 0) ? player.name : daemon.name; //どちらかのHPが0以下になるまで続ける
        String result = "\n勝者: " + winner ;
        System.out.println(result);
        
        pw.println(result); //結果を battle_log.txt に記録
        
        } catch (IOException e) {
			// TODO 自動生成された catch ブロック
        	System.out.println("ログの保存に失敗しました。");
		}
        
        s.close();
    
        }
	
	// ★Daemon のステータスをテキストファイルから読み込むメソッド
    public static Player loadDaemon(String filePath) {
        try {
            File file = new File(filePath);
            Scanner fileScanner = new Scanner(file);

            String dName = fileScanner.nextLine();
            int dHp = Integer.parseInt(fileScanner.nextLine());
            int dAp = Integer.parseInt(fileScanner.nextLine());
            int dSp = Integer.parseInt(fileScanner.nextLine());

            return new Player(dName, dHp, dAp, dSp);

        } catch (FileNotFoundException e) {
            System.out.println("\n[エラー] " + filePath + " が見つかりません。");
            return null;
        } catch (Exception e) {
            System.out.println("\n[エラー] データの読み込みに失敗しました。");
            return null;
        }
    }
    
    // 攻撃処理の共通メソッド
    public static void attack(Player attacker, Player defender, PrintWriter pw) {
        defender.hp -= attacker.ap;
        String log = attacker.name + " の攻撃！ " + defender.name + " に " + attacker.ap + " のダメージ！" + "\n【" + defender.name +"残りHP: " + Math.max(0, defender.hp)  + "】";
        
        System.out.println(log);
        pw.println(log); // バトルログをtxtに1行ずつ記録

    }
    
    
    
}
