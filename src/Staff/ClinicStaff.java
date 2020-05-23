package Staff;
	
public abstract class ClinicStaff {
	//create the all staff's details about firstname,surname,staffId and salary,titiles
	protected String firstName;
	protected String surname;
	protected final int staffID;
	protected int salary;
	protected String title;
	
	
//create clinic staff details to connect with
	public ClinicStaff(String firstName, String surname, int staffID, int salary, String title) {

		this.firstName = firstName;
		this.surname = surname;
		this.staffID = staffID;
		this.salary = 1;
		this.title = title;
		
	}
	
	//clinic staff set and get details
	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getSurname() {
		return surname;
	}



	public void setSurname(String surname) {
		this.surname = surname;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public int getStaffID() {
		return staffID;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}




	

}

