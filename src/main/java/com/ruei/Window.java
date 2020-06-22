package com.ruei;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public Window() {
        setSize(600, 400);
        WinCanvas canvas = new WinCanvas();
        add(canvas);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }


    public static void main(String[] args) {new Window();}
}
