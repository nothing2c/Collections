import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileHandling {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\t00194828\\Desktop\\hamlet.txt";
        Set<String> set = new HashSet<>();
        Map<String, Integer> map = new TreeMap<>();

        try
        {
            Scanner in = new Scanner(new File(fileName));

            int lineNumber = 1;

            while (in.hasNextLine())
            {
                Scanner lineParser = new Scanner(in.nextLine());
                // Use any characters other than a-z, A-Z, 0-9 as delimiters
                lineParser.useDelimiter("[^A-Za-z0-9_]+");
                while (lineParser.hasNext())
                {
                    String identifier = lineParser.next();
                    //System.out.println( identifier);
                    //set.add(identifier);
                    map.put(identifier, lineNumber);
                }

                lineNumber++;
            }

            Iterator<String> it = set.iterator();

            while(it.hasNext())
            {
                System.out.print(it.next() + " ");
            }

            for(String key : map.keySet())
            {
                System.out.println(key);
            }

            for(Map.Entry<String, Integer> entry: map.entrySet())
            {
                System.out.print(entry.getKey() + entry.getValue() + " ");
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
