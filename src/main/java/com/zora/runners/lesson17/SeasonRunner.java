package com.zora.runners.lesson17;

import com.zora.app.classwork.lesson17.Season;

import java.util.Arrays;

/**
 * Created by Kateryna Zora  on 16.05.2017.
 */
public class SeasonRunner {
    public static void main(String[] args) {
        Season season = Season.SPRING;
        if (season == Season.SPRING){
            season = Season.SUMMER;
        }
        System.out.println(season.name());
        System.out.println(Season.AUTUMN.name());
        Season season1 = Season.valueOf("SPRING");
        System.out.println(Arrays.toString(Season.values())); // all object
    }
}
