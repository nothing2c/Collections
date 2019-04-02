import java.util.ListIterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListLab {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Kay");
        list.add("Jay");
        list.add("May");
        list.add("Fay");

        ListIterator<String> it = list.listIterator();

        System.out.println(list);

        while(it.hasNext())
        {
            String name = it.next();

            System.out.println(name);
            if(name.equals("May"))
                it.add("Ray");

            if(name.equals("Jay"))
                it.remove();
        }

        ListIterator lit = list.listIterator();

        while(lit.hasNext())
        {
            System.out.print(lit.next() + ", ");
        }

        System.out.println();

        while(lit.hasPrevious())
        {
            System.out.print(lit.previous()+", ");
        }
    }


}
