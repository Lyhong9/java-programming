package month02.week01;

public class Student {
    String name;
    int age;

    public void addStudent() {
        System.out.println("Student added name: " + name);
        System.out.println("Student added age: " + age);
    }

    public void deleteStudent() {
        System.out.println("Student deleted name: " + name);
        System.out.println("Student deleted age: " + age);
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Lyhong";
        student1.age = 18;
        student1.addStudent();
        student1.deleteStudent();
    }
}
