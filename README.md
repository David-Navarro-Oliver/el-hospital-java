# 🏥 El Hospital – Modelado Orientado a Objetos en Java

English version: [README in English](README.en.md)

![Java 21](https://img.shields.io/badge/Java-21-blue.svg)
![OOP](https://img.shields.io/badge/Paradigm-OOP-orange.svg)
![Architecture: Inheritance & Interfaces](https://img.shields.io/badge/Architecture-Inheritance%20%26%20Interfaces-success.svg)
![Status: Completed](https://img.shields.io/badge/Status-Completed-brightgreen.svg)

## 2️⃣ Descripción del Proyecto

El Hospital modela un flujo hospitalario orientado a objetos con dos dominios principales: pacientes y médicos. A partir de clases base y especializaciones, representa cómo cambian las responsabilidades según el tipo de paciente atendido y el rol del profesional médico.

El código demuestra herencia, abstracción, sobrescritura de métodos, encapsulación con getters/setters e implementación de interfaces pequeñas para separar contratos funcionales. La ejecución en `Main` recorre comportamientos distintos sin duplicar estructura común.

El objetivo arquitectónico es centralizar atributos compartidos en `Characters` y distribuir comportamientos específicos en subclases concretas, manteniendo un diseño extensible para nuevos tipos de pacientes o médicos sin romper la jerarquía existente.

## 3️⃣ Arquitectura del Sistema

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

La arquitectura centraliza `id`, `name` y `age` en `Characters`, evitando duplicación entre pacientes y médicos.

La separación por jerarquías divide el dominio en `Patient` y `Doctor`, cada uno con contratos propios (`HospitalActions` y `Workable`) y comportamientos abstractos que fuerzan implementación en las clases concretas.

La abstracción aparece en `Characters`, `Patient` y `Doctor`, mientras que las interfaces se usan para delimitar capacidades concretas: acciones hospitalarias del paciente y carga horaria laboral del médico.

## 4️⃣ Modelado del Dominio

### Pacientes

`ConsultationPatient` implementa el flujo de consulta con `admission()`, `room()`, `treatment()` y `discharge()`, además de métodos específicos de consulta como `nurseControl()` y `nextAppointment()`.

`AmbulancePatient` implementa el flujo de urgencia con `admission()`, `room()`, `treatment()` y `discharge()`, e incorpora métodos propios del recorrido de ambulancia como `operation()` y `rehabilitation()`.

### Médicos

`SpecialistDoctor` añade atributos `specialty` y `vacationDays`, define `workHoursPerWeek()` con dedicación de especialista, implementa `eat()` y agrega `vacation()` como comportamiento específico.

`StudentDoctor` añade `studyHoursPerWeek` y `currentCourse`, define `workHoursPerWeek()` con carga reducida, implementa `eat()` e incorpora `studyHoursPerWeek()` para representar su doble rol de trabajo y formación.

## 5️⃣ Principios SOLID Aplicados

1. **S – Single Responsibility**
Cada clase concreta tiene una responsabilidad delimitada por su rol. Ejemplo: `ConsultationPatient` modela el flujo de consulta y `AmbulancePatient` modela el flujo de ambulancia, sin mezclar procesos.

2. **O – Open/Closed**
El diseño está abierto a extensión y cerrado a modificación. Ejemplo: para agregar un nuevo tipo de paciente se crea otra subclase de `Patient` implementando sus métodos abstractos, sin cambiar `Patient` ni `Characters`.

3. **L – Liskov Substitution**
Las subclases mantienen el contrato de sus clases base. Ejemplo: cualquier `ConsultationPatient` o `AmbulancePatient` puede usarse como `Patient` respetando `admission()` y `discharge()`.

4. **I – Interface Segregation**
Las interfaces son pequeñas y específicas. `HospitalActions` aplica solo a pacientes (`admission`, `discharge`) y `Workable` solo a médicos (`workHoursPerWeek`), evitando contratos innecesarios.

5. **D – Dependency Inversion**
Las jerarquías dependen de abstracciones (`Patient`, `Doctor`, `HospitalActions`, `Workable`) para definir comportamiento común, y las clases concretas (`SpecialistDoctor`, `StudentDoctor`, `ConsultationPatient`, `AmbulancePatient`) aportan la implementación.

## 6️⃣ Ejecución del Programa

La clase `Main` instancia y ejecuta el escenario completo del sistema.

Crea dos instancias de cada tipo concreto: `ConsultationPatient`, `AmbulancePatient`, `SpecialistDoctor` y `StudentDoctor`.

Simula flujos hospitalarios para consulta y ambulancia, y también actividades de médicos especialistas y médicos estudiantes.

Demuestra polimorfismo a través de métodos sobrescritos en las jerarquías (`admission`, `discharge`, `eat`, `workHoursPerWeek`) y la ejecución finaliza con `exit code 0`.

## 7️⃣ UML

El UML es coherente con el código fuente: refleja la jerarquía `Characters -> Patient/Doctor`, distingue clases abstractas y separa interfaces (`HospitalActions`, `Workable`) de las implementaciones concretas.

También mantiene consistencia con los atributos encapsulados y los getters/setters relevantes en las clases que exponen estado mutable.

## 8️⃣ Estructura del Proyecto

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

## 9️⃣ Posibles Mejoras Futuras

- Tests unitarios
- Persistencia
- Separación por paquetes
- Gestión de excepciones
- Capa de servicios

## 10️⃣ Conclusión Técnica

El proyecto demuestra comprensión estructural de POO mediante jerarquías claras, abstracción e implementación de interfaces con responsabilidades separadas.

El diseño es extensible para incorporar nuevos tipos de entidades y mantiene alineación entre UML y código, preservando coherencia arquitectónica.
