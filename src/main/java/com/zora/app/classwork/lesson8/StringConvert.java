package com.zora.app.classwork.lesson8;

/**
 * Created by Kateryna Zora  on 31.03.2017.
 */
public class StringConvert {
    public static void main(String[] args) {
        int convert = 4;
        double convert1 = 2.90;
        long convert2 = 234322;
        boolean convert3 = true;
        String countIntToString = String.valueOf(convert);
        Integer countInt = Integer.valueOf(countIntToString);
        System.out.println(countInt.equals(countIntToString));

        String countDoubleToString = String.valueOf(convert1);
        Double countDouble = Double.valueOf(countDoubleToString);
        System.out.println(countDouble.equals(countDoubleToString));

        String countLongToString = String.valueOf(convert2);
        Long countLong = Long.valueOf(countLongToString);
        System.out.println(countLong.equals(countLongToString));

        String countBooleanToString = String.valueOf(convert3);
        Boolean countBoolean = Boolean.valueOf(countBooleanToString);
        System.out.println(countBoolean.equals(countBooleanToString));
    }
}
