package com.zora.app.classwork.lesson11;

/**
 * Created by Kateryna Zora  on 21.04.2017.
 */
public class Bicycle {
        public String color;
        public String wheelSize;
        public int speed;
        public int price;

        public Bicycle (){ // не использовать подобный тип
            color = "red";
        }
      /*  public Bicycle (String colorBicycle){ // конструктор. компилятор на равное количество параметров и типизацию- выдает ошибку( можно использовать разные типы int)
            color = colorBicycle;
        }
        public Bicycle (String colorBicycle, String wheelSizeBicycle){
            color = colorBicycle;
            wheelSize = wheelSizeBicycle; */

        public Bicycle(String color, int speed){
        this.color = color;
        this.speed = speed;
        }

        public Bicycle (String color, int speed, String wheelSize) {
            this(color, speed);
            this.wheelSize = wheelSize;
        }
        public Bicycle (String color, int speed, String wheelSize, int price){
            this(color, speed, wheelSize);
            this.price = price;
        }
}
