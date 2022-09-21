package extend.practice;

public class Brave extends Human {
	public Brave() {
		this.name = "勇者";
		this.hp = 1000;
		this.offensive = 10;
	}
	
	@Override
	public void attack(Living target) {
		System.out.println("が剣で攻撃！");
	}
}
