#include <stdio.h>
#include <string.h>

// Function prototypes
float calculateBMI(float weight, float height);
void displayDietPlan(float bmi, int gender);
float convertWeightToKg(float weight, char unit[]);
float convertHeightToMeters(float height, char unit[]);
void BMIcategory(int gender, float bmi);

int main() {
    float weight, height, bmi;
    int gender; 
    char weightUnit[5], heightUnit[5];

    // Input gender
    printf("Press\n1.Child,\n2.Female\n3.Male\n");
    scanf("%d", &gender);

    // Input weight and unit
    printf("Enter your weight (e.g., 150 lb or 68 kg): ");
    scanf("%f %s", &weight, weightUnit);
    weight = convertWeightToKg(weight, weightUnit); // Convert weight to kg if needed

    // Input height and unit
    printf("Enter your height (e.g., 70 in or 1.75 m): ");
    scanf("%f %s", &height, heightUnit);
    height = convertHeightToMeters(height, heightUnit); // Convert height to meters if needed

    // Calculate BMI
    bmi = calculateBMI(weight, height);

    // Display BMI value
    printf("\nYour BMI is: %.2f\n", bmi);

    // Display BMI Category
    printf("Your Category is: ");
    BMIcategory(gender,bmi);

    // Display diet plan suggestion
    displayDietPlan(bmi, gender);
}
BMIcategory(int gender,float bmi)
{
    //nested if is used to find out the category 
    if(gender==1)
   {   		
    if (bmi <= 14)
     printf("Underweight\n");
        	
    else if (bmi >=14&&bmi<= 18)
     printf("Normal weight\n");
        	
     else
      printf("Overweight\n");

    }

    if(gender==2){
		if (bmi <= 18.5)
        printf("Underweight\n");
		
        else if (bmi>18.5 && bmi<= 24.9)
        printf("Normal weight\n");

		else if (bmi>24.9 && bmi<= 29.9)
        printf("Overweight\n");
		
        else
        printf("Obese\n");
        }

        if(gender==3)
        {
		if (bmi <= 18.5)
        printf("Underweight\n");
        
        else if (bmi>=18.5 &&bmi <= 24.9)
            printf("Normal weight\n");
        
        else if (bmi>24.9&&bmi <= 29.9)
            printf("Overweight\n");
        
        else  printf("Obese\n");
            }
		else 
        ("Not Recogniseed");

}




// Function to calculate BMI
float calculateBMI(float weight, float height) {
    return weight / (height * height);
}

  

// Function to display diet plan suggestion based on BMI and gender
void displayDietPlan(float bmi,int gender) {
    printf("\nDiet Plan Recommendation:\n");
    if (bmi < 18.5) {
        printf("- High-calorie diet: Include more protein-rich foods, healthy fats, and carbohydrates.\n");
        printf("- Try to have smaller meals more frequently throughout the day.\n");
    } else if (bmi < 24.9) {
        printf("- Balanced diet: Maintain a mix of vegetables, fruits, lean proteins, and whole grains.\n");
        printf("- Focus on portion control to sustain a healthy weight.\n");
    } else if (bmi < 29.9) {
        printf("- Calorie-controlled diet: Increase intake of vegetables and fiber, while reducing sugars and fats.\n");
        printf("- Consider regular exercise to maintain weight and promote health.\n");
    } else {
        printf("- Low-calorie, nutrient-dense diet: Emphasize vegetables, lean proteins, and whole grains.\n");
        printf("- Avoid processed foods, sugary drinks, and high-fat snacks.\n");
        printf("- Consider working with a healthcare provider for a personalized plan.\n");
    }
}



// Function to convert weight to kg if needed
float convertWeightToKg(float weight, char unit[]) {
    if (strcmp(unit, "lb") == 0 || strcmp(unit, "lbs") == 0) {
        weight = weight * 0.453592; // Convert pounds to kg
    }
    return weight;
}



// Function to convert height to meters if needed
float convertHeightToMeters(float height, char unit[]) {
    if (strcmp(unit, "in") == 0 || strcmp(unit, "inch") == 0 || strcmp(unit, "inches") == 0) {
        height = height * 0.0254; // Convert inches to meters
    }
    return height;
}

