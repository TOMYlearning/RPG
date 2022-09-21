package extend.practice;

public class Slime extends Monster {
	public Slime() {
		name = "スライム";
		hp = 100;
		offensive =1;
	}
	
	public Slime(String name,int hp,int offensive) {
		this.name = name;
		this.hp = hp;
		this.offensive = offensive;
	}
	@Override
	public void attack(Living target) {
		System.out.println(this.name +"の攻撃！");
		System.out.println(this.offensive +"のダメージ！");
	}

}
