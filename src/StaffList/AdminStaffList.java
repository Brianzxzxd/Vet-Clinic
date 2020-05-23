package StaffList;

import java.util.ArrayList;
import Staff.ClinicStaff;
import Staff.AdminStaff;
public class AdminStaffList {
	// protected String animalData;
	private String firstName;
	private String surname;
	private int staffID;
	protected int salary;
	private int j = 0; // Counter used for the staffID

	// Number of medical staff to be generated
	private int numAdminStaff = 50;
	private int numManager = (int) (numAdminStaff * 0.1);
	private int numClinicalAssistants = (int) (numAdminStaff * 0.2);
	private int numAccounter = (int) (numAdminStaff * 0.2);
	private int numReceptionist = (int) (numAdminStaff * 0.10);
	private int numCustomService = (int) (numAdminStaff * 0.20);
	private int numIT = numAdminStaff - numManager - numClinicalAssistants - numReceptionist - numCustomService;

	// ArrayList from the Superclass ClinicStaff to store data from Medical 
	ArrayList<ClinicStaff> administrativeStaff = new ArrayList<ClinicStaff>();
	AdminStaff adminStaff = new AdminStaff(firstName, surname, staffID, salary, null);
	
	ArrayList<ClinicStaff> a = new ArrayList<ClinicStaff>();//assistant
	ArrayList<ClinicStaff> cs = new ArrayList<ClinicStaff>();// customer service
	ArrayList<ClinicStaff> it = new ArrayList<ClinicStaff>();//it support
	ArrayList<ClinicStaff> m = new ArrayList<ClinicStaff>();// manager
	ArrayList<ClinicStaff> r = new ArrayList<ClinicStaff>();// receptionist
	ArrayList<ClinicStaff> ac = new ArrayList<ClinicStaff>();// accounter
	ArrayList<ClinicStaff> ca = new ArrayList<ClinicStaff>();// ClinicalAssistants
	
	
	
	// Instance of the class StaffDataGenerator
	StaffDataGenerator sdg = new StaffDataGenerator();

	// Instances of the inner classes of the Medical staff class
	AdminStaff.Manager manager;
	AdminStaff.ClinicalAssistants assistant;
	AdminStaff.Receptionist receptionist;
	AdminStaff.CustomerService customServ;
	AdminStaff.ITNerd itNerd;
	AdminStaff.Accounter Accounter;

	public void generateManager() {
		/// Loop to generate manager
		for (int i = 0; i < numManager; i++) {
			j++;
			String adminData = sdg.getRandomData();
			String[] adminParts = adminData.split(" ");
			// Create a class for salary
			int staffID = adminStaff.generateStaffID(j); // Method to generate the id
			manager = adminStaff.new Manager(adminParts[0], adminParts[1], staffID, 0, adminData);//set random data from manager
			administrativeStaff.add(receptionist);
			administrativeStaff.add(manager);
			m.add(manager);
			
		}
		for (ClinicStaff manager : m) {
			System.out.println(manager);
		}}

	public void generateClinicalAssistants() {
		/// Loop to generate ClinicalAssistant
		for (int i = 0; i < numClinicalAssistants; i++) {
			j++;
			String adminData = sdg.getRandomData();
			String[] adminParts = adminData.split(" ");
			// Create a class for salary
			int staffID = adminStaff.generateStaffID(j); // Method to generate the id
			ClinicStaff clinicalassistant = adminStaff.new ClinicalAssistants(adminParts[0], adminParts[1], staffID, 0, adminData);
			administrativeStaff.add(clinicalassistant);
			ca.add(clinicalassistant);
		}
		for (ClinicStaff ca : ca) {
			System.out.println(ca);
		}
	}

	public void generateReceptionist() {
		/// Loop to generate receptionist
		for (int i = 0; i < numReceptionist; i++) {
			j++;
			String adminData = sdg.getRandomData();
			String[] adminParts = adminData.split(" ");
			// Create a class for salary
			int staffID = adminStaff.generateStaffID(j); // Method to generate the id
			receptionist = adminStaff.new Receptionist(adminParts[0], adminParts[1], staffID, 0, adminData);//set random data from receptionist
			administrativeStaff.add(receptionist);
			r.add(receptionist);
		}
		for (ClinicStaff recep : r) {
			System.out.println(recep);
		}
	}
	public void generateCS() {
		/// Loop to generate CustomService
		for (int i = 0; i < numCustomService; i++) {
			j++;
			String adminData = sdg.getRandomData();
			String[] adminParts = adminData.split(" ");
			// Create a class for salary
			int staffID = adminStaff.generateStaffID(j); // Method to generate the id
			customServ = adminStaff.new CustomerService(adminParts[0], adminParts[1], staffID, 0, adminData);//set random data from customer service
			administrativeStaff.add(receptionist);
			administrativeStaff.add(customServ);
			cs.add(customServ);
		}
		for (ClinicStaff cs : cs) {
			System.out.println(cs);
		}}

	public void generateIt() {
		/// Loop to generate it nerd
		for (int i = 0; i < numIT; i++) {
			j++;
			String adminData = sdg.getRandomData();
			String[] adminParts = adminData.split(" ");
			// Create a class for salary
			int staffID = adminStaff.generateStaffID(j); // Method to generate the id
			itNerd = adminStaff.new ITNerd(adminParts[0], adminParts[1], staffID, 0, adminData);//set random data from IT Nerd
			administrativeStaff.add(receptionist);
			administrativeStaff.add(itNerd);
			it.add(itNerd);
		}
		
		for (ClinicStaff it : it) {
			System.out.println(it);
		}}

	public void generateAc() {
		/// Loop to generate Accounter
		for (int i = 0; i < numIT; i++) {
			j++;
			String adminData = sdg.getRandomData();
			String[] adminParts = adminData.split(" ");
			// Create a class for salary
			int staffID = adminStaff.generateStaffID(j); // Method to generate the id
			Accounter = adminStaff.new Accounter(adminParts[0], adminParts[1], staffID, 0, adminData);//set random data from accounter
			administrativeStaff.add(receptionist);
			administrativeStaff.add(Accounter);
			ac.add(Accounter);
		}
		
		for (ClinicStaff it : ac) {
			System.out.println(it);
		}}
	
	
	
	public ArrayList<ClinicStaff> generateAdminStaff() {
		generateClinicalAssistants();
		generateCS();
		generateIt();
        generateManager();
        generateReceptionist();
        generateAc();
		return administrativeStaff;
		
		
		
		
		
		}
		}	