
import Animal.PetAnimals;


public class Queue {
	
	//set details of class PetAnimals
	private PetAnimals first;
	private PetAnimals last;
	private int size;
	
	//set queue for animals
	public Queue() {
		this.first = null;
		this.last = null;
		this.size = 0;
	}
	
	//add animal details
	public void add(PetAnimals animal) {
		if (size == 0) {
			this.first = animal;
			this.last = animal;
			size++;
		}
		else {
			this.last.setNext(animal);
			this.last = animal;
			size++;
		}
	}
	
	//remove animal
	public boolean remove() {
		if(size == 0) {
			return false;
		}
		else if(size == 1) {
			this.first = null;
			this.last = null;
			size--;
			return true;
		}
		else {
			this.first = this.first.getNext();
			size--;
			return true;
		}
	}
	
	//set animals to string to print

	@Override
	public String toString() {
		String toReturn = "";
		PetAnimals current = this.first;
		
		while(current != null) {
			toReturn += current + " ";
			current = current.getNext();
		}	
		
		return toReturn;
		
	}

}