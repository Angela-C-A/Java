public class JobApplicant {
    private String name;
    private String phoneNumber;
    private boolean wordProcessing;
    private boolean spreadsheets;
    private boolean databases;
    private boolean graphics;

    public JobApplicant(String name, String phoneNumber, boolean skilledInWordProcessing, 
    		boolean skilledInSpreadsheets, boolean skilledInDatabases, 
    		boolean skilledInGraphics) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.wordProcessing = skilledInWordProcessing;
        this.spreadsheets = skilledInSpreadsheets;
        this.databases = skilledInDatabases;
        this.graphics = skilledInGraphics;
    }
    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public boolean isSkilledInWordProcessing() {
        return wordProcessing;
    }
    public boolean isSkilledInSpreadsheets() {
        return spreadsheets;
    }
    public boolean isSkilledInDatabases() {
        return databases;
    }
    public boolean isSkilledInGraphics() {
        return graphics;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Skilled in Word Processing: " + (wordProcessing ? "Yes" : "No"));
        System.out.println("Skilled in Spreadsheets: " + (spreadsheets ? "Yes" : "No"));
        System.out.println("Skilled in Databases: " + (databases ? "Yes" : "No"));
        System.out.println("Skilled in Graphics: " + (graphics ? "Yes" : "No"));
    }
    public static void main(String[] args) {
        JobApplicant applicant = new JobApplicant("Angela C.", "(333) 333-3333", true, false, true, false);

        applicant.displayInfo();
    }
}
