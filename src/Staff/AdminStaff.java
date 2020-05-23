package Staff;

public class AdminStaff extends ClinicStaff{

	
	public AdminStaff(String firstName, String surname, int staffID, int salary, String title) {
		super(firstName, surname, staffID, salary, title);
		// TODO Auto-generated constructor stub
	}

//set child class extends to the clinicstaff class
	public class Manager extends ClinicStaff{

		public Manager(String firstName, String surname, int staffID, int salary, String title) {
			super(firstName, surname, staffID, salary,title);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String toString() {
			
			return title + ": " + firstName + " " + surname + " " + staffID + " " + salary;
		}
		
	}
	
	//set child class extends to the clinicstaff class	
	public class ClinicalAssistants extends ClinicStaff{
		
		
	public ClinicalAssistants (String firstName, String surname, int staffID, int salary, String title) {
			super(firstName, surname, staffID, salary, title);
			// TODO Auto-generated constructor stub
		}
	
	@Override
	public String toString() {
		
		return title + ": " + firstName + " " + surname + " " + staffID + " " + salary;
	}

	}
	
	//set child class extends to the clinicstaff class	
	public class Receptionist extends ClinicStaff{

		public Receptionist(String firstName, String surname, int staffID, int salary, String title) {
			super(firstName, surname, staffID, salary, title);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String toString() {
			
			return title + ": " + firstName + " " + surname + " " + staffID + " " + salary;
		}
		
	}
	
	//set child class extends to the clinicstaff class
	public class CustomerService extends ClinicStaff{

		public CustomerService(String firstName, String surname, int staffID, int salary, String title) {
			super(firstName, surname, staffID, salary, title);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String toString() {
			
			return title +  ": " + firstName + " " + surname + " " + staffID + " " + salary;
		}
		
	}
	//set child class extends to the clinicstaff class	
	public class ITNerd extends ClinicStaff{

		public ITNerd(String firstName, String surname, int staffID, int salary, String title) {
			super(firstName, surname, staffID, salary, title);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String toString() {
			
			return title + ": " + firstName + " " + surname + " " + staffID + " " + salary;
		}
		
	}
	
	//set child class extends to the clinicstaff class
	public class Accounter extends ClinicStaff{

		public Accounter(String firstName, String surname, int staffID, int salary, String title) {
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
		int staffID = 2000; //ID for medical staff starts in 2000
		staffID +=i;
		return staffID;
	}
	
}
