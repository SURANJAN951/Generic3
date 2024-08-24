import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Generic3 {
    public static void main(String[] args) {
        ArrayList<Integer> al= new ArrayList<Integer>();
        al.add(64);
        al.add(56);
        al.add(100);
        al.add(64);
        al.add(40);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);

        ArrayList<String> al2=new ArrayList<String>();
        al2.add("pw");
        al2.add("skills");
        al2.add("java");
        System.out.println(al2);

        Collections.sort(al2);
        System.out.println(al2);

        int index = Collections.binarySearch(al,56);
        System.out.println("index is " + index);

        Collections.rotate(al,1);
        //The elements in the list are shifted in a circular manner from 1 position.
        System.out.println(al);

        Collections.shuffle(al); //data ko randomly organise kar dega.
        System.out.println(al);

        System.out.println(Collections.frequency(al,64));//64 list me kitni baar hai.
    }
}
