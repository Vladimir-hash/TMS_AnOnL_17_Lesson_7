package hospital;

public class Dentist  extends Doctor{
        @Override
        public void heal(Patient patient) {
            System.out.println("Dentist. Patient - /n"+ patient.getName());
        }
    }

