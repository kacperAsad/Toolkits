import java.util.ArrayList;
import java.util.List;

public class GarbageCollectorClass {

    private static GarbageCollectorClass instance;

    private List<GarbageCollectorObject> objects;

    private float maxMemory;
    private float installedMemory = 0;

    // Funkcje (ciało) klasy

    private GarbageCollectorClass() {
        this.initialization();
    }

    public static GarbageCollectorClass getInstance() {
        if (instance == null) {
            instance = new GarbageCollectorClass();
        }
        return instance;
    }

    private void initialization()
    {
        objects = new ArrayList<>();
        maxMemory = Runtime.getRuntime().maxMemory();
    }

    public void addObject(GarbageCollectorObject object)
    {
        objects.add(object);
    }
    public void collectGarbages()
    {
        objects.forEach(GarbageCollectorObject::GarbageColectorTrigger);
    }
    public Stats getStats()
    {
        return new Stats(maxMemory , (Runtime.getRuntime().maxMemory() - Runtime.getRuntime().freeMemory()) , Runtime.getRuntime().freeMemory() , installedMemory , objects.size());
    }




}
