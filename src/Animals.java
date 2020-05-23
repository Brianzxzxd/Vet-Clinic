import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;


//create animal class to put animal type and name ,condition
public class Animals {
    
    Random r = new Random(); // implementing random function
    private String[] animaltype = { "cat", "dog", "horse", "rabbit" ,"parrot"};// array with types of animals
    private String[] names = { "Carlton", "Bambi", "Gina", "Wilbur", "Oswald", "Fido", "Suzy", "Soy", "Suzy", "Cloud",
            "Lex" ,"Chloe","Remy","Lobo"};
    private String[] condition = { "Arthritis", "Cancer", "Dental Disease", "Diabetes", "Distemper", "Ear Mites", "Epilepsy", "Bloat", "Worm", "Rabies","Parvovirus" };


//create collection to list animal names
public Collection<String> listNames(){
    ArrayList<String> AnimalName = new ArrayList<String>(); // creates an arrray list of names for animals
    for(int i=0; i<this.names.length; i++) {
        AnimalName.add(names[i]);// populating list with array of names
    }
    return AnimalName;
}
//create collection to list animal medical conditions
public Collection<String> listMedicalConditions(){
	
    ArrayList<String> medcond = new ArrayList<String>(); // creates an array list of medical conditions for animals
    for(int i=0; i<this.condition.length;i++)
    {
    medcond.add(this.condition[i]);//populating list with array of conditions
    
    }
    return medcond;
}
public int age(){
	
    int animalAge;
// put the age animal and return animal age
return 0;

}
// creates an array list of cases, that will include animal type, animal name, animal age and illness
public Collection<String> listCases(){
	
     ArrayList<String> cases = new ArrayList<String>(); // creates an array list of cases, that will include animal type, animal name, animal age and illness
return cases;


}
}