package extend.practice;

public class Fighter extends Human {
	public Fighter() {
		name = "剣闘士";
		hp = 1000;
		offensive =10;
	}
	
	public Fighter(String name,int hp,int offensive) {
		this.name = name;
		this.hp = hp;
		this.offensive = offensive;
	}
	@Override
	public void attack(Living target) {
		System.out.println(this.name +"が拳で攻撃！");
		System.out.println(this.offensive +"のダメージ！");
	}
}
