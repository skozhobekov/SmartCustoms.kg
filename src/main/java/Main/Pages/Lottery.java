package Main.Pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lottery {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(100);
        for (int i = 0; i <= 100; i++) {

            nums.add(i);
        }
        Collections.shuffle(nums);
        System.out.println("выгружаем 10 чисел");
        for (int i = 0; i < 10; i++) {
            System.out.println(nums.get(i));
        }
    }
}
