package utils;

import com.github.javafaker.Faker;

public class TestDataGenerator {
    static Faker faker = new Faker();

    public static String getName() {
        return faker.name().firstName();
    }

    public static String getEmail() {
        return faker.internet().emailAddress();
    }

    public static String getPassword() {
        return faker.internet().password();
    }
    
    public static String getFirstname() {
        return faker.name().firstName();
    }
    
    public static String getLastname() {
        return faker.name().lastName();
    }

    public static String getAddress() {
        return faker.address().streetAddress();
    }

    public static String getState() {
        return faker.address().state();
    }

    public static String getCity() {
        return faker.address().city();
    }

    public static String getZipcode() {
        return faker.address().zipCode();
    }

    public static String getMobile() {
        return faker.phoneNumber().cellPhone();
    }
}
