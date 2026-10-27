class Box2 {
    double width;
    double height;
    double depth;

    void volume(){
        System.out.print("Volume is: ");
        System.out.println(width*height*depth);
    }
}
public class BoxDemo2 {
    public static void main(String args[]){
        Box2 myBox1 = new Box2();
        Box2 myBox2 = new Box2();

        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        myBox1.volume();
        myBox2.volume();
    }
}
