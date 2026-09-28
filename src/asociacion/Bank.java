package asociacion;

import java.util.HashSet;
import java.util.Set;

public class Bank {

    private String bankName;
    private Set<Employee> employees = new HashSet<>();

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }
}