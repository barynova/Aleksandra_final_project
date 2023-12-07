package hw13t1;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Generate stream of users
        Stream<User> streamOfUsers = Stream.generate(() ->
                new User(getRandomName(), getRandomAge(), getRandomEmail(), getRandomGender())
        );

        //Intermidiate operations

        // First 20 users
        List<User> users = streamOfUsers.limit(20)
                // Filter by age
                .filter(user -> user.getAge() > 18)
                // Sort
                .sorted(Comparator.comparing(User::getName))
                // Filter by email
                .filter(user -> user.getEmail() != null && !user.getEmail().isEmpty())
                // Make list
                .collect(Collectors.toList());

        // Group by gender
        Map<String, List<String>> usersGroup = users.stream()
                .collect(Collectors.groupingBy(User::getGender, Collectors.mapping(User::getName, Collectors.toList())));

        System.out.println(usersGroup);
    }

    private static String getRandomName() {
            String[] arrayOfNames = {"Oleksandra", "George", "Alina", "Bohdan", "Lisa", "Michael", "Hana", "Ilia", "Alla", "Sergiy", "Irina"};
            int randomIndex = new Random().nextInt(arrayOfNames.length);
            return arrayOfNames[randomIndex];
        }

    private static int getRandomAge() {
        Integer[] arrayOfAge = {12, 8, 8, 33, 99, 45, 44, 78, 24, 22, 0};
        int randomIndex = new Random().nextInt(arrayOfAge.length);
        return arrayOfAge[randomIndex];
    }

    @org.jetbrains.annotations.NotNull
    private static String getRandomEmail() {
        String[] arrayOfDomains = {"gmail.com", "hillel.com", "cocoa.com", "test.com", "kaka.com"};
        String[] arrayOfEmailNames = {"testuser", "Aleksandra", "Ukraine_mark", "prefix123", "metallica"};

        Random rand = new Random();
        String randoEmailName = arrayOfEmailNames[rand.nextInt(arrayOfEmailNames.length)];
        String randomDomainName = arrayOfDomains[rand.nextInt(arrayOfDomains.length)];

        return randoEmailName + "@" + randomDomainName;
        }


    private static String getRandomGender() {
        String[] arrayOfGender = {"male", "female", "no gender"};
        int randomIndex = new Random().nextInt(arrayOfGender.length);
        return arrayOfGender[randomIndex];
    }
}

