package StaffList;

import java.util.ArrayList;

import Staff.ClinicStaff;
import Staff.MedicalStaff;
public class MedicalStaffList {

	// protected String medical staffData;
	//create staff  firstname,surname,staffId and salary for listing the data
	private String firstName;
	private String surname;
	private int staffID;
	protected int salary;
	private int j = 0;// Counter used for the staffID

	// Number of medical staff to be generated, it is calculated on a percentage
	// level in case the total of medical staff varies
	private int numMedicalStaff = 60; // Total number of medical Staff
	private int numVeterinarian = (int) (numMedicalStaff * 0.2);
	private int numVeterinaryTechnician = (int) (numMedicalStaff * 0.1);
	private int numNurse = (int) (numMedicalStaff * 0.2);
	private int numVetAssistant = (int) (numMedicalStaff * 0.20);
	private int petHairStylist = numMedicalStaff - numVeterinarian - numVeterinaryTechnician - numNurse - numVetAssistant;

	// ArrayList from the Super class ClinicStaff where Medical will be Stored
	ArrayList<ClinicStaff> medicalStaff = new ArrayList<ClinicStaff>();
	ArrayList<ClinicStaff>  n= new ArrayList<ClinicStaff>();//nurse
	ArrayList<ClinicStaff> phs = new ArrayList<ClinicStaff>();// pet hair stylist
	ArrayList<ClinicStaff> vte = new ArrayList<ClinicStaff>();//VeterinaryTechnician
	ArrayList<ClinicStaff> v = new ArrayList<ClinicStaff>();// veterinarian
	ArrayList<ClinicStaff> va = new ArrayList<ClinicStaff>();// vet assist



	// Instance of the class Medical that it will use to create instances of its
	// inner classes
	MedicalStaff medicStaff = new MedicalStaff(firstName, surname, staffID, salary, null);

	// Instance of the class StaffDataGenerator,store  all the information to generate Staff members
	StaffDataGenerator sdg = new StaffDataGenerator();

	// Instances of the inner classes of the class Medical to use for  populating the array of the parent class
	MedicalStaff.Veterinarian vet;
	MedicalStaff.VeterinaryTechnician trainVet;
	MedicalStaff.Nurse nurse;
	MedicalStaff.VeterinarianAssistant vetAssist;
	MedicalStaff.PetHairStylist hairStyle;

	//Method that generates all the medical staff and populates the parent class array
	public void generateVet() {
		/// Loop to generate veterinarians
		//note the counter for the staff ID is increasing with each cycle of the for loop
		for (int i = 0; i < numVeterinarian; i++, j++) {
			String medicalData = sdg.getRandomData();
			String[] medicalParts = medicalData.split(" ");
			// Create a class for salary
			int staffID = medicStaff.generateStaffID(j); // Method to generate the id
			vet = medicStaff.new Veterinarian(medicalParts[0], medicalParts[1], staffID, 0, medicalData);
			medicalStaff.add(vet);
			v.add(vet);
		}
		for (ClinicStaff vet : v) {
			System.out.println(vet);
		}
		}
	
	public void generateVTe() {
		/// Loop to generate Trainee Veterinarians
		for (int i = 0; i < numVeterinaryTechnician; i++, j++) {
			String medicalData = sdg.getRandomData();
			String[] medicalParts = medicalData.split(" ");
			// Create a class for salary
			int staffID = medicStaff.generateStaffID(j); // Method to generate the id
			ClinicStaff veterinaryTechnician = medicStaff.new VeterinaryTechnician(medicalParts[0], medicalParts[1], staffID, 0, medicalData);
			medicalStaff.add(veterinaryTechnician);
			vte.add(veterinaryTechnician);
		}
		for (ClinicStaff vte : vte) {
			System.out.println(vte);
		}
	}
	public void generateNurse() {
		/// Loop to generate Nurses
		for (int i = 0; i < numNurse; i++, j++) {
			String medicalData = sdg.getRandomData();
			String[] medicalParts = medicalData.split(" ");
			// Create a class for salary
			int staffID = medicStaff.generateStaffID(j); // Method to generate the id
			nurse = medicStaff.new Nurse(medicalParts[0], medicalParts[1], staffID, 0, medicalData);
			medicalStaff.add(nurse);
			n.add(nurse);
		}
		for (ClinicStaff nurse : n) {
			System.out.println(nurse);
		}
	}
	
	public void generateVAssistant() {
		/// Loop to Veterinarian Assistants
		for (int i = 0; i < numVetAssistant; i++,j++) {
			String medicalData = sdg.getRandomData();
			String[] medicalParts = medicalData.split(" ");
			// Create a class for salary
			int staffID = medicStaff.generateStaffID(j); // Method to generate the id
			vetAssist = medicStaff.new VeterinarianAssistant(medicalParts[0], medicalParts[1], staffID, 0, medicalData);
			medicalStaff.add(vetAssist);
			va.add(vetAssist);
		}
		for (ClinicStaff vassist : va) {
			System.out.println(vassist);
		}
	}
	public void generatePHS() {
		/// Loop to Pet Hair Stylists 
		for (int i = 0; i < petHairStylist; i++, j++) {
			String medicalData = sdg.getRandomData();
			String[] medicalParts = medicalData.split(" ");
			// Create a class for salary
			int staffID = medicStaff.generateStaffID(j); // Method to generate the id
			hairStyle = medicStaff.new PetHairStylist(medicalParts[0], medicalParts[1], staffID, 0, medicalData);
			medicalStaff.add(hairStyle);
			phs.add(hairStyle);
		}
		for (ClinicStaff hair : phs) {
			System.out.println(hair);
		}
		}
	
		public ArrayList<ClinicStaff> generateMedicalStaff() {
		/// Loop that prints out each element of the medicalStaff ArrayList
		
			generatePHS();
			generateVAssistant();
			generateNurse();
			generateVet();
			generateVTe();
			return medicalStaff;
			
		
	}
	}