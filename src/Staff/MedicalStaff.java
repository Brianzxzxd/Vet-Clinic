package Staff;

//child class extends the main class ClinicStaff
public class MedicalStaff extends ClinicStaff{

	public MedicalStaff(String firstName, String surname, int staffID, int salary, String title) {
		super(firstName, surname, staffID, salary, title);
		// TODO Auto-generated constructor stub
	}
//set child class to extends clinic staff class
	public class Veterinarian extends ClinicStaff {

		public Veterinarian(String firstName, String surname, int staffID, int salary, String title) {
			super(firstName, surname, staffID, salary, title);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String toString() {
			
			return title + ": " + firstName + " " + surname + " " + staffID + " " + salary;
		}

	}
	//set child class to extends clinic staff class
	public class VeterinaryTechnician extends ClinicStaff {

		public VeterinaryTechnician(String firstName, String surname, int staffID, int salary, String title) {
			super(firstName, surname, staffID, salary, title);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String toString() {
			
			return title + ": " + firstName + " " + surname + " " + staffID + " " + salary;
		}

	}
	//set child class to extends clinic staff class
	public class Nurse extends ClinicStaff {

		public Nurse(String firstName, String surname, int staffID, int salary, String title) {
			super(firstName, surname, staffID, salary, title);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String toString() {
			
			return title + ": " + firstName + " " + surname + " " + staffID + " " + salary;
		}

	}
	//set child class to extends clinic staff class
	public class VeterinarianAssistant extends ClinicStaff {

		public VeterinarianAssistant(String firstName, String surname, int staffID, int salary, String title) {
			super(firstName, surname, staffID, salary, title);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String toString() {
			
			return title + ": " + firstName + " " + surname + " " + staffID + " " + salary;
		}
		
		

	}
	//set child class to extends clinic staff class
	public class VeterinarySurgeon extends ClinicStaff {

		public VeterinarySurgeon(String firstName, String surname, int staffID, int salary, String title) {
			super(firstName, surname, staffID, salary, title);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String toString() {
			
			return title + ": " + firstName + " " + surname + " " + staffID + " " + salary;
		}
		
		

	}
	//set child class to extends clinic staff class
	public class PetHairStylist extends ClinicStaff {

		public PetHairStylist(String firstName, String surname, int staffID, int salary, String title) {
			super(firstName, surname, staffID, salary, title);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String toString() {
			
			return title + ": " + firstName + " " + surname + " " + staffID + " " + salary;
		}

	}
	
	
	
	////Method that generates the number ID
	public int generateStaffID (int i) {
		int staffID = 1000; //ID for medical staff start in 1000
		staffID +=i;
		return staffID;
	}
	
}
