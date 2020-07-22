public class Valut {

    private static Valut instance;
    private static SafeStorage storage;
    private Integer adminCode = null;

    private Valut()
    {

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
        if ()
        return storage.store()
    }


}
