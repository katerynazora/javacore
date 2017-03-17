package com.zora.app.practicehome;

/**
 * Created by Катерина on 16.03.2017.
 */
public class PracticeHome {
    public static void main (String[] args) {
        System.out.print("I Rule!!");
        System.out.print("The World");
    }
}

class IfTest {
    public static void main (String[] args) {
        int x = 3;
        if (x == 3) {
            System.out.println("x must be 3");
        }
        System.out.println("This runs no matter what");
    }
}

class IfTest2 {
    public static void main (String[] args) {
        int x = 2;
        if (x == 3) {
            System.out.println("x must be 3");
        } else {
            System.out.println("x is NOT 3");
        }
        System.out.println("This runs no matter what");
    }
}

class DrumKit {
    boolean topHat = true;
    boolean snare = true;

    void playTopHat() {
        System.out.println("ding ding da-ding");
    }

    void playSnare() {
        System.out.println("bang bang ba-bang");
    }
}
class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        d.playSnare();
        d.snare = false;
        d.playTopHat();

        if (d.snare == true) {
            d.playSnare();
        }
    }
}
