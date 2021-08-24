import java.util.*;

public class AllTests {

    static int testCount = 5;

    // Enter point in tests
    public static void main(String[] args) {
        runTest(() -> {
            String[] testArgs = new String[4];
            testArgs[0] = "TestKey1=TestValue1;"; testArgs[1] = "TestKey2=TestValue2;"; testArgs[2] = "TestKey3=TestValue3;"; testArgs[3] = "TestKey4=TestValue4";
            ArgsParser parser = new ArgsParser(testArgs);
            parser.setArgsType(ArgsParser.MapType);
            Map<String, String> parsedArgs = parser.getMapfromArgs();
            System.out.println(parsedArgs);
            return parsedArgs.containsKey("TestKey2") && parsedArgs.containsValue("TestValue4");
        }, 1, testCount);
        runTest(() -> {
            System.out.println("Testing Colors:");
            System.out.println(ConsoleColor.BLUE_BACKGROUND + "Blue Background");
            ConsoleColor.RESET_COLOR();
            return true;
        }, 2, testCount);
        runTest(() -> {
            HashMap<String, String> testMap = new HashMap<>();
            testMap.put("TestKey", "TestValue");
            MapSaver.saveMapInFile("Test/testData/testmapsave.map", testMap);
            @SuppressWarnings("rawtypes") Map testMapRead = MapReader.loadMapWithFile("Test/testData/testmapsave.map");
            return testMap.equals(testMapRead);
        }, 3, testCount);

    }

    private static void runTest(TestFunction function, int testCounter, int allTests){
        System.out.println(" --- Running Test ["+testCounter+" | "+allTests+"] --- ");
        boolean t = function.RunTestFunction();
        System.out.println(" --- Test Ended ---");
        String res = "";
        if (t){
            res = "Ok";
        }else{
            res = "Not Ok";
        }
        System.out.println("   -- Result : " + res);
    }

}
