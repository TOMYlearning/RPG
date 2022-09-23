package extend.practice;

public class Slime extends Monster {
	public String weapon = "体当たり";
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
		System.out.print(this.name +"が"+this.weapon+"で攻撃！");
		target.hp  -= Rand.get()*this.offensive; 
		System.out.println(target.name + "に" + Rand.get()*this.offensive + "のダメージを与えた！");
	}

}
