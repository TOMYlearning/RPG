package extend.practice;

public class Ork extends Monster {
	public Ork() {
		name = "オーク";
		hp = 1000;
		offensive =10;
	}
	
	public Ork(String name,int hp,int offensive) {
		this.name = name;
		this.hp = hp;
		this.offensive = offensive;
	}
	@Override
	public void attack(Living target) {
		System.out.println(this.name +"の攻撃！");
		System.out.println(this.name +"のダメージ！");
	}


}
