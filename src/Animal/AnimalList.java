package Animal;


import java.util.ArrayList;
import java.util.Scanner;

public class AnimalList{
	
		//protected String animalData;
		protected String name;
		protected String condition;
		protected int age;
		
		//Number of animals to be generated
		private int numOfAnimals = 1500; //This can change animal type and numbers according to user input
		private int numDogs = (int) (numOfAnimals*0.25);
		private int numCats = (int) (numOfAnimals*0.10);
		private int numRabbits = (int) (numOfAnimals*.1);
		private int numMouse =(int) (numOfAnimals*.20);
		private int numHorse =(int) (numOfAnimals*.20);
		private int numSneak =(int) (numOfAnimals*.10);
		
		private int numParrot = numOfAnimals - numDogs - numCats - numRabbits - numMouse - numHorse - numSneak ;
		
		//set all animals'arraylist
		protected ArrayList<PetAnimals> animals = new ArrayList<PetAnimals>();
		protected ArrayList<PetAnimals> d = new ArrayList<PetAnimals>();
		protected ArrayList<PetAnimals> c = new ArrayList<PetAnimals>();
		protected ArrayList<PetAnimals> r = new ArrayList<PetAnimals>();	
		protected ArrayList<PetAnimals> m = new ArrayList<PetAnimals>();		
		protected ArrayList<PetAnimals> h = new ArrayList<PetAnimals>();
		protected ArrayList<PetAnimals> s = new ArrayList<PetAnimals>();
		protected ArrayList<PetAnimals> p  = new ArrayList<PetAnimals>();
		
		Animal an = new Animal(name, age, condition);
		
		AnimalDataGenerator adg = new AnimalDataGenerator();//set animal data generator
		
		//Instances of the inner classes of the class Animal
		Animal.dog dog;
		Animal.cat cat;
		Animal.rabbit rabbit;	
		Animal.mouse mouse;	
		Animal.horse horse;
		Animal.sneak snake;
		Animal.parrot parrot;
		
		
	
		//Method that generates the animals
	  public void generateDog() { 
	  ///Loop to generate dogs
	  for (int i=0; i<numDogs; i++ ) {
		  String animalData = adg.getRandomData();
		  String [] animalParts = animalData.split(" ");
		  dog = an.new dog(animalParts[0], Integer.parseInt(animalParts[1]), animalParts[2]);
		  animals.add(dog);
		  d.add(dog);
	  }
	  for (PetAnimals dog : d) {
		  System.out.println("The animal detail is " + dog);
		 
	  }
	  }
	  
	  public void generateCat() { 
	  ///Loop to generate cats
	  for (int i=0; i< numCats; i++ ) {
		  String animalData = adg.getRandomData();
		  String [] animalParts = animalData.split(" ");
		  cat = an.new cat(animalParts[0], Integer.parseInt(animalParts[1]), animalParts[2]);
		  animals.add(cat);
		  c.add(cat);
	  }
	  for (PetAnimals cat : c) {
		  
		  System.out.println("The animal detail is " + cat);
		 // System.out.println(cat);
		  
	  }}
	  public void generateRabbit() { 
	///Loop to generate rabbits
	  for (int i=0; i<numRabbits; i++ ) {
		  String animalData = adg.getRandomData();
		  String [] animalParts = animalData.split(" ");
		  rabbit = an.new rabbit(animalParts[0], Integer.parseInt(animalParts[1]), animalParts[2]);
		  animals.add(rabbit);
		  r.add(rabbit);
	  }
	  for (PetAnimals rabbit : r) {
		  System.out.println("The animal detail is " + rabbit);
		
		  
		  
	  }
	  }
	  
	  public void generateMouse() { 
	///Loop to generate mouses
	  for (int i=0; i<numMouse; i++ ) {
		  String animalData = adg.getRandomData();
		  String [] animalParts = animalData.split(" ");
		  mouse = an.new mouse(animalParts[0], Integer.parseInt(animalParts[1]), animalParts[2]);
		  animals.add(mouse);
		  m.add(mouse);
	  }
	  for (PetAnimals mouse : m) {
		  System.out.println("The animal detail is " + mouse);
		 
	  }
	  }
	  
	  public void generateHorse() { 
	  
	///Loop to generate horse
	  for (int i=0; i< numHorse; i++ ) {
		  String animalData = adg.getRandomData();
		  String [] animalParts = animalData.split(" ");
		  horse = an.new horse(animalParts[0], Integer.parseInt(animalParts[1]), animalParts[2]);
		  animals.add(horse);
		  h.add(horse);
	  }
	  for (PetAnimals horse : h) {
		  System.out.println("The animal detail is " + horse);
		
	  }
	  }
		
	  public void generateSnake() {  
	///Loop to generate sneaks
	  for (int i=0; i<numSneak; i++ ) {
		  String animalData = adg.getRandomData();
		  String [] animalParts = animalData.split(" ");
		  snake = an.new sneak(animalParts[0], Integer.parseInt(animalParts[1]), animalParts[2]);
		  animals.add(snake);
		  s.add(snake);
	  }
	  for (PetAnimals snake : s) {
		  System.out.println("The animal detail is " + snake);
			  
	  }
	  }
	  
		
		  public void generateParrot() {
			  ///Loop to generate parrot 
		  
			  for (int i=0;i<numParrot; i++ ) 
			  { 
				  String animalData = adg.getRandomData(); String []
		  animalParts = animalData.split(" ");
				  parrot = an.new parrot(animalParts[0],Integer.parseInt(animalParts[1]), animalParts[2]); animals.add(parrot);
		  p.add(parrot);
		  } 
			  for (PetAnimals parrot : p)
			  {
		  System.out.println("The animal detail is " + parrot);
			  }}
		
		 
		  //print all data of generate animals
	 public void generateAnimals () { 
	 generateParrot();
	 generateCat();
	 generateDog();
	 generateHorse();
	 generateMouse();
	 generateRabbit();
	 generateSnake();
	 
	
	  
	  }
	   
	 }