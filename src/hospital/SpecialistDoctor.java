package hospital;

public class SpecialistDoctor extends Doctor {

    private String specialty;
    private int vacationDays;

    public SpecialistDoctor(int id, String name, int age, String specialty, int vacationDays) {
        super(id, name, age);
        this.specialty = specialty;
        this.vacationDays = vacationDays;
    }

    @Override
    public int workHoursPerWeek() {
        return 40;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " (Especialista) -> Comer");
    }

    public void vacation() {
        System.out.println(getName() + " (Especialista) -> Vacaciones (" + vacationDays + " días)");
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

    @Override
    public String toString() {
        return "SpecialistDoctor{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", specialty='" + specialty + '\'' +
                ", vacationDays=" + vacationDays +
                '}';
    }
}