package chapter9;

/**
 * Person class represents an individual with basic attributes such as name, age, and gender.
 * It provides getter and setter methods to access and modify these attributes.
 * Person class is a super class.
 */
public class Person {

    // Private fields to store the attributes of a person
    private String name;   // The name of the person
    private int age;       // The age of the person
    private String gender; // The gender of the person

    public Person()
    {
        System.out.println("Person constructor");
    }

    /**
     * Gets the name of the person.
     *
     * @return the name of the person.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the person.
     *
     * @param name the name to assign to the person.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the age of the person.
     *
     * @return the age of the person.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the person.
     *
     * @param age the age to assign to the person.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets the gender of the person.
     *
     * @return the gender of the person.
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the gender of the person.
     *
     * @param gender the gender to assign to the person.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
}
