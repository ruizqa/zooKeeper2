package zoo.keeper;

public class Mammal {
	int energyLevel = 100;
	public Mammal() {
		
	}
	public int displayEnergy() {
		System.out.println(energyLevel);
		return energyLevel;
	}
}
