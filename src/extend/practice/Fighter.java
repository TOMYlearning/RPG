package extend.practice;

public class Fighter extends Human {
	public String weapon = "拳";
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
		System.out.print(this.name +"が"+this.weapon+"で攻撃！");
		target.hp  -= Rand.get()*this.offensive; 
		System.out.println(target.name + "に" + Rand.get()*this.offensive + "のダメージを与えた！");
	}
}
