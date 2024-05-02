package utils;

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