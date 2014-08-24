package net.hackforums.minesweeper.impl;

import net.hackforums.minesweeper.Minesweeper;

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

    private ArrayList<Section> sections;
    private Image heart;

    public void reset(int width, int height, Minesweeper game) {
        sections.clear();
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                sections.add(new Section(x, y, game));
            }
        }
    }

    public Container(int width, int height, Minesweeper game) {

        sections = new ArrayList<>();
        heart = new ImageIcon(getClass().getResource("heart-icon.png")).getImage();


        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                sections.add(new Section(x, y, game));
            }
        }

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                for (Section section : sections) {
                    if (section.contains(e.getPoint())) {
                        section.open(sections, true);
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
                    if (s.containsHeart()) {
                        g.drawImage(heart, (s.getX() * 50) + 5, (s.getY()*50) + 35, null);
                    }
                }
            }
            g.drawRect(s.getX() * 50, s.getY() * 50, 50, 50);
        }
        int x = getWidth() - 30;
        for (int i = 0; i < GlobalVars.lives; i++) {
            g.drawImage(heart, x - (i * 20), 20, null);
        }
        g.setColor(Color.BLACK);
        g.drawString("Points: " + GlobalVars.points, x - 100, 50);
    }

}
