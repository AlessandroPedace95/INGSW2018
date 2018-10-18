package it.unical.ingsw2018.MavenFirstTest;

public class MyMath {

	/**
	 * Computers the fibonacci value at position index
	 * @param index position in the fibonacci sequence
	 * @return the fibonacci value
	 */
	
	int fibonacci(int index) {
		
		if(index < 0){
			throw new IllegalArgumentException("Invalid fibonacci value "+index);
		}
		
		if(index == 1 || index == 0) {
			return 1;
		}
		
		int previous = 1;
		int previousPreviuos = 1;
		int current = 0;
		
		for(int i = 2; i <= index; i++) {
			current = previous + previousPreviuos;
			previousPreviuos = previous;
			previous = current;
		}
		
		return current;
	}
	
	double distance(int x1, int y1, int x2, int y2) {
		return Math.sqrt((x2 - x1)*(x2 - x1) +(y2 - y1)*(y2 - y1));
	}
}
