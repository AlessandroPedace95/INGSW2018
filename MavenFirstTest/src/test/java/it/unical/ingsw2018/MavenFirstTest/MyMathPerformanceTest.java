package it.unical.ingsw2018.MavenFirstTest;

import org.junit.Test;

public class MyMathPerformanceTest {

	private MyMath math = new MyMath();
	
	@Test(timeout = 10000)
	public void performanceTest1() {
		math.fibonacci(100);
	}
}
