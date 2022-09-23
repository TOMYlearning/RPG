package extend.practice;

public class Ork extends Monster {
	public String weapon = "こん棒";
	public Ork() {
		name = "オーク";
		hp = 1000;
		offensive =40;
	}
	
	public Ork(String name,int hp,int offensive) {
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
