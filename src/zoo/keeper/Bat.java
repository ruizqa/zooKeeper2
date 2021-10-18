package zoo.keeper;

public class Bat extends Mammal{
	public Bat () {
		this.energyLevel = 300;
	}
	
	public void fly() {
		System.out.println("The bat is flying!");
		this.energyLevel -=50;
	}
	
	public void eatHuman() {
		this.energyLevel +=25;
	}
	
	public void attackTown() {
		System.out.println("AAAAAA The town is on fire");
		this.energyLevel -=100;
	}
	
}
