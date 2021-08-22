import java.util.*;

public class AllTests {

    // Enter point in tests
    public static void main(String[] args) {
        AllTests tests = new AllTests();
        tests.testArgsParser();
        tests.testMapIO();
    }
    private boolean testArgsParser(){
        String[] args = new String[3];
        args[0] = "Siema;Hello";
        args[1] = "XDDD;";
        args[2] = "Hello=;World";
        ArgsParser parser = new ArgsParser(args);
        parser.setArgsType(ArgsParser.ListType);
        List<String> mapValues = parser.getListfromArgs();

        System.out.println(mapValues);
        System.out.println(Arrays.toString(args));
        return true;
    }
    private boolean testMapIO(){
        Map<String, String> peoples = new LinkedHashMap<>();
        peoples.put("name", "kacper");
        peoples.put("second-name", "Lipiec");
        MapSaver.saveMapInFile("Test/testData/peoples.map", peoples);
        peoples.clear();

        peoples = MapReader.loadMapWithFile("Test/testData/peoples.map");
        System.out.println(peoples);
        return true;
    }




}
