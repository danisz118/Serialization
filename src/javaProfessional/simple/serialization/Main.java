package javaProfessional.simple.serialization;

import java.io.*;


public class Main {
    public static void main(String[] args) {
        Group group = new Group("Java");
        Student student = new Student(1, "Yevhenii");

        student.setGroup(group);
        group.setStudent(student);

        File f = new File("C:\\Users\\media\\Desktop\\java-course\\JavaRenewed\\Lesson9_Serialization\\src\\javaProfessional\\simple\\serialization\\output.txt");

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(f));
             ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(f))) {
            outputStream.writeObject(student);
            student = null;
            student = (Student) inputStream.readObject();
            System.out.println(student);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
