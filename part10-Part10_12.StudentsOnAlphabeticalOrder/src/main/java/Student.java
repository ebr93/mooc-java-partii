

public class Student implements Comparable<Student> {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    // compares students by name, ignores capital letters
    @Override
    public int compareTo(Student student) {
        return this.name.compareToIgnoreCase(student.getName());
    }
}
