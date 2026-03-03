# 🏥 El Hospital – Object-Oriented Modeling in Java

Versión en español: [README principal](README.md)

![Java 21](https://img.shields.io/badge/Java-21-blue.svg)
![OOP](https://img.shields.io/badge/Paradigm-OOP-orange.svg)
![Architecture: Inheritance & Interfaces](https://img.shields.io/badge/Architecture-Inheritance%20%26%20Interfaces-success.svg)
![Status: Completed](https://img.shields.io/badge/Status-Completed-brightgreen.svg)

## 2️⃣ Project Description

El Hospital models a hospital workflow using object-oriented design with two core domains: patients and doctors. Through base classes and specializations, it represents how responsibilities change depending on patient type and medical role.

The code demonstrates inheritance, abstraction, method overriding, encapsulation with getters/setters, and focused interfaces that separate behavioral contracts. The `Main` execution goes through different behaviors while reusing shared structure.

The architectural goal is to centralize shared attributes in `Characters` and delegate specific behavior to concrete subclasses, keeping the design extensible for new patient or doctor types without breaking the existing hierarchy.

## 3️⃣ System Architecture

```text
Characters
├── Patient
│ ├── ConsultationPatient
│ └── AmbulancePatient
│
└── Doctor
├── SpecialistDoctor
└── StudentDoctor
```

The architecture centralizes `id`, `name`, and `age` in `Characters`, avoiding duplication across patient and doctor models.

The hierarchy split separates the domain into `Patient` and `Doctor`, each with its own contracts (`HospitalActions` and `Workable`) and abstract methods implemented by concrete classes.

Abstraction is represented by `Characters`, `Patient`, and `Doctor`, while interfaces define focused capabilities: patient hospital actions and doctor weekly workload.

## 4️⃣ Domain Modeling

### Patients

`ConsultationPatient` implements the consultation flow through `admission()`, `room()`, `treatment()`, and `discharge()`, plus consultation-specific behaviors such as `nurseControl()` and `nextAppointment()`.

`AmbulancePatient` implements the emergency flow through `admission()`, `room()`, `treatment()`, and `discharge()`, and adds ambulance-specific steps such as `operation()` and `rehabilitation()`.

### Doctors

`SpecialistDoctor` adds `specialty` and `vacationDays`, defines `workHoursPerWeek()` for specialist workload, implements `eat()`, and includes `vacation()` as a role-specific behavior.

`StudentDoctor` adds `studyHoursPerWeek` and `currentCourse`, defines `workHoursPerWeek()` with a reduced workload, implements `eat()`, and includes `studyHoursPerWeek()` to model the combined work-study profile.

## 5️⃣ SOLID Principles Applied

1. **S – Single Responsibility**
Each concrete class has a role-focused responsibility. Example: `ConsultationPatient` models consultation flow and `AmbulancePatient` models ambulance flow without mixing concerns.

2. **O – Open/Closed**
The design is open to extension and closed to modification. Example: a new patient type can be added by extending `Patient` and implementing its abstract behavior, without changing `Patient` or `Characters`.

3. **L – Liskov Substitution**
Subclasses preserve base contracts. Example: both `ConsultationPatient` and `AmbulancePatient` can be treated as `Patient` while honoring `admission()` and `discharge()` behavior.

4. **I – Interface Segregation**
Interfaces are small and purpose-specific. `HospitalActions` is for patient flow (`admission`, `discharge`), and `Workable` is for doctor workload (`workHoursPerWeek`), avoiding unnecessary methods.

5. **D – Dependency Inversion**
The model defines common behavior through abstractions (`Patient`, `Doctor`, `HospitalActions`, `Workable`), while concrete classes (`SpecialistDoctor`, `StudentDoctor`, `ConsultationPatient`, `AmbulancePatient`) provide implementations.

## 6️⃣ Program Execution

The `Main` class instantiates and runs the complete scenario.

It creates two instances of each concrete type: `ConsultationPatient`, `AmbulancePatient`, `SpecialistDoctor`, and `StudentDoctor`.

It simulates hospital flows for consultation and ambulance paths, plus specialist and student doctor routines.

It demonstrates polymorphism through overridden methods in the hierarchies (`admission`, `discharge`, `eat`, `workHoursPerWeek`), and execution ends with `exit code 0`.

## 7️⃣ UML

The UML is consistent with the source code: it reflects the `Characters -> Patient/Doctor` hierarchy, distinguishes abstract classes, and separates interfaces (`HospitalActions`, `Workable`) from concrete implementations.

It also stays aligned with encapsulated attributes and the relevant getters/setters exposed by mutable classes.

## 8️⃣ Project Structure

```text
src/
└── hospital/
├── Characters.java
├── Patient.java
├── ConsultationPatient.java
├── AmbulancePatient.java
├── Doctor.java
├── SpecialistDoctor.java
├── StudentDoctor.java
├── HospitalActions.java
├── Workable.java
└── Main.java
```

## 9️⃣ Possible Future Improvements

- Unit tests
- Persistence
- Package separation
- Exception handling
- Service layer

## 10️⃣ Technical Conclusion

The project demonstrates structural understanding of OOP through clear hierarchies, abstraction, and interface-driven behavior separation.

The design is extensible for new entity types and keeps UML and code aligned under a coherent architecture.
