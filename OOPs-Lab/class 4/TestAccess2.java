
class Test2 {
    int a =10;
    public int b = 20;
    private int c;

    int getc(){
        return c;
    }

    void display(){
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
    }
}

public class TestAccess2 {
    public static void main(String args[]){
        Test2 ob = new Test2();
        ob.display();
        System.out.println("-------------------------");

        //accessing by printing(only a and b, cant access c)
        System.out.println(ob.a);
        System.out.println(ob.b);
        System.out.println(ob.getc());

    }
}
