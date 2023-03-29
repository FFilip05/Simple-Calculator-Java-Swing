package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Calculator extends JFrame implements ActionListener {

    String number1 = "";
    String action = "";
    String number2 = "";
    JLabel label = new JLabel();
    JButton buttonDOT = new JButton(".");
    JButton buttonEQUALS = new JButton("=");
    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton buttonC = new JButton("C");
    JButton buttonOFF = new JButton("OFF");
    JButton buttonSR = new JButton("SR");
    JButton buttonPR = new JButton("%");
    JButton buttonMRC = new JButton("MRC");
    JButton buttonMM = new JButton("M-");
    JButton buttonMP = new JButton("M+");
    JButton buttonD = new JButton("/");
    JButton buttonM = new JButton("*");
    JButton buttonA = new JButton("+");
    JButton buttonS = new JButton("-");


    public Calculator() {
        setTitle("Prosty Kalkulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 800);
        setVisible(true);
        buttonDOT.setActionCommand(".");
        buttonDOT.addActionListener(this);
        buttonEQUALS.setActionCommand("=");
        buttonEQUALS.addActionListener(this);
        buttonEQUALS.setEnabled(false);
        button0.setActionCommand("0");
        button0.addActionListener(this);
        button1.setActionCommand("1");
        button1.addActionListener(this);
        button2.setActionCommand("2");
        button2.addActionListener(this);
        button3.setActionCommand("3");
        button3.addActionListener(this);
        button4.setActionCommand("4");
        button4.addActionListener(this);
        button5.setActionCommand("5");
        button5.addActionListener(this);
        button6.setActionCommand("6");
        button6.addActionListener(this);
        button7.setActionCommand("7");
        button7.addActionListener(this);
        button8.setActionCommand("8");
        button8.addActionListener(this);
        button9.setActionCommand("9");
        button9.addActionListener(this);
        buttonC.setActionCommand("C");
        buttonC.addActionListener(this);
        buttonOFF.setActionCommand("OFF");
        buttonOFF.addActionListener(this);
        buttonSR.setActionCommand("SR");
        buttonSR.addActionListener(this);
        buttonPR.setActionCommand("%");
        buttonPR.addActionListener(this);
        buttonMRC.setActionCommand("MRC");
        buttonMRC.addActionListener(this);
        buttonMM.setActionCommand("M-");
        buttonMM.addActionListener(this);
        buttonMP.setActionCommand("M+");
        buttonMP.addActionListener(this);
        buttonD.setActionCommand("/");
        buttonD.addActionListener(this);
        buttonM.setActionCommand("*");
        buttonM.addActionListener(this);
        buttonA.setActionCommand("+");
        buttonA.addActionListener(this);
        buttonS.setActionCommand("-");
        buttonS.addActionListener(this);
//        add(label);
        JPanel panel = new JPanel(new GridLayout(7, 4));
        panel.add(label);
        panel.add(buttonC);
        panel.add(buttonOFF);
        panel.add(buttonSR);
        panel.add(buttonPR);
        panel.add(buttonMRC);
        panel.add(buttonMM);
        panel.add(buttonMP);
        panel.add(buttonD);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(buttonM);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(buttonS);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(buttonA);
        panel.add(button0);
        panel.add(buttonDOT);
        panel.add(buttonEQUALS);
        add(panel);
    }

    public String calculate(String n1, String n2, String action) {
        String result = "";
        switch (action) {
            case "+": {
                result = String.valueOf(Integer.parseInt(n1) + Integer.parseInt(n2));
            }
            case "-": {
                result = String.valueOf(Integer.parseInt(n1) - Integer.parseInt(n2));
            }
            case "*": {
                result = String.valueOf(Integer.parseInt(n1) * Integer.parseInt(n2));
            }
            case "/": {
                result = String.valueOf(Integer.parseInt(n1) / Integer.parseInt(n2));
            }
//            case "SR": {
//                result = String.valueOf(Integer.parseInt(n1) / Integer.parseInt(n2));
//            }

        }

        return result;
    }

    public void actionPerformed(ActionEvent e) {
        if (".".equals(e.getActionCommand())) {
            if (number1.isEmpty() || action.isEmpty()) {
                number1 += e.getActionCommand();
                label.setText(label.getText()+number1);

            } else {
                number2 += e.getActionCommand();
            }
        }
        if ("=".equals(e.getActionCommand())) {
            label.setText(number1 + " " + action + " " + number2 + " = " + calculate(number1, number2, action));
            System.out.println(label.getText());
            buttonEQUALS.setEnabled(true);

        }
        if ("0".equals(e.getActionCommand())) {
            if (number1.isEmpty() || action.isEmpty()) {
                number1 += e.getActionCommand();
                label.setText(label.getText()+number1);

            } else {
                number2 += e.getActionCommand();
                label.setText(label.getText()+number2);
            }
        }
        if ("1".equals(e.getActionCommand())) {
            if (number1.isEmpty() || action.isEmpty()) {
                number1 += e.getActionCommand();
                label.setText(label.getText()+number1);

            } else {
                number2 += e.getActionCommand();
                label.setText(label.getText()+number2);
            }
        }
        if ("2".equals(e.getActionCommand())) {
            if (number1.isEmpty() || action.isEmpty()) {
                number1 += e.getActionCommand();
                label.setText(label.getText()+number1);
            } else {
                number2 += e.getActionCommand();
                label.setText(label.getText()+number2);
            }
        }
        if ("3".equals(e.getActionCommand())) {
            if (number1.isEmpty() || action.isEmpty()) {
                number1 += e.getActionCommand();
                label.setText(label.getText()+number1);

            } else {
                number2 += e.getActionCommand();
                label.setText(label.getText()+number2);
            }
        }
        if ("4".equals(e.getActionCommand())) {
            if (number1.isEmpty() || action.isEmpty()) {
                number1 += e.getActionCommand();
                label.setText(label.getText()+number1);

            } else {
                number2 += e.getActionCommand();
                label.setText(label.getText()+number2);
            }
        }
        if ("5".equals(e.getActionCommand())) {
            if (number1.isEmpty() || action.isEmpty()) {
                number1 += e.getActionCommand();
                label.setText(label.getText()+number1);

            } else {
                number2 += e.getActionCommand();
                label.setText(label.getText()+number2);
            }
        }
        if ("6".equals(e.getActionCommand())) {
            if (number1.isEmpty() || action.isEmpty()) {
                number1 += e.getActionCommand();
                label.setText(label.getText()+number1);

            } else {
                number2 += e.getActionCommand();
                label.setText(label.getText()+number2);
            }
        }
        if ("7".equals(e.getActionCommand())) {
            if (number1.isEmpty() || action.isEmpty()) {
                number1 += e.getActionCommand();
                label.setText(label.getText()+number1);

            } else {
                number2 += e.getActionCommand();
                label.setText(label.getText()+number2);
            }
        }
        if ("8".equals(e.getActionCommand())) {
            if (number1.isEmpty() || action.isEmpty()) {
                number1 += e.getActionCommand();
                label.setText(label.getText()+number1);

            } else {
                number2 += e.getActionCommand();
                label.setText(label.getText()+number2);
            }
        }
        if ("9".equals(e.getActionCommand())) {
            if (number1.isEmpty() || action.isEmpty()) {
                number1 += e.getActionCommand();
                label.setText(label.getText()+number1);

            } else {
                number2 += e.getActionCommand();
                label.setText(label.getText()+number2);

            }
        }
        if ("C".equals(e.getActionCommand())) {
            label.setText("");
            number1 ="";
            number2 ="";
            action = "";
        }
        if ("OFF".equals(e.getActionCommand())) {

        }
        if ("SR".equals(e.getActionCommand())) {
            action = e.getActionCommand();

        }
        if ("%".equals(e.getActionCommand())) {
            action = e.getActionCommand();

        }
        if ("MRC".equals(e.getActionCommand())) {

        }
        if ("M-".equals(e.getActionCommand())) {

        }
        if ("M+".equals(e.getActionCommand())) {

        }
        if ("/".equals(e.getActionCommand())) {
            action = e.getActionCommand();
            label.setText(label.getText()+e.getActionCommand());
        }
        if ("*".equals(e.getActionCommand())) {
            action = e.getActionCommand();
            label.setText(label.getText()+e.getActionCommand());
        }
        if ("+".equals(e.getActionCommand())) {
            action = e.getActionCommand();
            label.setText(label.getText()+e.getActionCommand());
        }
        if ("-".equals(e.getActionCommand())) {
            action = e.getActionCommand();
            label.setText(label.getText()+e.getActionCommand());
        }
        if (!number1.isEmpty() && !number2.isEmpty() && !action.isEmpty()) {
            buttonEQUALS.setEnabled(true);
        }
        System.out.println("n1 " + number1 + " n2 " + number2 + " action " + action);

    }

}
