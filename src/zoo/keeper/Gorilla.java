package zoo.keeper;

public class Gorilla extends Mammal {
	public void throwSomething() {
		System.out.println("The gorilla has thrown something!");
		this.setEnergyLevel(this.displayEnergy()-5);
	}
	public void eatBananas() {
		System.out.println("Yummy! The gorilla is happy!");
		this.setEnergyLevel(this.displayEnergy()+10);
	}
	
	public void climb() {
		System.out.println("Watch out! The gorillas has climbed up a tree");
		this.setEnergyLevel(this.displayEnergy()-10);
	}
	
	
}
