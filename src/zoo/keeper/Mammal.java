package zoo.keeper;

public class Mammal {
	private int energyLevel = 100;
	public Mammal() {
		
	}
	
	
	public int displayEnergy() {
		return energyLevel;
	}


	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}


}
