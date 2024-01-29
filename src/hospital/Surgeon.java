package hospital;

public class Surgeon extends Doctor{
        @Override
        public void heal(Patient patient) {
            System.out.println("Surgery. Patient - /n" + patient.getName());
        }
    }
