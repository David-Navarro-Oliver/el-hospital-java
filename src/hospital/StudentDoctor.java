package hospital;

public class StudentDoctor extends Doctor {

    private int studyHoursPerWeek;
    private String currentCourse;

    public StudentDoctor(int id, String name, int age, int studyHoursPerWeek, String currentCourse) {
        super(id, name, age);
        this.studyHoursPerWeek = studyHoursPerWeek;
        this.currentCourse = currentCourse;
    }

    @Override
    public int workHoursPerWeek() {
        return 20;
    }

    public int studyHoursPerWeek() {
        return studyHoursPerWeek;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " (Estudiante) -> Comer");
    }

    public String getCurrentCourse() {
        return currentCourse;
    }

    public void setCurrentCourse(String currentCourse) {
        this.currentCourse = currentCourse;
    }

    public int getStudyHoursPerWeek() {
        return studyHoursPerWeek;
    }

    public void setStudyHoursPerWeek(int studyHoursPerWeek) {
        this.studyHoursPerWeek = studyHoursPerWeek;
    }

    @Override
    public String toString() {
        return "StudentDoctor{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", studyHoursPerWeek=" + studyHoursPerWeek +
                ", currentCourse='" + currentCourse + '\'' +
                '}';
    }
}