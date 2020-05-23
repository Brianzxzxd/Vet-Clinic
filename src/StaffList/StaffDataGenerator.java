package StaffList;

import java.util.Random;

//generator staff Data about name and salary
public class StaffDataGenerator {


	private String[] firstNames = { "Jeanette", "Krystina ", "Victoria", "Dawne", "Joe", "Michaele", "Madalene", "John", "Ivan", "Robert","Lucy","Lucrecia", "Maria", "Leonie","Eufemia","Jake"}; //14
    private String[] surnames= { "Falcon", "Smith", "Winburn", "Vasko", "Vaughn", "Grays", "Byrne", "Viramontes", "Chipley", "Scott","Specht", "Bucher" ,"Orwig","Peper"};//14
    private int salary = 5000;
    
    public StaffDataGenerator() {
    	
    }
    
    public String getRandomData() {
		//return a random name
		
		Random r = new Random();
		
		//pick a name, condition and age based on length of arrays and set random names and salary to print
		String name = firstNames[r.nextInt(firstNames.length)];
		String surname = surnames[r.nextInt(surnames.length)];
		int salaryBand = r.nextInt(salary);
		
		return ( name + " " + surname + " " + salaryBand);
		
	}


	
}