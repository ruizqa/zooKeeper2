package zoo.keeper;

public class BatTest {

	public static void main(String[] args) {
		Bat test = new Bat();
		test.attackTown();
		test.attackTown();
		test.attackTown();
		test.eatHuman();
		test.eatHuman();
		test.fly();
		test.fly();
		System.out.println(test.displayEnergy());

	}

}
