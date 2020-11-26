package jhl;

enum Direction {
	EAST(1, ">"), SOUTH(2,"V"), WEST(3, "<"), NORTH(4,"^");
	private static final Direction[] dArr = Direction.values();
	private final int value;
	private final String symbol;


	Direction(int value, String symbol){
		this.value = value;
		this.symbol = symbol;
	}

	public int getValue() {return this.value;}
	public String getSybol() {return this.symbol;}

	public static Direction of(int dir) {
		if(dir < 1 || dir >4) {
			throw new IllegalArgumentException("Invalid value : " + dir);

		}
		return dArr[dir-1];
	}

	public Direction rotate(int num) {
		num = num%4;

		if (num < 0) num +=4;
		return dArr[(value -1+num)%4];
	}

	public String toString() {
		return name()+ getSybol();
	}

}

public class Exam080ClassEnum {
	public static void main(String[] args) {
		for (Direction d :Direction.values())
			System.out.printf("%s=%d%s%n", d.name(), d.getValue(), d.getSybol());

		Direction d1 = Direction.EAST;
		Direction d2 = Direction.of(1);

		System.out.println(d1==d2);
		
		System.out.println(Direction.EAST.rotate(10));

	}
}
