package com.ruei;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class WinCanvas extends Canvas {
    List<Horse> horses = new ArrayList<Horse>();

    public WinCanvas() {

            Horse horse = new Horse(this);
            new Thread(horse).start();
            horses.add(horse);
        }


    @Override
    public void paint(Graphics g) {
        for (Horse horse : horses) {
            g.drawString("馬",horse.range, 150);
            g.drawString("馬",horse.range1, 200);
            g.drawString("馬",horse.range2, 250);

            if(horse.range == horse.end){
                g.drawString("win",50,150);

            }
            else if(horse.range1 == horse.end){
                g.drawString("win",50,200);

            }
            else if(horse.range2 == horse.end){
                g.drawString("win",50,250);

            }
        }
    }
}