package extend.practice;

public class Wizard extends Human {
	public String weapon = "魔法";
	public Wizard() {
		name = "魔法使い";
		hp = 1000;
		offensive =20;
	}
	
	public Wizard(String name,int hp,int offensive) {
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
