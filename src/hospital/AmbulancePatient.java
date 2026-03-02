package hospital;

public class AmbulancePatient extends Patient {

    public AmbulancePatient(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public void admission() {
        System.out.println(getName() + " (Ambulancia) -> Admisión");
    }

    public void operation() {
        System.out.println(getName() + " (Ambulancia) -> Operación");
    }

    @Override
    public void room() {
        System.out.println(getName() + " (Ambulancia) -> Habitación");
    }

    @Override
    public void treatment() {
        System.out.println(getName() + " (Ambulancia) -> Tratamiento");
    }

    public void rehabilitation() {
        System.out.println(getName() + " (Ambulancia) -> Rehabilitación");
    }

    @Override
    public void discharge() {
        System.out.println(getName() + " (Ambulancia) -> Salida");
    }

    @Override
    public String toString() {
        return "AmbulancePatient{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}