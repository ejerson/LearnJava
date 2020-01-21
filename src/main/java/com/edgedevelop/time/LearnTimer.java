package com.edgedevelop.time;

import java.util.Timer;
import java.util.TimerTask;

public class LearnTimer extends TimerTask{

    public static void main(String[] args) {

        Timer timer = new Timer();
        TimerTask task = new LearnTimer();

        timer.schedule(task, 1000, 1000);


    }


        public static int i = 0;

        public void run() {
        System.out.println("Timer is running: " + ++i);
    }



}
