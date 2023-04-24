package SkyProJavaIND.StreamApiAndOptional.excemption;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(String s) {
        super(s);
    }
}
