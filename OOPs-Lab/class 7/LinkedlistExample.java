import java.util.*;

public class LinkedlistExample {
    public static void main(String args[]){
        LinkedList<String> al = new LinkedList<String>();
        al.add("Rachit");
        al.add("Rahul");
        al.add("Rajat");
        Iterator<String> itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
