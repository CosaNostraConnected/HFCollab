package net.hackforums.minesweeper.impl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zakary on 8/24/2014.
 *
 * The game container, cba to java doc this. If you don't understand it, just close your IDE right now pls.
 */
public class Container extends JPanel {

    private List<Section> sections;

    public Container(int width, int height) {

        sections = new ArrayList<>();


        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                sections.add(new Section(x, y));
            }
        }

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                for (Section section : sections) {
                    if (section.contains(e.getPoint())) {
                        section.open();
                        repaint();
                    }
                }
            }
        });

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Section s : sections) {
            if (s.isOpened()) {
                if (s.isBomb()) {
                    g.setColor(Color.RED);
                } else
                    g.setColor(Color.GREEN);
            } else {
                g.setColor(Color.LIGHT_GRAY);
            }
            g.fillRect(s.getX() * 50, s.getY() * 50, 50, 50);

            g.setColor(Color.BLACK);
            if (s.isOpened()) {
                if (s.isBomb()) {
                    g.drawString("Bomb!", (s.getX()*50) + 5, (s.getY()*50) + 25);
                } else {
                    g.drawString("+" + s.getPoints(), (s.getX()*50) + 5, (s.getY()*50) + 25);
                }
            }
            g.drawRect(s.getX() * 50, s.getY() * 50, 50, 50);
        }

    }

}
