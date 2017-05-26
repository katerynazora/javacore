package com.zora.runners.lesson17;

import com.zora.app.classwork.lesson17.Holidays;

/**
 * Created by Kateryna Zora  on 16.05.2017.
 */
public class HolidaysRunner {
    public static void main(String[] args) {
        for (Holidays cName : Holidays.values()){
            System.out.println( cName.getHolidayName() + " holiday is on " + cName.getMonth() + ", " + cName.getDay());
        }
    }
}
