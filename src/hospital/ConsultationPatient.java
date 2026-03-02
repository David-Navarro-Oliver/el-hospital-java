package hospital;

public class ConsultationPatient extends Patient {

    public ConsultationPatient(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public void admission() {
        System.out.println(getName() + " (Consulta) -> Admisión");
    }

    public void nurseControl() {
        System.out.println(getName() + " (Consulta) -> Control de enfermería");
    }

    @Override
    public void room() {
        System.out.println(getName() + " (Consulta) -> Habitación");
    }

    @Override
    public void treatment() {
        System.out.println(getName() + " (Consulta) -> Tratamiento");
    }

    public void nextAppointment() {
        System.out.println(getName() + " (Consulta) -> Próxima cita");
    }

    @Override
    public void discharge() {
        System.out.println(getName() + " (Consulta) -> Salida");
    }

    @Override
    public String toString() {
        return "ConsultationPatient{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
