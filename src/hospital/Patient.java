package hospital;

public class Patient {
    private final Boolean sex;
    private final String name;
    private final int age;
        public Patient(String name, int age, Boolean sex) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String getName() {
            return "Patient:\n" +
                    "sex = '" + sex + '\'' +
                    ", \nname = '" + name + '\'' +
                    ", \nage = " + age;
        }
}

