class Student {
    String name;
    int age;

    Student(){
        System.out.println("Student created");
    }
    Student(String name, int age){
        this();
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println(name+" "+ age);
    }
}
class Yo{
    public static void main(String args[]){
        Student s1 = new Student("Rahul", 20);
        s1.display();
    }

}