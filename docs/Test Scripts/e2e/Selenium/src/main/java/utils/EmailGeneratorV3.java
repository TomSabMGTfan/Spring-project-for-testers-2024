package utils;

import java.util.Random;

public class EmailGeneratorV3 {
    public static String generateRandomEmail() {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(1000); // Generate a random number
        String username = "user" + randomNumber; // Generate a random username
        String domain = "mail.com"; // Domain name
        return username + "@" + domain;
    }

    public static void main(String[] args) {
        System.out.println(generateRandomEmail());
    }
}
