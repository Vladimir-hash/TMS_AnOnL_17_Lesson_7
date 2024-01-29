package hospital;

public class Hospital {
    public static void main(String[] args) {
        Patient patient = new Patient("Vova", 17,  true );
        CurePlan curePlan1 = new CurePlan(1);
        assignDoctor(patient, curePlan1);
    }

    static void assignDoctor(Patient patient, CurePlan curePlan) {
        Doctor doctor;
        if (curePlan.getPlanCode() == 1) {
            doctor = new Surgeon();
        } else if (curePlan.getPlanCode() == 2) {
            doctor = new Dentist();
        } else {
            doctor = new Therapist();
        }

        doctor.heal(patient);
    }


}
