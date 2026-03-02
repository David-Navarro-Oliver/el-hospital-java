package hospital;

public abstract class Patient extends Characters implements HospitalActions {

    public Patient(int id, String name, int age) {
        super(id, name, age);
    }

    public abstract void room();

    public abstract void treatment();
}