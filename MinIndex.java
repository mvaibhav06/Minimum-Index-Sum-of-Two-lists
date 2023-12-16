package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MinIndex {

    public static void findRestaurant(String[] list1, String[] list2){
        HashMap<String, Integer> inp = new HashMap<>();

        List<String> out = new ArrayList<>();

        for (int i=0; i<list1.length; i++){
            inp.put(list1[i], i);
        }

        int min_sum = Integer.MAX_VALUE;
        String min_ele = "";

        for (int i=0; i<list2.length; i++){
            if (inp.containsKey(list2[i])){
                if (i+inp.get(list2[i]) <= min_sum){
                    if (i+inp.get(list2[i]) < min_sum){
                        out.clear();
                    }
                    min_sum = i+inp.get(list2[i]);
                    min_ele = list2[i];
                    out.add(min_ele);
                }
            }
        }

        String[] outarr = out.toArray(new String[out.size()]);

        System.out.println(Arrays.toString(outarr));
    }

    public static void main(String[] args) {
        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"KFC","Shogun","Burger King"};

        findRestaurant(list1, list2);
    }
}
