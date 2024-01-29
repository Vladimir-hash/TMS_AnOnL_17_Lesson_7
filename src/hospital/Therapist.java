package hospital;

public class Therapist extends Doctor {
    @Override
    public void heal(Patient patient) {
        System.out.println("Therapist. Patient - /n"+ patient.getName());
    }
}
