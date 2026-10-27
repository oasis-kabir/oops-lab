class A {
    int i, j;
    void showij(){
        System.out.println("i and j: "+i+","+j);
    }
}
class B extends A{
    int k;
    void showk(){
        System.out.println("k: "+k);
    }
    void sum(){
        System.out.println("i+j+k: "+ (i+j+k));
    }
}
public class Inherit {
    public static void main(String args[]){
        A ob1 = new A();
        B ob2 = new B();
        ob1.i= 10;
        ob1.j = 20;
        ob1.showij();
        ob2.i = 1;
        ob2.j = 2;
        ob2.k = 3;
        ob2.showij();
        ob2.showk();
        ob2.sum();
    }
}
