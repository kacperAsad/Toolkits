public class Test2 implements GarbageCollectorObject{

    public static void init()
    {
        new Test2().in();
    }

    void in()
    {
        GarbageCollectorClass.getInstance().addObject(this);
    }
    @Override
    public void GarbageColectorTrigger() {
        System.out.println("Test2 trigger");
    }
}
