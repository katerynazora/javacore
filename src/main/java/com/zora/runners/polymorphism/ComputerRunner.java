package com.zora.runners.polymorphism;

import com.zora.app.polymorphism.*;


/**
 * Created by Kateryna Zora  on 28.04.2017.
 */
public class ComputerRunner {
    public static void main(String[] args) {
//        IBM ibm = new IBM();
//        ibm.changeOnlyForIBM();
        Computer ibmComputer = new IBM();
        Computer hpComputer = new HP();
        Computer acerComputer = new ACER();
        Computer mac = new MAC();
        Computer lenovo = new LENOVO();
        Computer dell = new DELL();

//        changeForComputers(ibmComputer);
//        changeForComputers(hpComputer);
//        changeForComputers(acerComputer);
//        changeForComputers(mac);

        Computer [] computers = new Computer[6];
        computers[0] = ibmComputer;
        computers[1] = hpComputer;
        computers[2] = acerComputer;
        computers[3] = mac;
        computers[4] = lenovo;
        computers[5] = dell;
        changeForComputersArray(computers);


    }
    public static void changeForComputers(Computer computer){
        computer.changeRAM();
        computer.changeTOSSD();
        computer.changeCPU();
    }

    public static void changeForComputersArray(Computer[] computers){
        for (Computer computer: computers) {
            changeForComputers(computer);
//            computer.changeRAM();
//            computer.changeTOSSD();
        }
    }
}
