package hospital;

public class Main {

    public static void main(String[] args) {

        ConsultationPatient consultation1 = new ConsultationPatient(1, "Ana", 30);
        ConsultationPatient consultation2 = new ConsultationPatient(2, "Luis", 45);

        AmbulancePatient ambulance1 = new AmbulancePatient(3, "Marta", 28);
        AmbulancePatient ambulance2 = new AmbulancePatient(4, "Jorge", 60);

        SpecialistDoctor specialist1 = new SpecialistDoctor(5, "Dr. Pérez", 50, "Cardiología", 20);
        SpecialistDoctor specialist2 = new SpecialistDoctor(6, "Dra. Gómez", 42, "Traumatología", 15);

        StudentDoctor student1 = new StudentDoctor(7, "Juan", 24, 25, "3º Medicina");
        StudentDoctor student2 = new StudentDoctor(8, "Sara", 26, 30, "4º Medicina");

        System.out.println("=== PACIENTES CONSULTA ===");
        System.out.println(consultation1);
        System.out.println(consultation2);

        System.out.println("\n=== PACIENTES AMBULANCIA ===");
        System.out.println(ambulance1);
        System.out.println(ambulance2);

        System.out.println("\n=== DOCTORES ESPECIALISTAS ===");
        System.out.println(specialist1);
        System.out.println(specialist2);

        System.out.println("\n=== DOCTORES ESTUDIANTES ===");
        System.out.println(student1);
        System.out.println(student2);

        System.out.println("\n=== FLUJO CONSULTA (1) ===");
        consultation1.admission();
        consultation1.nurseControl();
        consultation1.room();
        consultation1.treatment();
        consultation1.nextAppointment();
        consultation1.discharge();

        System.out.println("\n=== FLUJO CONSULTA (2) ===");
        consultation2.admission();
        consultation2.nurseControl();
        consultation2.room();
        consultation2.treatment();
        consultation2.nextAppointment();
        consultation2.discharge();

        System.out.println("\n=== FLUJO AMBULANCIA (1) ===");
        ambulance1.admission();
        ambulance1.operation();
        ambulance1.room();
        ambulance1.treatment();
        ambulance1.rehabilitation();
        ambulance1.discharge();

        System.out.println("\n=== FLUJO AMBULANCIA (2) ===");
        ambulance2.admission();
        ambulance2.operation();
        ambulance2.room();
        ambulance2.treatment();
        ambulance2.rehabilitation();
        ambulance2.discharge();

        System.out.println("\n=== ESPECIALISTA (1) ===");
        System.out.println("Horas/semana: " + specialist1.workHoursPerWeek());
        specialist1.eat();
        specialist1.vacation();
        System.out.println("Especialidad: " + specialist1.getSpecialty());

        System.out.println("\n=== ESPECIALISTA (2) ===");
        System.out.println("Horas/semana: " + specialist2.workHoursPerWeek());
        specialist2.eat();
        specialist2.vacation();
        System.out.println("Especialidad: " + specialist2.getSpecialty());

        System.out.println("\n=== ESTUDIANTE (1) ===");
        System.out.println("Horas trabajo/semana: " + student1.workHoursPerWeek());
        System.out.println("Horas estudio/semana: " + student1.studyHoursPerWeek());
        student1.eat();
        System.out.println("Curso actual: " + student1.getCurrentCourse());

        System.out.println("\n=== ESTUDIANTE (2) ===");
        System.out.println("Horas trabajo/semana: " + student2.workHoursPerWeek());
        System.out.println("Horas estudio/semana: " + student2.studyHoursPerWeek());
        student2.eat();
        System.out.println("Curso actual: " + student2.getCurrentCourse());
    }
}