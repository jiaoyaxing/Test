package test.random;

import java.util.Random;

import org.junit.Test;

public class RandomTest {

	@Test
	public void test(){
		Random random = new Random(47);
		for (int i = 0; i < 10; i++) {
			System.out.println(random.nextInt());
		}
	}
}
