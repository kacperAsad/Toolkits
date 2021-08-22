/**
 * Stats is a class that represent a statistics about GarbageCollectorClass, in example: free memory, actual used memory
 */
public class Stats {

    private  float maxMemory;
    private  float actualUsedMemory;
    private  float actualFreeMemory;
    private  int actualGarbageCollectorObjectInstances;

    public Stats(float maxMemory, float actualUsedMemory, float actualFreeMemory, int actualGarbageCollectorObjectInstances) {
        this.maxMemory = maxMemory;
        this.actualUsedMemory = actualUsedMemory;
        this.actualFreeMemory = actualFreeMemory;
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

    public int getActualGarbageCollectorObjectInstances() {
        return actualGarbageCollectorObjectInstances;
    }

    @Override
    public String toString() {
        return "Max = "+maxMemory+"\n Used = "+actualUsedMemory+"\n Free = "+actualFreeMemory+"\n Object garbages = "+actualGarbageCollectorObjectInstances;
    }
}
