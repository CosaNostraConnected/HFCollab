package net.hackforums.minesweeper;

import net.hackforums.minesweeper.impl.Container;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Zakary on 8/24/2014.
 *
 * I got really bored and couldn't think of anything else. Feel free to improve on it as I haven't
 * finished it yet. I'll work on it when I get bored again, but for now, time for more LoL.
 *
 */
public class Minesweeper extends JFrame {

    public static void main(String... args) {
        new Minesweeper();
    }

    public Minesweeper() {
        super("Minesweeper!");
        setLayout(new BorderLayout());
        add(new Container(15, 9), BorderLayout.CENTER);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(new Dimension(770, 490));
        setPreferredSize(getSize());
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

}
