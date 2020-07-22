import java.util.LinkedHashMap;
import java.util.Map;

public class MapIOExample {

    static String fileName = "map.key";

    public static void main(String[] args) {
        Map<String, String> exampleMap = new LinkedHashMap<>();
        exampleMap.put("Cat.name" , "Kot");
        exampleMap.put("Cat.age" , "25");
       // saveMap(exampleMap);
        getMap();
    }

    static void saveMap(Map m)
    {
        MapSaver.saveMapInFile(fileName,m);
    }
    static void getMap()
    {
        var m = MapReader.loadMapWithFile(fileName);

        if (m != null) {
            m.forEach((k, v) -> {
                System.out.println(k.toString() + v.toString());
            });
        }else{
            System.out.println("Nie wczytano poprawnie mapy, albo mapa była pusta");
        }
    }
}
