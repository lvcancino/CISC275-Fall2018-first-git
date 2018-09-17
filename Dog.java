package lab3Files;

public class Dog extends Animal {
	
	private String name;
	private int legs;
	
	public Dog(String name, int legs) {
		this.name = name;
		this.legs = legs;
	}
	
	@Override
	public int getLegs() {
		return legs;
	}

	@Override
	public int compareTo(Animal a) {
		return this.legs - a.legs;
	}
	
	@Override
	public String toString() {
		return "Dog=[" + name + ", " + legs + "]";
	}

}
