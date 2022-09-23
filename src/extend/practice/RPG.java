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
		int w,hcount,mcount;
		//実行処理↓
		while (true){
			System.out.println("人間のターン");
			hcount = humanList.size();
			mcount = monsterList.size();

			//ランダムターゲット
			Human humanAtk = humanList.get(r.nextInt(hcount));
			Monster monsterDef = monsterList.get(r.nextInt(mcount));
			
			//攻撃フェーズ
			humanAtk.attack(monsterDef);
			
			//ダメージ判定
			if(monsterDef.hp <= 0) {
				monsterList.remove(monsterDef);
				System.out.println(monsterDef.name + "は倒れた。");
			}
			System.out.println();
			if(monsterList.isEmpty()) {
				System.out.println("人間の勝利");
				System.exit(0);
			}
			
			System.out.println("モンスターのターン");
			hcount = humanList.size();
			mcount = monsterList.size();
			
			//ランダムターゲット
			Monster monsterAtk = monsterList.get(r.nextInt(mcount));
			Human humanDef = humanList.get(r.nextInt(hcount));
			
			//攻撃フェーズ
			monsterAtk.attack(humanDef);
			//ダメージ判定
			if(humanDef.hp <= 0) {
				humanList.remove(humanDef);
				System.out.println(humanDef.name + "は倒れた。");
			}
			System.out.println();
			if(humanList.isEmpty()) {
				System.out.println("モンスターの勝利");
				System.exit(0);	
			}
		}
	}
}