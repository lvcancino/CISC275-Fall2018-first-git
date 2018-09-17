package lab3Files;

import java.lang.Comparable;

public abstract class Animal implements Comparable<Animal> {
	
	String name;
	int legs;
	
	public abstract int getLegs();
	
	public abstract int compareTo(Animal a);
	
	public abstract String toString();

}
