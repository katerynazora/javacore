package com.zora.app.classwork.lesson10;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Kateryna Zora  on 11.04.2017.
 */
public class ClassWorkReader {
    public void setReaderText() {
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("D:\\new 1.txt")); // System.getProperty ("user.dir") Srting windowsStyle = "dir\\somefile.txt"
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            System.out.println("Regardless about exception you will see this text");
        }
    }
}
