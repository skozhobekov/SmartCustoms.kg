package Main.Pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {
    public static void main(String[] args) {

        String mercury = new String("Меркурий");
        String venus = new String("Венера");
        String earth = new String("Земля");
        String mars = new String("Марс");
        String jupiter = new String("Юпитер");
        String saturn = new String("Сатурн");
        String uranus = new String("Уран");
        String neptune = new String("Нептун");
        String planet1 = new String("планета1");
        String planet2 = new String("планета2");


        ArrayList<String> planets = new ArrayList<>(Arrays.asList(mercury, venus, earth, mars,jupiter,saturn, uranus, neptune));
        ArrayList<String> planetsTwo = new ArrayList<>(Arrays.asList(mercury, venus, earth, mars,jupiter,saturn, uranus, neptune, planet1, planet2));
/**
 * неизсменная коллекция unmodifiedList
 List<String> solarSystem = java.util.Collections.unmodifiableList(new ArrayList<>(Arrays.asList(mercury, venus, earth, mars,jupiter,saturn, uranus, neptune)));
*/
        java.util.Collections.sort(planets);
        java.util.Collections.reverse(planets);
        System.out.println(planets);
        java.util.Collections.swap(planets, planets.indexOf(jupiter), planets.indexOf(venus));
        System.out.println(planets);

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));

        System.out.println(java.util.Collections.disjoint(planets, planetsTwo));


    }
}
