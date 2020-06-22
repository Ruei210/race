package com.ruei;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Horse extends Thread {
    Random random = new Random();
    static int rank = 1;
    int range2 = 50;
    int range1 = 50;
    int range = 50;
    int end = 500;
    int speed;
    int speed1;
    int speed2;
    int sleep;
    int sleep1;
    int sleep2;
    int totalSleep;
    WinCanvas parent;

    public Horse(WinCanvas parent) {
        this.parent = parent;
    }

    public void run() {
        while (range < end && range1 < end && range2 < end) {
            int speed = (int) (Math.random() * 30);
            range += speed;
            parent.repaint();


            int speed1 = (int) (Math.random() * 30);
            range1 += speed1;
            parent.repaint();


            int speed2 = (int) (Math.random() * 30);
            range2 += speed2;
            parent.repaint();

            try {
                sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}