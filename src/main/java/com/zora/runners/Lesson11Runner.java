package com.zora.runners;

import java.io.File;

/**
 * Created by Kateryna Zora  on 21.04.2017.
 */
public class Lesson11Runner {
    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        String osName = System.getProperty("os.name");
        String testProperties = "testdata.csv";
        String testTestdataWindowStyle = "src\\test\\resources\\testdata.csv";
        String testTestdataLinuxStyle = "src/test/resources/testdata.csv";


        System.out.println(currentDir);
        System.out.println(osName);

        if (osName.toLowerCase().contains("win")){ //not equals - находит схожесть последовательных слов
            File file = new File(currentDir, testTestdataWindowStyle); //"mac" "nix" "nux"
            System.out.println(file.getAbsolutePath());
        } else{
            File file = new File(currentDir, testTestdataLinuxStyle);
            System.out.println(file.getAbsolutePath());
        }

    }
}
