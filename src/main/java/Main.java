import java.util.*;

/**
 * Created by Ark on 27.12.2016.
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(22);
        list.add(5);
        list.add(-11);
        list.add(2);
        list.add(7);
        list.add(-3);
        printOut("ArrayList:\t\t\t\t\t\t\t", list);

        Set<Integer> set = new HashSet<Integer>(list);
        printOut("ArrayList imported into HashSet:\t", set);

        int min = Integer.MAX_VALUE;
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()) {
            int temp = it.next();
            if(min > temp)
                min = temp;
        }
        System.out.println("MinValue = " + min);
        System.out.println("MinValue = " + Collections.min(set));

        Set<Integer> orderedSet = new TreeSet<>(set);
        printOut("ArrayList imported into TreeSet:\t", orderedSet);

        set = new HashSet<Integer>(orderedSet);
        printOut("TreeSet imported into HashSet:\t\t", set);

        set = new LinkedHashSet<Integer>(orderedSet);
        printOut("TreeSet imported into LinkedHashSet:", set);

    }

    private static void printOut(String message, Collection<Integer> collection) {
        System.out.print(message);
        for(int elem : collection)
            System.out.print(elem + "\t\t");
        System.out.println();
    }


}
