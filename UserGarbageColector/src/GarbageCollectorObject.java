/**
 * Interface GarbageCollectorObject is used to create a instances of the Garbage Collector. Must be added with code
 * {@code GarbageCollectorClass.getInstance().addObject(this object instance);}
 */
public interface GarbageCollectorObject {
    /**
     * Method than trigger when user use the {@link GarbageCollectorClass#collectGarbages()}
     */
    void GarbageColectorTrigger();
}
