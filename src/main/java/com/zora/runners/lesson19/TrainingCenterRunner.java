package com.zora.runners.lesson19;

import com.zora.app.classwork.lesson19.TrainingCenter;
import org.omg.CORBA.Object;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Kateryna Zora  on 26.05.2017.
 */
public class TrainingCenterRunner {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap(
                new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o1.toLowerCase().compareTo(o2.toLowerCase());
                    }
                }
        );
        TrainingCenter kit = new TrainingCenter();
        kit.name = "KIT";

        TrainingCenter bio = new TrainingCenter();
        bio.name = "BOI";

        TrainingCenter qaLight = new TrainingCenter();
        qaLight.name = "QALIGHT";

        TrainingCenter step = new TrainingCenter();
        step.name = "STEP";

        Map<TrainingCenter, Integer> map = new HashMap(32);
        map.put(kit, 13);
        map.put(bio, 12);
        map.put(qaLight,14);
        map.put(step, 11);

        System.out.println(map);
        System.out.println(map.entrySet());
        for (Map.Entry<TrainingCenter, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    //public static void add (Object object)
}