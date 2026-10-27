class A1 {
    A1(){
        this(5);
        System.out.println("Hello a ");
    }
    A1(int x){
        System.out.println(x);
    }
}
class TestThis4 {
    public static void main(String args[]){
        A1 a = new A1();
    }
}
