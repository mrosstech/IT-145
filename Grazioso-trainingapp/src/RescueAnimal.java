// IT-145 Project 2
// Michael Ross

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.time.LocalDateTime;

public class RescueAnimal {

    // Instance variables
    private String name;
    private String type;
    private String gender;
    private int age;
    private float weight;
    private LocalDateTime acquisitionDate;   	// Changed the data type on all SimpleDateFormat entries
    private LocalDateTime statusDate;			// to LocalDateTime because SimpleDateFormat is only a way to format
    private String acquisitionSource;			// date entries and not a way to store actual dates
    private Boolean reserved;					// which is what we want here.

    private String trainingLocation;
    private LocalDateTime trainingStart;
    private LocalDateTime trainingEnd;
    private String trainingStatus;

    private String inServiceCountry;
    private String inServiceCity;
    private String inServiceAgency;
    private String inServicePOC;
    private String inServiceEmail;
    private String inServicePhone;
    private String inServicePostalAddress;

    // Constructor
    public RescueAnimal() {
    }
    
    public RescueAnimal(String name, String type, String gender, int age, float weight, Boolean reserved, String acquisitionSource) {
    	this.name = name;
    	this.type = type;
    	this.gender = gender;
    	this.age = age;
    	this.weight = weight;
    	this.reserved = reserved;
    	this.acquisitionSource = acquisitionSource;
    }
    


    public void updateAnimal() {
    	Scanner scnr = new Scanner(System.in);
    	System.out.println("New animal name [" + this.name + "]: ");
    	this.name = scnr.next();
    	System.out.println("New animal type [" + this.type + "]: ");
    	this.type = scnr.next();
    	System.out.println("New animal gender [" + this.gender + "]: ");
    	this.gender = scnr.next();
    	System.out.println("New animal age [" + this.age + "]: ");
    	this.age = scnr.nextInt();
    	System.out.println("New animal weight [" + this.weight + "]: ");
    	this.weight = scnr.nextFloat();
    }
    
    
    public void displayAnimalHeader() {
    	System.out.println("\tName\t\tType\t\tGender\tAge\tWeight");
    }
    public void displayAnimal() {
    	System.out.println(name + "\t\t" + type + "\t\t" + gender + "\t" + age + "\t" + weight);
    }
    

    
    // Add Accessor Methods here
    public String getName() {
    	return name;
    }
    public String getType() {
    	return type;
    }
    public String getGender() {
    	return gender;
    }
    public int getAge() {
    	return age;
    }
    public float getWeight() {
    	return weight;
    }
    public LocalDateTime getAcquisitionDate() {
    	return acquisitionDate;
    }
    public LocalDateTime getStatusDate() {
    	return statusDate;
    }
    public String getAcquisitionSource() {
    	return acquisitionSource;
    }
    public boolean getReserved() {
    	return reserved;
    }
    public String getTrainingLocation() {
    	return trainingLocation;
    }
    public LocalDateTime getTrainingStart() {
    	return trainingStart;
    }
    public LocalDateTime getTrainingEnd() {
    	return trainingEnd;
    }
    public String getTrainingStatus() {
    	return trainingStatus;
    }
    public String getInServiceCountry() {
    	return inServiceCountry;
    }
    public String getInServiceCity() {
    	return inServiceCity;
    }
    public String getInServiceAgency() {
    	return inServiceAgency;
    }
    public String getInServicePOC() {
    	return inServicePOC;
    }
    public String getInServiceEmail() {
    	return inServiceEmail;
    }
    public String getInServicePhone() {
    	return inServicePhone;
    }
    public String getInServicePostalAddress() {
    	return inServicePostalAddress;
    }
    
    // Add Mutator Methods here
    public void setName(String name) {
    	this.name = name;
    }
    public void setType(String type) {
    	this.type = type;
    }
    public void setGender(String gender) {
    	this.gender = gender;
    }
    public void setAge(int age) {
    	this.age = age;
    }
    public void setWeight(float weight) {
    	this.weight = weight;
    }
    public void setAcquisitionDate(LocalDateTime acquisitionDate) {
    	this.acquisitionDate = acquisitionDate;
    }
    public void setStatusDate(LocalDateTime statusDate) {
    	this.statusDate = statusDate;
    }
    public void setAcquisitionSource(String acquisitionSource) {
    	this.acquisitionSource = acquisitionSource;
    }
    public void setReserved(Boolean reserved) {
    	this.reserved = reserved;
    }
    public void setTrainingLocation(String trainingLocation) {
    	this.trainingLocation = trainingLocation;
    }
    public void setTrainingStart(LocalDateTime trainingStart) {
    	this.trainingStart = trainingStart;
    }
    public void setTrainingEnd(LocalDateTime trainingEnd) {
    	this.trainingEnd = trainingEnd;
    }
    public void setTrainingStatus(String trainingStatus) {
    	this.trainingStatus = trainingStatus;
    }
    public void setInServiceCountry(String inServiceCountry) {
    	this.inServiceCountry = inServiceCountry;
    }
    public void setInServiceCity(String inServiceCity) {
    	this.inServiceCity = inServiceCity;
    }
    public void setInServiceAgency(String inServiceAgency) {
    	this.inServiceAgency = inServiceAgency;
    }
    public void setInServicePOC(String inServicePOC) {
    	this.inServicePOC = inServicePOC;
    }
    public void setInServiceEmail(String inServiceEmail) {
    	this.inServiceEmail = inServiceEmail;
    }
    public void setInServicePhone(String inServicePhone) {
    	this.inServicePhone = inServicePhone;
    }
    public void setInServicePostalAddress(String inServicePostalAddress) {
    	this.inServicePostalAddress = inServicePostalAddress;
    }
    
    

}
