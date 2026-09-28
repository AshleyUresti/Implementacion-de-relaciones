package asociacion;

import java.util.HashSet;
import java.util.Set;

// Asociación entre Bank y Employee
public class AssociationExample {

    public static void main(String[] args) {
        // Creando objetos Employee
        Employee emp1 = new Employee("Raúl");
        Employee emp2 = new Employee("Vanessa");

        // Agregando los empleados a un conjunto
        Set<Employee> employees = new HashSet<>();
        employees.add(emp1);
        employees.add(emp2);

        // Creando el objeto Bank
        Bank bank = new Bank("Banco Central");

        // Asignando los empleados al banco
        bank.setEmployees(employees);

        // Recorriendo y mostrando los empleados del banco
        for (Employee emp : bank.getEmployees()) {
            System.out.println(emp.getEmployeeName()
                    + " pertenece al banco "
                    + bank.getBankName());
        }
    }
}