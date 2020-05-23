package Animal;

//set abstract class for Animals
public abstract class PetAnimals {

	protected String name;
	protected int age;
	protected String medicalCondition;
	private PetAnimals next;
	
	
	//set and get pet animals details
	public PetAnimals getNext() {
		return next;
	}



	public void setNext(PetAnimals next) {
		this.next = next;
	}


//set pet animals details about name ,age and medical condition
	public PetAnimals(String name, int age, String medicalCondition) {
		super();
		this.name = name;
		this.age = age;
		this.medicalCondition = medicalCondition;
	}
}