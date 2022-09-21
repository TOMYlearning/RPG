package extend.practice;

public class Wizard extends Human {
	
	@Override
	public void attack(Living target) {
		System.out.println(this.name +"が魔法で攻撃！");
	}
}
