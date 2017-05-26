package com.zora.runners.lesson17;

import com.zora.app.classwork.lesson17.Company;

/**
 * Created by Kateryna Zora  on 16.05.2017.
 */
public class CompanyRunner {
    public static void main(String[] args) {
        for (Company cName : Company.values()){
            System.out.println("Company Value: " + cName.getValue() + " - Company Name: " + cName.name());
        }
    }
}
