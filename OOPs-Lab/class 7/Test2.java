
import java.util.ArrayList;
import java.util.Arrays;

class Test2
{
    public static void main(String args[])
    {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);

        System.out.println(arrL);
        System.out.println(Arrays.toString(arr));
    }
}