import java.util.ArrayList;
import java.util.List;

/**
 * GarbageCollectorClass is singleton used to delete a unnecessary data
 */
public class GarbageCollectorClass {

    private static GarbageCollectorClass instance;

    // List of objects to be in collecting list
    private List<GarbageCollectorObject> objects;

    // max memory assigned to the jvm
    private float maxMemory;

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

    /**
     * Method addObject is used to add a class to Garbage Collector queue. Must implementing a {@link GarbageCollectorObject}
     * @param object a object implementing a {@link GarbageCollectorObject}
     */
    public void addObject(GarbageCollectorObject object)
    {
        objects.add(object);
    }

    /**
     * Method used to triggers all {@link GarbageCollectorObject} instances added with {@link GarbageCollectorClass#addObject(GarbageCollectorObject)}
     */
    public void collectGarbages()
    {
        objects.forEach(GarbageCollectorObject::GarbageColectorTrigger);
    }

    /**
     * Method to returning current machine stats, all, free and used memory
     * @return {@link Stats} object contains a stats
     */
    public Stats getStats()
    {
        return new Stats(maxMemory , (Runtime.getRuntime().maxMemory() - Runtime.getRuntime().freeMemory()) , Runtime.getRuntime().freeMemory(), objects.size());
    }




}
