package com.zora.app.classwork.lesson17;

/**
 * Created by Kateryna Zora  on 16.05.2017.
 */
public enum Holidays {
    HEW_YEAR(1,"January","New Year"), VALENTINS_DAY(14,"February","St. Valentins Day"), EASTER(8,"April","Easter");
    private int day;
    private String month;
    private String holidayName;
    private Holidays(int day, String month,String holidayName){
        this.day = day;
        this.month = month;
        this.holidayName = holidayName;
    }
    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public String getHolidayName() {
        return holidayName;
    }
}
