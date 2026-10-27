import java.util.*;

class ArrayListExample{
    public static void main(String args[]){
        ArrayList a1 = new ArrayList();
        a1.add("jack");
        a1.add("Tyler");
        Iterator itr = a1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
