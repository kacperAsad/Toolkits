public class Valut {

    private static Valut instance;
    private SafeStorage storage;
    private Integer adminCode = null;

    private Valut()
    {
        storage = SafeStorage.getInstance();
    }
    public static Valut getInstance() {
        if (instance == null)
        {
            instance = new Valut();
        }
        return instance;
    }


    public boolean addToValut(String key , Object storageObject , String token)
    {
        return storage.store(key , storageObject);
    }


}
