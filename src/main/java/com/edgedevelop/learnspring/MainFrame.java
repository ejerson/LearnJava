package com.edgedevelop.learnspring;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    // Stores the arguments passed to the main method
    private String[] args;
    JTextField tf;

    public MainFrame(String title) {
        super();

        Color color = Color.BLACK;
        setTitle(title);
        setSize(640,480);
        setBackground(color);

        tf = new JTextField(10);
        this.add(tf);

    }

    // sets the args instance variable
    public void setArgs(String[] args) {
        this.args = args;
    }

    // initializes the MainFrame JFrame instance
    public void init() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

}
