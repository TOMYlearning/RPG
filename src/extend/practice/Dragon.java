package extend.practice;

public class Dragon extends Monster {
	public Dragon() {
		name = "ドラゴン";
		hp = 10000;
		offensive =10;
	}
	
	public Dragon(String name,int hp,int offensive) {
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
