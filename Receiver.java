/*
 * Filipe Lutz Mariano
 * 
 * Student ID: 25956
 * 
 * 25956@student.dorset-college.ie
 * 
 */

// Receiver class
class Receiver {
    String firstName;
    String lastName;
    String bloodType;

    public Receiver(String firstName, String lastName, String bloodType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bloodType = bloodType;
    }

    public String getBloodType() {
        if (bloodType.equalsIgnoreCase("A+")) {
            return "A+ A- O+ O-";
        } else if (bloodType.equalsIgnoreCase("A-")) {
            return "A- O-";
        } else if (bloodType.equalsIgnoreCase("B+")) {
            return "B+ B- O+ O-";
        } else if (bloodType.equalsIgnoreCase("B-")) {
            return "B- O-";
        } else if (bloodType.equalsIgnoreCase("AB+")) {
            return "A+ A- B+ B- AB+ AB- O+ O-";
        } else if (bloodType.equalsIgnoreCase("AB-")) {
            return "A- B- AB- O-";
        } else if (bloodType.equalsIgnoreCase("O+")) {
            return "O+ O-";
        } else { // bloodType is "O-"
            return "O-";
        }
    }
} 