package secondMonth.firstWeek;

public class classobj {
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
        classobj obj1 = new classobj();
        obj1.name = "Lyhong";
        obj1.age = 18;
        obj1.addStudent();
        obj1.deleteStudent();
    }
}
