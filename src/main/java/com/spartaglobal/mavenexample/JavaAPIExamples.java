package com.spartaglobal.mavenexample;

import java.time.LocalDate;
import java.util.Timer;
import java.util.TimerTask;

public class JavaAPIExamples {

    public void mathExamples(){
        System.out.println(Math.sqrt(25));
    }
    public void dateTimer(){
        System.out.println(LocalDate.now());
        LocalDate localDate = LocalDate.of(1998, 04,23);
        System.out.println(localDate.getDayOfWeek());
    }

    public TimerTask timerTask(){
        return new TimerTask() {
            @Override
            public void run() {
                System.out.println("here's a rabbit");
            }
        };

    }

    public void timerExample(){
        Timer timer = new Timer();
//        timer.schedule(local);
    }
}
