package hw13t1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
    public class User {
        private String name;
        private int age;
        private String email;
        private String gender;

        public User(String name, int age, String email, String gender) {
            this.name = name;
            this.age = age;
            this.email = email;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getEmail() {
            return email;
        }

        public String getGender() {
            return gender;
        }
    }
