class A {
    int i, j;

    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B extends A {
    int k;

    void sum() {
        System.out.println("i + j + k: " + (i + j + k));
    }
    void showk() {
        System.out.println("k: " + k);
    }

}

class SimpleInheritance {
    public static void main(String args[]) {
        A superOb = new A();
        B subOb = new B();

        superOb.i = 10;
        superOb.j = 20;

        System.out.println("Contents of superOb:");
        superOb.show();

        System.out.println();

        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;

        System.out.println("Contents of subOb:");
        subOb.show();
        subOb.showk();

        System.out.println("Sum of i, j and k in subOb:");
        subOb.sum();
    }
}