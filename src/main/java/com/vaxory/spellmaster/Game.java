package com.vaxory.spellmaster;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.io.IOException;

public class Game extends JFrame {
    Canvas canvas = new Canvas();

    public Game() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setBounds(0, 0, 1000, 800);
        add(canvas);
        setVisible(true);
        canvas.createBufferStrategy(2);
        BufferStrategy bufferStrategy = canvas.getBufferStrategy();

        while (true) {
            bufferStrategy = canvas.getBufferStrategy();
            Graphics graphics = bufferStrategy.getDrawGraphics();
            super.paint(graphics);
            graphics.setColor(Color.RED);
            graphics.fillRect(100, 100, 100, 100);
            bufferStrategy.show();
        }

    }



}
