import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * Klasa MapSaver służy do zapisywania Map w plikach zrozumiałych dla człowieka, które można ponownie wczytywać
 * @author 'kacperAsad' na GitHub
 */

public class MapSaver {

    /**
     * Konstruktor klasy MapSaver jest prywatny, ponieważ klasa ta nie potrzebuje konstruktora
     */

    private MapSaver() {}

    /**
     * Statyczna metoda saveMapInFile służy jak sama nazwa mówi do zapisywania mapy w pliku w postaci klucz - zawartość
     * @param filePath
     * Służy do określania ścieżki do pliku w którym ma być zapisana mapa
     * @param map
     * Służy do przesłania mapy do zapisu
     * @return
     * true jeśli mapa została poprawnie zapisana / false jeśli wystąpił jakiś błąd
     */
    public static boolean saveMapInFile(String filePath , Map map)
    {
        return saveMapInFile(new File(filePath) , map);
    }
    /**
     * Statyczna metoda saveMapInFile służy jak sama nazwa mówi do zapisywania mapy w pliku w postaci klucz - zawartość
     * @param f
     * Służy do określania pliku w którym ma być zapisana mapa
     * @param map
     * Służy do przesłania mapy do zapisu
     * @return
     * true jeśli mapa została poprawnie zapisana / false jeśli wystąpił jakiś błąd
     */
    public static boolean saveMapInFile(File f , Map map){
        try (FileWriter fw = new FileWriter(f)){
            if (!map.isEmpty())
            {
                map.forEach((k , v) -> {
                    try {
                        fw.write(k +":"+v);
                        fw.write("\n");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                });




                fw.flush();
                fw.close();
                return true;
            }
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return false;

    }
}
