import java.io.File;
import java.io.FileReader;
import java.lang.annotation.Documented;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapReader {

    /**
     * Statyczna metoda loadMapWithFile służy do jak nazwa wskazuje ładowania danych i tworzenia nowego objektu Mapy
     * @param filePath
     * Określa plik z którego są pobierane dane
     * @return
     * Nowy objekt Map z załadowanymi danymi z pliku / null-a jeśli wystąpił jakikolwiek bezinwazyjny problem z pobraniem danych z pliku
     */
    public static Map loadMapWithFile(String filePath)
    {
        return loadMapWithFile(new File(filePath));
    }
    /**
     * Statyczna metoda loadMapWithFile służy do jak nazwa wskazuje ładowania danych i tworzenia nowego objektu Mapy
     * @param file
     * Określa abstrakcyjny plik z którego są pobierane dane
     * @return
     * Nowy objekt Map z załadowanymi danymi z pliku / null-a jeśli wystąpił jakikolwiek bezinwazyjny problem z pobraniem danych z pliku
     */
    public static Map loadMapWithFile(File file)
    {
        HashMap map = new HashMap();

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
     * @param s
     * Jest to jedna linia z pliku. Może być to na przykład 'email:examplemail@example.com'
     * @param m
     * Określa mapę do której ma być dodana para 'klucz - wartość' pobrana z @param s
     */
    private static void formatAndAdd(String s , Map m)
    {
        String[] w = s.split(":");
        m.put(w[0] , w[1]);
    }
}
