import java.util.Scanner;
import StaffList.AdminStaffList;
import StaffList.MedicalStaffList;
import Animal.AnimalList;

public class Menu {
//set menu options to choose
	public static void MenuOptions() {
		System.out.println("**********************************************************");
		System.out.println("***      WELCOME TO THE VETERINARY CLINIC SYSTEM      ****");
		System.out.println("**********************************************************\n");
		System.out.println("Please Select one of the options below  the using  number");
		System.out.println("1 ------------------ Admin Staff-------------------------");
		System.out.println("2 ---------------- Medical Staff-------------------------");
		System.out.println("3 ------------------- Animals----------------------------");
		System.out.println("0 ------------------ To leave----------------------------");
		System.out.println("Option:");
	}

	//set menus to choose
	public static void AdminStaff() {
		System.out.println("-----------------------Admin Staff----------------------");
		System.out.println(" Please Select one of the options below the using number");
		System.out.println("1 ----------------- ClinicalAssistants------------------");
		System.out.println("2 -------------------Customer Service-------------------");
		System.out.println("3 ---------------------IT Nerd--------------------------");
		System.out.println("4 ---------------------Manager--------------------------");
		System.out.println("5 --------------------Receptionist----------------------");
		System.out.println("6 ---------------------All Admin Staff------------------");
		System.out.println("0 ---------------------To leave-------------------------");
		System.out.println("Option:");

		Scanner sc3 = new Scanner(System.in);
		int op3 = sc3.nextInt();

		//set loop to  print AdminStaff
		switch (op3) {
		case 1:
			AdminStaffList a = new AdminStaffList();
			a.generateClinicalAssistants();
			break;

		case 2:
			AdminStaffList cs = new AdminStaffList();
			cs.generateCS();
			break;
		case 3:
			AdminStaffList ac = new AdminStaffList();
			ac.generateAc();
			break;
		case 4:
			AdminStaffList it = new AdminStaffList();
			it.generateIt();
			break;

		case 5:
			AdminStaffList m = new AdminStaffList();
			m.generateManager();

			break;

		case 6:
			AdminStaffList r = new AdminStaffList();
			r.generateReceptionist();

			break;

		case 7:
			AdminStaffList asl1 = new AdminStaffList();
			asl1.generateAdminStaff();

			break;

		default:
			System.out.println("Invalid Option");
			AdminStaff();
		}
		while (op3 != 0);
	}
	
	//set menus to choose
	//set loop to  print MedicalStaff
	public static void MedicalStaff() {
		System.out.println("------------------------Medical Staff-------------------------");

		
		System.out.println("---Please Select one of the options below using the number-----");
		System.out.println("1 ---------------------- Nurse---------------------------------");
		System.out.println("2 ----------------- PetHairStylist-----------------------------");
		System.out.println("3 ------------- VeterinaryTechnician---------------------------");
		System.out.println("4 ------------------ Veterinarian------------------------------");
		System.out.println("5 -------------- Veterinarian Assistant------------------------");
		System.out.println("6 -------------- All Medical Staff-----------------------------");
		System.out.println("0 --------------------- To leave-------------------------------");
		System.out.println("Option:");

		Scanner sc4 = new Scanner(System.in);
		int op4 = sc4.nextInt();
//set loop for medical staff to print information
		switch (op4) {
		case 1:
			MedicalStaffList nurse = new MedicalStaffList();
			nurse.generateNurse();
			break;

		case 2:
			MedicalStaffList phs = new MedicalStaffList();
			phs.generatePHS();

			break;

		case 3:
			MedicalStaffList tv = new MedicalStaffList();
			tv.generateVTe();
			break;

		case 4:
			MedicalStaffList vet = new MedicalStaffList();
			vet.generateVet();
			break;

		case 5:
			MedicalStaffList va = new MedicalStaffList();
			va.generateVAssistant();

			break;

		case 6:
			MedicalStaffList msl1 = new MedicalStaffList();
			msl1.generateMedicalStaff();

			break;

		default:
			System.out.println("Invalid Option");
			MedicalStaff();
		}
		while (op4 != 0)
			;
	}

	//set menus to choose
	//set loop to  print Animal details
	public static void Animals() {
		
		System.out.println("---------------------Menu of Animals--------------------");
		System.out.println("Please Select one of the options below  the using number");
		System.out.println("1 ------------------------ cat--------------------------");
		System.out.println("2 - -----------------------dog--------------------------");	
		System.out.println("3 ----------------------- horse-------------------------");
		System.out.println("4 ----------------------- mouse-------------------------");
		System.out.println("5 ---------------------- parrot-------------------------");
		System.out.println("6 ---------------------- rabbit-------------------------");
		System.out.println("7----------------------- snake--------------------------");
		System.out.println("8 --------------- List animals by name-----------------");
		System.out.println("0 -------------------- To leave-------------------------");
		System.out.println("Option:");

		Scanner sc2 = new Scanner(System.in);
		int op2 = sc2.nextInt();

		switch (op2) {
		case 1:
			AnimalList cat = new AnimalList();
			cat.generateCat();
			break;

		case 2:
			AnimalList dog = new AnimalList();
			dog.generateDog();
			break;

		case 3:
			AnimalList horse = new AnimalList();
			horse.generateHorse();
			break;

		case 4:
			AnimalList mouse = new AnimalList();
			mouse.generateMouse();
			break;

		  
		  case 5: 
			  AnimalList parrot = new AnimalList(); 
		  parrot.generateParrot();
		  break;
		 

		case 6:
			AnimalList rabbit = new AnimalList();
			rabbit.generateRabbit();
			break;

		case 7:
			AnimalList snake = new AnimalList();
			snake.generateSnake();

		case 8:
			AnimalList al1 = new AnimalList();
			al1.generateAnimals();

			break;

		default:
			System.out.println("Invalid Option");
			Animals();
		}
		while (op2 != 0)
			;
	}
// print details when options have different choices
	public static void main(String[] args) {
		int op;
		Scanner sc = new Scanner(System.in);

		do {
			MenuOptions();
			op = sc.nextInt();

			switch (op) {
			case 1:
				AdminStaff();
				break;

			case 2:
				MedicalStaff();
				break;

			case 3:
				Animals();
				break;

			default:
				System.out.println("Invalid Option");
				MenuOptions();
			}
		} while (op != 0);
	}
}