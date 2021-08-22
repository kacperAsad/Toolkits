import java.io.File;
import java.io.FileReader;
import java.lang.annotation.Documented;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapReader {

    /**
     * Static Function loadMapWithFile is used to loading data from file to map
     * @param filePath
     * Data file
     * @return
     * New Map Object if file is good | null if anny error occurred when loading
     */
    public static Map loadMapWithFile(String filePath)
    {
        return loadMapWithFile(new File(filePath));
    }
    /**
     * Static Function loadMapWithFile is used to loading data from file to map
     * @param file
     * Data file
     * @return
     * New Map Object if file is good | null if anny error occurred when loading
     */
    public static Map loadMapWithFile(File file)
    {
        HashMap map = new HashMap<>();

        if (!file.exists())return null;
        if (!file.canRead())return null;

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext())
            {
                formatAndAdd(sc.nextLine() , map);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return map;
    }

    /**
     * Służy do formatowania danych z pliku na parę objektów typu 'klucz - wartość'
     * Method formatAndAdd is used to format data from file to get key - value format
     * @param s
     * One line of the file. Example:
     *      email:test@mail.com
     * @param m
     * Map than be a receiver from this function
     */
    private static void formatAndAdd(String s , Map m)
    {
        String[] w = s.split(":");
        m.put(w[0] , w[1]);
    }
}
