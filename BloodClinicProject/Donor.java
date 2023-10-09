/*
 * Filipe Lutz Mariano
 * 
 * Student ID: 25956
 * 
 * 25956@student.dorset-college.ie
 * 
 */

// Donor class
class Donor {
    String firstName;
    String lastName;
    String bloodType;

    public Donor(String firstName, String lastName, String bloodType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bloodType = bloodType;
    }

    public String getBloodType() {
        if (bloodType.equalsIgnoreCase("A+")) {
                return "A+ AB+";
            } else if (bloodType.equalsIgnoreCase("A-")) {
                return "A+ A- AB+ AB-";
            } else if (bloodType.equalsIgnoreCase("B+")) {
                return "B+ AB+";
            } else if (bloodType.equalsIgnoreCase("B-")) {
                return "B+ B- AB+ AB-";
            } else if (bloodType.equalsIgnoreCase("AB+")) {
                return "AB+";
            } else if (bloodType.equalsIgnoreCase("AB-")) {
                return "AB+ AB-";
            } else if (bloodType.equalsIgnoreCase("O+")) {
                return "A+ B+ AB+ O+";
            } else { // bloodType is "O-"
                return "A+ A- B+ B- AB+ AB- O+ O-";
        }
    }
} 