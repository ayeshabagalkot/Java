class Employee {
    int ssn;
    String name;

    Employee(int ssn, String name){
        this.ssn = ssn;
        this.name = name;
    }
    public void Details(){
        System.out.println(ssn + " " + name);
    }
}

class Student{
    int usn;
    String name;

    Student(int usn, String name){
        this.usn = usn;
        this.name = name;
    }
    public void Details(){
        System.out.println(usn + " " + name);
    }
}

public class Constructors {
    public static void main(String[] args) {
        Employee e1 = new Employee(2334, "Aditya H");
        Student s1 = new Student(198, "Keerti M");
        e1.Details();
        s1.Details();
    }
}
