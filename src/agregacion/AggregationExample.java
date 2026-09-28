package agregacion;

import java.util.ArrayList;
import java.util.List;

public class AggregationExample {

    public static void main(String[] args) {
        // Estudiantes independientes (existen sin ningún departamento)
        Student s1 = new Student("Paola", 1);
        Student s2 = new Student("Sachi", 2);
        Student s3 = new Student("Peralta", 3);
        Student s4 = new Student("Ramón", 4);

        // Listas de estudiantes por departamento
        List<Student> cseStudents = new ArrayList<>();
        cseStudents.add(s1);
        cseStudents.add(s2);

        List<Student> eeStudents = new ArrayList<>();
        eeStudents.add(s3);
        eeStudents.add(s4);

        // Agregación: Department "tiene" estudiantes
        Department cse = new Department("CSE", cseStudents);
        Department ee = new Department("EE", eeStudents);

        List<Department> departments = new ArrayList<>();
        departments.add(cse);
        departments.add(ee);

        // Agregación: Institute "tiene" departamentos
        Institute institute = new Institute("Instituto Tecnológico", departments);

        System.out.println("Total de estudiantes en el instituto: "
                + institute.getTotalStudentsInInstitute());

        // El instituto desaparece, pero sus partes siguen existiendo
        institute = null;
        System.out.println("El instituto fue eliminado, pero los estudiantes siguen existiendo: "
                + s1.getStudentName() + ", " + s2.getStudentName()
                + ", " + s3.getStudentName() + ", " + s4.getStudentName());
    }
}