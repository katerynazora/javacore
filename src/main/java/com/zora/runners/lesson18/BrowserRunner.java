package com.zora.runners.lesson18;

import com.zora.app.classwork.lesson18.Browser;

/**
 * Created by Kateryna Zora  on 23.05.2017.
 */
public class BrowserRunner {
    public static void main(String[] args) {
        Browser browser = new Browser();
        browser.invoke("Chrome");
        browser.invoke("Chrome", 45);
    }
}
