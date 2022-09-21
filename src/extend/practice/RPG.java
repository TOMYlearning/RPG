package extend.practice;

import java.util.ArrayList;
import java.util.List;

public class RPG {
	public static void main(String[] args) {
		
		List<Human> Humanlist = new ArrayList<>();
		Brave brave = new Brave();
		Fighter fighter = new Fighter();
		Wizard wizard = new Wizard();
		
		Humanlist.add(brave);// "あ"
		Humanlist.add(fighter);// "あ","い"
		Humanlist.add(wizard);// "あ","い","う";
		
		List<Monster> Monsterlist = new ArrayList<>();
		Dragon dragon = new Dragon();
		Ork ork = new Ork();
		Slime slime = new Slime();
		
		Monsterlist.add(dragon);
		Monsterlist.add(ork);
		Monsterlist.add(slime);
				
		brave.attack(slime);
		System.out.println("勇者の攻撃");
		
	}
}
