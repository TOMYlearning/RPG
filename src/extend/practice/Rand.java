package extend.practice;

import java.util.Random;

public class Rand {
	private static Random r = new Random();
	
	public static int get() {
		return r.nextInt(10);
	}
}
