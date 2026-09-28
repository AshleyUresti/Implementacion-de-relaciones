package agregacion;

import java.util.List;

public class Institute {

    private String instituteName;
    private List<Department> departments;

    public Institute(String instituteName, List<Department> departments) {
        this.instituteName = instituteName;
        this.departments = departments;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Cuenta el total de estudiantes del instituto
    public int getTotalStudentsInInstitute() {
        int noOfStudents = 0;
        for (Department dept : departments) {
            noOfStudents += dept.getStudents().size();
        }
        return noOfStudents;
    }
}