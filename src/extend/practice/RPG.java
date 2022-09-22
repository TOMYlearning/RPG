package extend.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RPG {
	public static void main(String[] args) {
		
		//人間リスト
		List<Human> humanList = new ArrayList<>();
		Brave brave = new Brave();
		Fighter fighter = new Fighter();
		Wizard wizard = new Wizard();
		
		humanList.add(brave);
		humanList.add(fighter);
		humanList.add(wizard);
		
		
		//モンスターリスト
		List<Monster> monsterList = new ArrayList<>();
		Dragon dragon = new Dragon();
		Ork ork = new Ork();
		Slime slime = new Slime();
		
		monsterList.add(dragon);
		monsterList.add(ork);
		monsterList.add(slime);
		
		//ランダム変数
		Random r = new Random();
		int w;
		//実行処理↓
		for(int count = 0; count < 100; count++) {
			
			System.out.println("人間のターン");
			
			//ランダムターゲット
			Human humanAtk = humanList.get(r.nextInt(1));
			Monster monsterDef = monsterList.get(r.nextInt(1));
			w = r.nextInt(10);
			//攻撃フェーズ
			humanAtk.attack(monsterDef);
			monsterDef.hp  -= w*humanAtk.offensive; 
			System.out.println(monsterDef.name + "に" + w*humanAtk.offensive + "のダメージを与えた！");
			
			//ダメージ判定
			while(monsterDef.hp <= 0) {
				monsterList.remove(monsterDef);
				System.out.println(monsterDef.name + "は倒れた。");
				break;
			}
			System.out.println();
			while(monsterList.isEmpty()) {
				System.out.println("人間の勝利");
				System.exit(0);
			}
			
			System.out.println("モンスターのターン");
			
			//ランダムターゲット
			Monster monsterAtk = monsterList.get(r.nextInt(1));
			Human humanDef = humanList.get(r.nextInt(1));
			w = r.nextInt(10);
			
			monsterAtk.attack(humanDef);
			humanDef.hp  -= w*monsterAtk.offensive; 
			System.out.println(humanDef.name + "に" + w*monsterAtk.offensive + "のダメージを与えた！");
			
			//ダメージ判定
			while(humanDef.hp <= 0) {
				humanList.remove(humanDef);
				System.out.println(humanDef.name + "は倒れた。");
				break;
			}
			System.out.println();
			while(humanList.isEmpty()) {
				System.out.println("モンスターの勝利");
				System.exit(0);	
			}
			
		}
	}
}