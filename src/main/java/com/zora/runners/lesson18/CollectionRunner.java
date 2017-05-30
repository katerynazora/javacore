package com.zora.runners.lesson18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Kateryna Zora  on 23.05.2017.
 */
public class CollectionRunner {
    public static void main(String[] args) {
        String bmw = "BMW";
        String audi = "AUDI";
        String ford = "FORD";
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(bmw);
        arrayList.add(audi);

        System.out.println(arrayList);

        Map map = new HashMap<>();//16 entry massive
        map.put("KIT", 13);
        map.put("Ciklum", 15);
        Set entries = map.entrySet();
        System.out.println(entries);
        Set keys =  map.keySet();
        System.out.println(keys);
        System.out.println(map.containsKey("Ciklum"));
        System.out.println(map.containsValue(13));





    }
}
