package hospital;

public abstract class Doctor extends Characters implements Workable {

    public Doctor(int id, String name, int age) {
        super(id, name, age);
    }

    public abstract void eat();
}