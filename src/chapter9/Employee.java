package chapter9;

/**
 * The Employee class inherits from the Person class, adding additional attributes specific to an employee.
 * It represents an employee with details such as their employee ID and job title.
 */
public class Employee extends Person {

    // Private fields to store employee's specific attributes
    private String employeeId; // The unique identifier for the employee
    private String title;      // The job title of the employee

    public Employee()
    {
         /*
          *If the there is no default constructor in the super class,
          * we have to call one of the constructors that exists.
          */
        super("Ali");
        System.out.println("Employee constructor");
    }

    /**
     * Gets the employee ID of the employee.
     *
     * @return the employee's unique identifier.
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * Sets the employee ID of the employee.
     *
     * @param employeeId the unique identifier to assign to the employee.
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * Gets the job title of the employee.
     *
     * @return the employee's job title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the job title of the employee.
     *
     * @param title the job title to assign to the employee.
     */
    public void setTitle(String title) {
        this.title = title;
    }
}
