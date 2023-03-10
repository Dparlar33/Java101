package OOP;

class Student{
    int age;
    String name,surname;
    public void getInfo() {
        System.out.println(name +" " + surname+ " " + age);
    }
    Student(int age){
        this.age =age;
    }
}
public class StudentInformationSystem {
    public static void main(String[] args) {
        Student foo = new Student(24);
        foo.name ="Deniz";
        foo.surname ="Parlar";
        foo.getInfo();
    }
}
