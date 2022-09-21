package extend.practice;

public class Dragon extends Monster {

	@Override
	public void attack(Living target) {
		System.out.println(this.name +"の攻撃！");
	}

}
