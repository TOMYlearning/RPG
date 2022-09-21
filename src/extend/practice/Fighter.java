package extend.practice;

public class Fighter extends Human {
	
	@Override
	public void attack(Living target) {
		System.out.println(this.name +"が拳で攻撃！");
	}
}
