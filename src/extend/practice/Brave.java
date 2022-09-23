package extend.practice;

public class Brave extends Human {
	public String weapon = "剣";
	public Brave() {
		name = "勇者";
		hp = 1000;
		offensive =1000;
	}
	
	public Brave(String name,int hp,int offensive) {
		this.name = name;
		this.hp = hp;
		this.offensive = offensive;
	}
	
	@Override
	public void attack(Living target) {
		System.out.print(this.name +"が"+this.weapon+"で攻撃！");
		target.hp  -= Rand.get()*this.offensive; 
		System.out.println(target.name + "に" + Rand.get()*this.offensive + "のダメージを与えた！");
	}
}
