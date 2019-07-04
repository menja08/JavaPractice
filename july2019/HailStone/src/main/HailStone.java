package main;

public class HailStone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hailStone(3);
	}
	
	public static void hailStone(int number) {
		while(number > 1) {
			if(number % 2 == 0) {
				number = number / 2;
			} else {
				number = 3 * number + 1;
			}
			System.out.println("Hailstone sequence = " + number);
		}
	}

}
