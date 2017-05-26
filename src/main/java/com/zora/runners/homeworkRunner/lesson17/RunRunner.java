package com.zora.runners.homeworkRunner.lesson17;

import com.zora.app.homework.lesson17.interfaces.*;

/**
 * Created by Kateryna Zora  on 23.05.2017.
 */
public class RunRunner {
    public static void main(String[] args) {
        Run tractor = new WheeledTractor("Branson 8050C", 78, 2, 4, 3586);
        tractor.nameRun();
        tractor.speedRun();
        tractor.numberOfPeopleRun();
        tractor.numberOfWheelRun();
        tractor.weightRun();

        Run traktor2 = new CrawlerTractor("Challenger-MT 865",53,1,1,4000);
        traktor2.nameRun();
        traktor2.speedRun();
        traktor2.weightRun();
        traktor2.numberOfPeopleRun();
        traktor2.numberOfWheelRun();
    }
}
