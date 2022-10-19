import java.lang.invoke.MethodHandles;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.TooManyListenersException;

public class SafeStorage {

    private static SafeStorage instance;
    private final String pathToStorage;
    private Map<String,String> storageElements;
    private final String TOKEN;

    private SafeStorage()
    {
        pathToStorage = "/SafeValut/data/datastorage.ong";
        storageElements = new LinkedHashMap<>();
        TOKEN = generateToken();
        System.out.println("JESTEM");
    }
    private String generateToken()
    {
        String tokBuff = "";
        int x = 1920;
        Random r = new Random(new Random().nextInt(100000000));
        for (int i = 0; i < x; i++) {
            String buff = r.nextInt()+"";
            tokBuff += buff;
            System.out.println("Int "+i);
            System.out.println(tokBuff);
        }
        System.out.println("TOKEN");
        System.out.println(tokBuff);
        return tokBuff;
    }

    public static SafeStorage getInstance()
    {
        if (instance == null)
        {
            instance = new SafeStorage();
        }
        return instance;
    }

    public boolean store(String key , String store)
    {
        storageElements.put(key , store);
        return true;
    }
    public boolean putToFile()
    {
        return MapSaver.saveMapInFile(pathToStorage , storageElements);
    }

    @Deprecated
    public boolean loadStorage()
    {
        storageElements = MapReader.loadMapWithFile(pathToStorage);
        if (storageElements == null)
        {
            return false;
        }
        return true;
    }

    public void loadAndAddtoActual()
    {
        storageElements.putAll(MapReader.loadMapWithFile(pathToStorage));
    }
}
