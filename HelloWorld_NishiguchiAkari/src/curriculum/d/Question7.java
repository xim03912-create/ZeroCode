package curriculum.d;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Player {
	// インスタンスフィールドを定義
	String name;
	int hp;
	int at;
	int sp;
	
	// コンストラクタを定義しインスタンスフィールドに値をセット
	public Player (String name, int hp, int at, int sp) {
		this.name = name;
		this.hp = hp;
		this.at = at;
		this.sp = sp;
	}

	public boolean isAlive() {
		// TODO 自動生成されたメソッド・スタブ
		return this.hp > 0;
	}
	public String getStatus() {
        return String.format("[%s] HP:%d AT:%d SP:%d", name, hp, at, sp);
    }
}

class BattleLogger {
	private List<String> logs = new ArrayList<>();
	
	public void log(String commentary) {
		System.out.println(commentary);//出力担当
		logs.add(commentary);//記録担当
	}
	
	 public void saveToFile(String fileName) {
	        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(fileName)))) {
	            for (String line : logs) pw.println(line);
	            System.out.println("\n--- ログを " + fileName + " に保存しました ---");
	        } catch (IOException e) {
	            System.err.println("ログ保存エラー: " + e.getMessage());
	        }
	    }
	 
}
public class Question7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		BattleLogger logger = new BattleLogger();
		Random rand = new Random();
		
		List<Player> players = new ArrayList<>();
		
		// Playerの名前を入力し、ステータス（HP, AT, SP）をランダム設定
		players.add(new Player("勇者",rand.nextInt(41) + 80, 20, 12));
		players.add(new Player("魔法使い",rand.nextInt(41) + 100, 10, 8));
		players.add(new Player("戦士",rand.nextInt(41) + 60, 50, 5));
		
		
		//Daemonのステータスは事前にテキストファイルから読み込み
		Player daemon = loadDaemon("daemon_status.txt");
		if (daemon == null) return;
		
		logger.log("=== バトル開始 ===");
        logger.log("エネミー出現: " + daemon.getStatus());
		
		// プレイヤーが順番にDaemonに挑む
		for (Player player : players) {
			if(!daemon.isAlive()) 
			break;
			
			logger.log("\n--- " + player.name + " のターン ---");
            logger.log("Player: " + player.getStatus());
            
            runBattle(player, daemon, logger, rand);
		}
		// 最終結果
        logger.log("\n=== 全戦闘終了 ===");
        logger.log(daemon.isAlive() ? "Daemon の勝利..." : "Playerチーム の勝利！");

        logger.saveToFile("battle_log.txt");
	}
	
	//1対1のバトルロジック
	private static void runBattle(Player player, Player daemon, BattleLogger logger, Random rand) {
		// TODO 自動生成されたメソッド・スタブ
		// 先攻決定
        Player first = player, second = daemon;
        if (daemon.sp > player.sp || (player.sp == daemon.sp && rand.nextBoolean())) {
            first = daemon; second = player;
        }
        logger.log("先攻: " + first.name);

        while (player.isAlive() && daemon.isAlive()) {
            executeAttack(first, second, logger);
            if (second.isAlive()) {
                executeAttack(second, first, logger);
            }
        }
    }
		
	// 攻撃の実行
	private static void executeAttack(Player first, Player second, BattleLogger logger) {
		// TODO 自動生成されたメソッド・スタブ
		second.hp -= first.at;
        logger.log(String.format("%s の攻撃！ %s に %d ダメージ (残りHP: %d)", 
        		first.name, second.name, first.at, Math.max(0, second.hp)));
	}

	

	// Daemonの読み込み（受付窓口）
    private static Player loadDaemon(String file) {
    	try (BufferedReader br = new BufferedReader(new FileReader(file))) {
    		String name = br.readLine();
    		int hp =Integer.parseInt(br.readLine());
    		int ap =Integer.parseInt(br.readLine());
    		int sp =Integer.parseInt(br.readLine());
    		return new Player(name,hp,ap,sp);
    	} catch (Exception e) {
    		return null;
    	}
		
	
    }


}

