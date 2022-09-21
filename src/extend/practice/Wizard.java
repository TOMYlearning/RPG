package extend.practice;

public class Wizard extends Human {
	public Wizard() {
		name = "魔法使い";
		hp = 1000;
		offensive =10;
	}
	
	public Wizard(String name,int hp,int offensive) {
		this.name = name;
		this.hp = hp;
		this.offensive = offensive;
	}
	@Override
	public void attack(Living target) {
		System.out.println(this.name +"が魔法で攻撃！");
		System.out.println(this.offensive +"のダメージ！");
	}
	
}
