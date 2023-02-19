import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        
        List<String> names = new ArrayList<String>();
        names.add("John");
        names.add("Peter");
        names.add("Mary");
        //System.out.println("Size:" + names.size());
        names.add("Paul");
        names.add("David");
        names.add("Jane");
        //System.out.println("Size:" + names.size());
        
        /*for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }*/

        /*for (String str : names) {
            System.out.println(str);
        }*/

        //names.forEach((String s) -> System.out.println(s));

        List<String> names2 = names.stream()
            .filter(p -> p.startsWith("J"))
            .map(p -> p)
            .collect(Collectors.toList());
        
        names2.forEach((String s) -> System.out.println(s));

        /*Set<String> keys = new HashSet<String>();
        keys.add("9F05");
        keys.add("AC8B");
        keys.add("992E");
        keys.add("B403");
        keys.add("AC8B");*/

        /*Map<Integer, String> keyMap = new HashMap<Integer, String>();
        keyMap.put(11, "N1");
        keyMap.put(12, "N2");
        keyMap.put(13, "N3");
        keyMap.put(14, "N4");
        keyMap.put(15, "N5");
        System.out.println(keyMap.get(13));
        keyMap.put(14, "N6");*/
    }
}