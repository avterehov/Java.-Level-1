package ru.geekbrains.home_work_1_1_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyWindow extends JFrame {
    public MyWindow() {

        setTitle("My fist window in Java");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(200, 200, 400, 400);


        setLayout(new BorderLayout());
        JLabel label = new JLabel();
        label.setText("пока вы ничего не нажали");


        JButton[] jbs = new JButton[4];

        jbs[0] = new JButton("Север");
        jbs[1] = new JButton("Запад");
        jbs[2] = new JButton("Юг");
        jbs[3] = new JButton("Восток");

        add(jbs[0], BorderLayout.NORTH);
        add(jbs[1], BorderLayout.WEST);
        add(jbs[2], BorderLayout.SOUTH);
        add(jbs[3], BorderLayout.EAST);
        add(label, BorderLayout.CENTER);


    jbs[0].addActionListener(new ActionListener() {
        String buttonName = jbs[0].getText();
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("Вы нажали кнопку " + buttonName);
        }
    });


        jbs[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Вы нажали кнопку " + jbs[1].getText());
            }
        });
        jbs[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Вы нажали кнопку " + jbs[2].getText());
            }
        });
        jbs[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Вы нажали кнопку " + jbs[3].getText());
            }
        });

            setVisible(true);

        }
    }





   /* не получилось сделать цикл.

   for ( int i = 0; i < 4; i ++){
        jbs[i].addActionListener(new ActionListener() {
        String buttonName = jbs[i].getText();
@Override
public void actionPerformed(ActionEvent e) {
        label.setText("Вы нажали кнопку " + buttonName);
        }
        });
        }
*/
