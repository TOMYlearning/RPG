package extend.practice;

import java.util.ArrayList;
import java.util.List;

public class RPG {
	public static void main(String[] args) {
		
		//人間リスト
		List<Human> Humanlist = new ArrayList<>();
		Brave brave = new Brave();
		Fighter fighter = new Fighter();
		Wizard wizard = new Wizard();
		
		Humanlist.add(brave);
		Humanlist.add(fighter);
		Humanlist.add(wizard);
		
		
		//モンスターリスト
		List<Monster> Monsterlist = new ArrayList<>();
		Dragon dragon = new Dragon();
		Ork ork = new Ork();
		Slime slime = new Slime();
		
		Monsterlist.add(dragon);
		Monsterlist.add(ork);
		Monsterlist.add(slime);
		
		//実行処理↓
		System.out.println("戦闘前：スライムの残りHP:" + slime.hp);
		System.out.println("勇者の攻撃力:" + brave.offensive);
		while (slime.hp <= 0) {
			brave.attack(slime);
			slime.hp  = brave.offensive - slime.hp; 
			System.out.println("戦闘後：スライムの残りHP:" + slime.hp);
			while (slime.hp <= 0) {
				Monsterlist.remove(slime);
				System.out.println("スライムは倒れた。");
				
			}
		}
	}
}
