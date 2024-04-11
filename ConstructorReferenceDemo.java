public class ConstructorReferenceDemo {
    public static void main(String[] args){
        Details d = Student :: new;
        Student s = d.getStudent("Sahil");
    }
}

interface Details {
    public Student getStudent(String name);
}

class Student {
    Student(String name){
        System.out.println(name + " is successfully enrolled.");
    }
}
