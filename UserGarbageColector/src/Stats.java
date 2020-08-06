public class Stats {

    private  float maxMemory;
    private  float actualUsedMemory;
    private  float actualFreeMemory;
    private  float InstalledMemory;
    private  int actualGarbageCollectorObjectInstances;

    public Stats(float maxMemory, float actualUsedMemory, float actualFreeMemory, float installedMemory, int actualGarbageCollectorObjectInstances) {
        this.maxMemory = maxMemory;
        this.actualUsedMemory = actualUsedMemory;
        this.actualFreeMemory = actualFreeMemory;
        InstalledMemory = installedMemory;
        this.actualGarbageCollectorObjectInstances = actualGarbageCollectorObjectInstances;
    }

    public float getMaxMemory() {
        return maxMemory;
    }

    public float getActualUsedMemory() {
        return actualUsedMemory;
    }

    public float getActualFreeMemory() {
        return actualFreeMemory;
    }

    public float getInstalledMemory() {
        return InstalledMemory;
    }

    public int getActualGarbageCollectorObjectInstances() {
        return actualGarbageCollectorObjectInstances;
    }

    @Override
    public String toString() {
        return "Max = "+maxMemory+"\n Used = "+actualUsedMemory+"\n Free = "+actualFreeMemory+"\n Object garbages = "+actualGarbageCollectorObjectInstances;
    }
}
