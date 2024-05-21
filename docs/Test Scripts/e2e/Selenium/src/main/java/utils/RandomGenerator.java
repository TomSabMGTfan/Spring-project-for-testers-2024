package utils;

import java.time.LocalDate;
import java.util.Random;

public class RandomGenerator {
    public static String generateRandomUserName() {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(1000) + "Karina";

    }

    public static String generateRandomEmail() {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(1000) + "random@mail.com";

    }

    public static String generateRandomPass() {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(1000) + "Selenium@9";

    }

    //Random Project Name
    public static String generateRandomProjectName() {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(1000) + "Proj";
    }

    //Random Project Description
    public static String generateRandomProjectDescription() {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(1000) + "Description";
    }

    //Random Task Name//
//    public static String generateRandomProjectTaskName() {
//        Random randomGenerator = new Random();
//        return randomGenerator.nextInt(100) + "Task";
//    }
    public static String generateRandomProjectTaskName() {
        // Create a Random object to generate random numbers
        Random randomGenerator = new Random();
        // Generate a random integer between 0 (inclusive) and 100 (exclusive)
        int randomNumber = randomGenerator.nextInt(100);
        // Concatenate the random number with the string "Task"
        return "Task" + " " + randomNumber;
    }


    //Random Task Description//
//    public static String generateRandomProjectTaskDescription() {
//        Random randomGenerator = new Random();
//        return randomGenerator.nextInt(100) + "Description";
//    }
    public static String generateRandomProjectTaskDescription() {
        // Create a Random object to generate random numbers
        Random randomGenerator = new Random();
        // Generate a random integer between 0 (inclusive) and 100 (exclusive)
        int randomNumber = randomGenerator.nextInt(100);
        // Concatenate the random number with the string "Description"
        return "Description" + " " + randomNumber;
    }
    //Generate random date
//    public static String generateRandomDate() {
//    }
//
//import java.time.LocalDate;
//import java.util.Random;
//
//    public class Main {
//        public static void main(String[] args) {
//            // Generate a random date
//            LocalDate randomDate = generateRandomDate();
//
//            // Output the generated date
//            System.out.println("Generated Date: " + randomDate);
//
//            // Format the date to "MM/dd/yyyy" and output
//            String formattedDate = randomDate.getMonthValue() + "/" + randomDate.getDayOfMonth() + "/" + randomDate.getYear();
//            System.out.println("Formatted Date: " + formattedDate);
//        }
//
//        public static LocalDate generateRandomDate() {
//            // Get the current year
//            int currentYear = LocalDate.now().getYear();
//
//            // Generate a random year between the current year and the next 10 years
//            Random random = new Random();
//            int randomYear = currentYear + random.nextInt(11);
//
//            // Generate a random month and day within the valid ranges
//            int randomMonth = random.nextInt(12) + 1; // Adding 1 because months are 1-based
//            int randomDay = random.nextInt(31) + 1;   // Adding 1 because days are 1-based
//
//            // Construct and return the LocalDate object
//           // return LocalDate.of(randomYear, randomMonth, randomDay);
//            return LocalDate.of(randomMonth, randomDay, randomYear);
//        }
//    }



//    public static String generateRepeatRandomPass() {
//        Random randomGenerator = new Random();
//        return randomGenerator.nextInt(1000) + "Selenium@9";
//    }

//    public static String generateRandomRegisteredUserName() {
//        Random randomGenerator = new Random();
//        return randomGenerator.nextInt(1000) + "Karina";
//    }

//    public static String generateRandomRegisteredUserPassword() {
//        Random randomGenerator = new Random();
//        return randomGenerator.nextInt(1000) + "Selenium@9";
//    }}
}