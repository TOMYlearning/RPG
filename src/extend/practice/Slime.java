package extend.practice;

public class Slime extends Monster {

	@Override
	public void attack(Living target) {
		System.out.println(this.name +"の攻撃！");
	}

}
