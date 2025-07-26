// HealthProfile.java
// Stores health-related data and calculates health metrics

/*
*Olatunji Israel Oladotun
*Saturday 26th July 2025
*04:17am
*/



public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private double heightInInches;
    private double weightInPounds;

    // Constructor
    public HealthProfile(String firstName, String lastName, String gender,
                         int birthDay, int birthMonth, int birthYear,
                         double heightInInches, double weightInPounds) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.heightInInches = heightInInches;
        this.weightInPounds = weightInPounds;
    }

    // Getters and setters
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public int getBirthDay() { return birthDay; }
    public void setBirthDay(int birthDay) { this.birthDay = birthDay; }

    public int getBirthMonth() { return birthMonth; }
    public void setBirthMonth(int birthMonth) { this.birthMonth = birthMonth; }

    public int getBirthYear() { return birthYear; }
    public void setBirthYear(int birthYear) { this.birthYear = birthYear; }

    public double getHeightInInches() { return heightInInches; }
    public void setHeightInInches(double heightInInches) { this.heightInInches = heightInInches; }

    public double getWeightInPounds() { return weightInPounds; }
    public void setWeightInPounds(double weightInPounds) { this.weightInPounds = weightInPounds; }

    // Calculate age
    public int getAge(int currentDay, int currentMonth, int currentYear) {
        int age = currentYear - birthYear;
        if (currentMonth < birthMonth || (currentMonth == birthMonth && currentDay < birthDay)) {
            age--;
        }
        return age;
    }

    // Maximum heart rate
    public int getMaxHeartRate(int currentDay, int currentMonth, int currentYear) {
        return 220 - getAge(currentDay, currentMonth, currentYear);
    }

    // Target heart rate range
    public String getTargetHeartRateRange(int currentDay, int currentMonth, int currentYear) {
        int maxHR = getMaxHeartRate(currentDay, currentMonth, currentYear);
        double lower = 0.50 * maxHR;
        double upper = 0.85 * maxHR;
        return String.format("%.2f - %.2f bpm", lower, upper);
    }

    // BMI calculation
    public double getBMI() {
        return (weightInPounds * 703) / (heightInInches * heightInInches);
    }

    // BMI Chart Display
    public void displayBMIChart() {
        System.out.println("\nBMI VALUES");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal:      between 18.5 and 24.9");
        System.out.println("Overweight:  between 25 and 29.9");
        System.out.println("Obese:       30 or greater");
    }
}
