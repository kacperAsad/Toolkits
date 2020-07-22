public class SafeStorage {

    private static SafeStorage instance;

    private SafeStorage()
    {

    }

    public static SafeStorage getInstance()
    {
        if (instance == null)
        {
            instance = new SafeStorage();
        }
        return instance;
    }

    public boolean store(String key , Object store)
    {

    }
}
