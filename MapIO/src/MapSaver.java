import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * Klasa MapSaver służy do zapisywania Map w plikach zrozumiałych dla człowieka, które można ponownie wczytywać
 * Class MapSaver is used to save a Map object in files with human-readable format, that be reuseable
 * @author 'kacperAsad' na GitHub
 */

public class MapSaver {

    /**
     * Private MapSaver Constructor
     */

    private MapSaver() {}

    /**
     * Static function saveMapInFile is used to save a Map object in file with format key - value
     * @param filePath
     * Path to save a file with map data
     * @param map
     * Map to save
     * @return
     * true if file is correctly saved | false if any error occurred
     */
    public static boolean saveMapInFile(String filePath , Map map)
    {
        return saveMapInFile(new File(filePath) , map);
    }
    /**
     * Static function saveMapInFile is used to save a Map object in file with format key - value
     * @param f
     * Abstract file to save a file with map data
     * @param map
     * Map to save
     * @return
     * true if file is correctly saved | false if any error occurred
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
