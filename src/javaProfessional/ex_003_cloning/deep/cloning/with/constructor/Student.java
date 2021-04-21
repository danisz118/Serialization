package javaProfessional.ex_003_cloning.deep.cloning.with.constructor;


public class Student {
    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // copy constructor
    public Student (Student other) {
        this(other.age, other.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
