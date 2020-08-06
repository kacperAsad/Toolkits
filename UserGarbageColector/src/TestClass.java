public class TestClass implements GarbageCollectorObject{

    public static void main(String[] args) throws InterruptedException {
        new TestClass().init();

        while (true)
        {
            GarbageCollectorClass.getInstance().collectGarbages();
            Thread.sleep(1000);
            System.out.println(GarbageCollectorClass.getInstance().getStats());
        }
    }

    void init()
    {
        GarbageCollectorClass.getInstance().addObject(this);
        Test2.init();
    }

    @Override
    public void GarbageColectorTrigger() {
        System.out.println("Trigger is run...");
    }
}
