import java.util.*;

public class AllTests {

    static int testCount = 5;

    // Enter point in tests
    public static void main(String[] args) {

        // Parsing arguments
        runTest(() -> {
            String[] testArgs = new String[4];
            testArgs[0] = "TestKey1=TestValue1;"; testArgs[1] = "TestKey2=TestValue2;"; testArgs[2] = "TestKey3=TestValue3;"; testArgs[3] = "TestKey4=TestValue4";
            ArgsParser parser = new ArgsParser(testArgs);
            parser.setArgsType(ArgsParser.MapType);
            Map<String, String> parsedArgs = parser.getMapfromArgs();
            System.out.println(parsedArgs);
            return parsedArgs.containsKey("TestKey2") && parsedArgs.containsValue("TestValue4");
        }, 1, testCount);

        // Colors Testing
        runTest(() -> {
            System.out.println("Testing Colors:");
            System.out.println(ConsoleColor.BLUE_BACKGROUND + "Blue Background");
            ConsoleColor.RESET_COLOR();
            return true;
        }, 2, testCount);

        // Saving and reading from map file representation
        runTest(() -> {
            HashMap<String, String> testMap = new HashMap<>();
            testMap.put("TestKey", "TestValue");
            MapSaver.saveMapInFile("Test/testData/testmapsave.map", testMap);
            @SuppressWarnings("rawtypes") Map testMapRead = MapReader.loadMapWithFile("Test/testData/testmapsave.map");
            System.out.println("Original value: " + testMap);
            System.out.println("Map saved and readed: " + testMapRead.toString());
            return testMap.equals(testMapRead);
        }, 3, testCount);


        runTest(() -> {
            HashMap<String, String> lang = (HashMap<String, String>) LangLoader.loadLang("Test/testData/lang-pl.json");
            System.out.println(lang.getOrDefault("exit", "Cannot find word"));
            return lang.getOrDefault("exit", "Cannot find word").equals("Wyjdź");
        }, 4, testCount);

    }

    private static void runTest(TestFunction function, int testCounter, int allTests){
        System.out.println(ConsoleColor.YELLOW_BRIGHT + " --- Running Test ["+testCounter+" | "+allTests+"] --- " + ConsoleColor.RESET);
        boolean t = function.RunTestFunction();
        System.out.println(ConsoleColor.YELLOW_BRIGHT + " --- Test Ended ---" + ConsoleColor.RESET);
        String res;// = "";
        if (t){
            res = ConsoleColor.GREEN + "Ok" + ConsoleColor.RESET;
        }else{
            res = ConsoleColor.RED + "Not Ok" + ConsoleColor.RESET;
        }
        System.out.println(ConsoleColor.YELLOW_BRIGHT + "   -- Result : "  + ConsoleColor.RESET + res);
    }

}
