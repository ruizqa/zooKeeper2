package zoo.keeper;

public class Bat extends Mammal{
	public Bat () {
		this.setEnergyLevel(300); 
	}
	
	public void fly() {
		System.out.println("The bat is flying!");
		this.setEnergyLevel(this.displayEnergy()-50);
	}
	
	public void eatHuman() {
		this.setEnergyLevel(this.displayEnergy()+25);
	}
	
	public void attackTown() {
		System.out.println("AAAAAA The town is on fire");
		this.setEnergyLevel(this.displayEnergy()-100);
	}
	
}
