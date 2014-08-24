package net.hackforums.minesweeper;

import net.hackforums.minesweeper.impl.Container;
import net.hackforums.minesweeper.impl.GlobalVars;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    private JButton reset = new JButton("Reset Game");

    public Minesweeper() {
        super("Minesweeper!");
        setLayout(new BorderLayout());
        GlobalVars.container = new Container(14, 9, this);
        add(GlobalVars.container, BorderLayout.CENTER);
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reset(false);
            }
        });
        add(reset, BorderLayout.NORTH);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(new Dimension(900, 505));
        setPreferredSize(getSize());
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void reset(boolean lose) {
        if (lose)
            JOptionPane.showMessageDialog(null, "Game over!", "Minesweeper", JOptionPane.INFORMATION_MESSAGE);
        GlobalVars.container.reset(14, 9, this);
        GlobalVars.lives = 3;
        GlobalVars.points = 0;
    }

}
