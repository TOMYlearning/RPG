package extend.practice;

public class Dragon extends Monster {
	public String weapon = "ブレス";
	public Dragon() {
		name = "ドラゴン";
		hp = 10000;
		offensive =100;
	}
	
	public Dragon(String name,int hp,int offensive) {
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
