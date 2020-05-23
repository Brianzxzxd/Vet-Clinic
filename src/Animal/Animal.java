package Animal;

public class Animal extends PetAnimals{
	


	//Constructor
	public Animal(String name, int age, String medCondition) {
		super(name, age, medCondition);
		// TODO Auto-generated constructor stub
	}


// rabbit child class extends PetAnimal class
	public class rabbit extends PetAnimals{

		public rabbit(String name, int age, String medCondition) {
			super(name, age, medCondition);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			
			return "rabbit: " + name + " " + age + " " + medicalCondition;
		}
		
	}
	
	
	// cat child class extends PetAnimal class
	public class cat extends PetAnimals{

		public cat(String name, int age, String medCondition) {
			super(name, age, medCondition);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String toString() {
			
			return "Cat: " + name + " " + age + " " + medicalCondition;
		}
		
	}
	
	
	// dog child class extends PetAnimal class
	public class dog extends PetAnimals{

		public dog(String name, int age, String medCondition) {
			super(name, age, medCondition);
		}
		
		@Override
		public String toString() {
			
			return "Dog: " + name + " " + age + " " + medicalCondition;
		}
		
	}
	
	
	
	// mouse child class extends PetAnimal class
	public class mouse extends PetAnimals{

		public mouse(String name, int age, String medCondition) {
			super(name, age, medCondition);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String toString() {
			
			return "mouse: " + name + " " + age + " " + medicalCondition;
		}
	}
	
	
	
	
	// horse child class extends PetAnimal class
	public class horse extends PetAnimals{

		public horse(String name, int age, String medCondition) {
			super(name, age, medCondition);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String toString() {
			
			return "hamster: " + name + " " + age + " " + medicalCondition;
		}
		
	}
	
	
	// lizzard child class extends PetAnimal class
	public class lizzard extends PetAnimals{

		public lizzard(String name, int age, String medCondition) {
			super(name, age, medCondition);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String toString() {
			
			return "lizzard: " + name + " " + age + " " + medicalCondition;
		}
	}
	
	
	// sneak child class extends PetAnimal class
	//Real class name is sneak, but memes had to made me change it
	public class sneak extends PetAnimals{

		public sneak(String name, int age, String medCondition) {
			super(name, age, medCondition);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String toString() {
			
			return "Sneak: " + name + " " + age + " " + medicalCondition;
		}
		
	}
	
	
	// parrot child class extends PetAnimal class
	public class parrot extends PetAnimals{

		public parrot (String name, int age, String medCondition) {
			super(name, age, medCondition);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String toString() {
			
			return "Parrot: " + name + " " + age + " " + medicalCondition;
		}
		
	}
	
	
	// fish child class extends PetAnimal class
	public class fish extends PetAnimals{

		public fish(String name, int age, String medCondition) {
			super(name, age, medCondition);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String toString() {
			
			return "Fish: " + name + " " + age + " " + medicalCondition;
		}
		
	}
	
	
}