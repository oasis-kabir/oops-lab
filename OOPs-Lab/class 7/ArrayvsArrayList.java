
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayvsArrayList {
    public static void main(String args[]){
        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 2;

        System.out.println(arr[0]);

        ArrayList<Integer> al = new ArrayList<Integer>(2);

        al.add(1);
        al.add(2);
        System.out.println(al.get(0));
    }
}
