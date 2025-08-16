import java.util.Scanner;

public class BMICalculator {

    // Function to calculate BMI
    public static float calculateBMI(float weight, float height) {
        return (weight / (height * height)); // BMI formula
    }

    // Function to display diet plan suggestion based on BMI and gender
    public static void displayDietPlan(float bmi, int gender) {
        System.out.println("\nDiet Plan Recommendation:");
        if (bmi < 18.5) {
            System.out.println("- High-calorie diet: Include more protein-rich foods, healthy fats, and carbohydrates.");
            System.out.println("- Try to have smaller meals more frequently throughout the day.");
        } else if (bmi < 24.9) {
            System.out.println("- Balanced diet: Maintain a mix of vegetables, fruits, lean proteins, and whole grains.");
            System.out.println("- Focus on portion control to sustain a healthy weight.");
        } else if (bmi < 29.9) {
            System.out.println("- Calorie-controlled diet: Increase intake of vegetables and fiber, while reducing sugars and fats.");
            System.out.println("- Consider regular exercise to maintain weight and promote health.");
        } else {
            System.out.println("- Low-calorie, nutrient-dense diet: Emphasize vegetables, lean proteins, and whole grains.");
            System.out.println("- Avoid processed foods, sugary drinks, and high-fat snacks.");
            System.out.println("- Consider working with a healthcare provider for a personalized plan.");
        }
    }

    // Function to categorize BMI based on gender
    public static void BMIcategory(int gender, float bmi) {
        if (gender == 1) { // Child
            if (bmi <= 14)
                System.out.println("Underweight");
            else if (bmi > 14 && bmi <= 18)
                System.out.println("Normal weight");
            else
                System.out.println("Overweight");
        } else if (gender == 2) { // Female
            if (bmi <= 18.5)
                System.out.println("Underweight");
            else if (bmi > 18.5 && bmi <= 24.9)
                System.out.println("Normal weight");
            else if (bmi > 24.9 && bmi <= 29.9)
                System.out.println("Overweight");
            else
                System.out.println("Obese");
        } else if (gender == 3) { // Male
            if (bmi <= 18.5)
                System.out.println("Underweight");
            else if (bmi >= 18.5 && bmi <= 24.9)
                System.out.println("Normal weight");
            else if (bmi > 24.9 && bmi <= 29.9)
                System.out.println("Overweight");
            else
                System.out.println("Obese");
        } else {
            System.out.println("Gender Not Recognized");
        }
    }

    // Function to convert weight to kg if needed
    public static float convertWeightToKg(float weight, String unit) {
        if (unit.equalsIgnoreCase("lb") || unit.equalsIgnoreCase("lbs")) {
            weight = weight * 0.453592f; // Convert pounds to kg
        }
        return weight;
    }

    // Function to convert height to meters if needed
    public static float convertHeightToMeters(float height, String unit) {
        if (unit.equalsIgnoreCase("in") || unit.equalsIgnoreCase("inch") || unit.equalsIgnoreCase("inches")) {
            height = height * 0.0254f; // Convert inches to meters
        }
        // No conversion if height is already in meters
        return height;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Variables
        float weight, height, bmi;
        int gender;
        String weightUnit, heightUnit;
        
        // Input gender
        System.out.println("Press\n1.Child,\n2.Female,\n3.Male");
        gender = input.nextInt();
        
        // Input weight and unit
        System.out.print("Enter your weight (e.g., 150 lb or 68 kg): ");
        weight = input.nextFloat();
        weightUnit = input.next();
        weight = convertWeightToKg(weight, weightUnit); // Convert weight to kg if needed

        // Input height and unit
        System.out.print("Enter your height (e.g., 70 in or 1.75 m): ");
        height = input.nextFloat();
        heightUnit = input.next();
        height = convertHeightToMeters(height, heightUnit); // Convert height to meters if needed

        // Calculate BMI
        bmi = calculateBMI(weight, height);

        // Display BMI value
        System.out.printf("\nYour BMI is: %.2f\n", bmi);

        // Display BMI Category
        System.out.print("Your Category is: ");
        BMIcategory(gender, bmi);

        // Display diet plan suggestion
        displayDietPlan(bmi, gender);
        
        input.close();
    }
}
