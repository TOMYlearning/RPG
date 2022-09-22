package extend.practice;

public class Dragon extends Monster {
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
		System.out.print(this.name +"の攻撃！");
	}

}
