/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TravelManagementSystem;

import javax.swing.*;
import java.awt.*;
 

public class Destinations extends JFrame implements Runnable {

    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10,l11 ;
//    JLabel label[] = new JLabel[]{i1,i2,i3,i4,i5,i6,i7,i8,i9,10};
    JLabel caption;
    Thread th;

    public void run() {
        
        try {

            l2.setVisible(true);

            Thread.sleep(2400);
            l2.setVisible(false);
            l3.setVisible(true);

            l3.setVisible(true);
            Thread.sleep(2400);
            l3.setVisible(false);
            l4.setVisible(true);

            Thread.sleep(2400);
            l4.setVisible(false);
            l5.setVisible(true);

            Thread.sleep(2400);
            l5.setVisible(false);
            l6.setVisible(true);

            Thread.sleep(2400);
            l6.setVisible(false);
            l7.setVisible(true);

            Thread.sleep(2400);
            l7.setVisible(false);
            l8.setVisible(true);

            Thread.sleep(2400);
            l8.setVisible(false);
            l9.setVisible(true);

            Thread.sleep(2400);
            l9.setVisible(false);
            l10.setVisible(true);

            Thread.sleep(2400);
            l10.setVisible(false);
            l11.setVisible(true);

            Thread.sleep(2400);
            l11.setVisible(false);

            this.setVisible(false);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public Destinations() {

        setBounds(300, 100, 800, 600);
        getContentPane().setBackground(new Color(220, 250, 250));

        

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dest1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l2 = new JLabel(i3);
        l2.setBounds(0, 0, 800, 600);
        add(l2);

        setLayout(null);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/dest2.png"));
        Image i5 = i4.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        l3 = new JLabel(i4);
        l3.setBounds(0, 0, 800, 600);
        add(l3);
        l3.setVisible(false);

        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icons/dest3.jpg"));
        Image i8 = i7.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        l4 = new JLabel(i9);
        l4.setBounds(0, 0, 800, 600);
        add(l4);
        l4.setVisible(false);

        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("icons/dest4.jpg"));
        Image i11 = i10.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        l5 = new JLabel(i12);
        l5.setBounds(0, 0, 800, 600);
        add(l5);
        l5.setVisible(false);

        ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("icons/dest5.jpg"));
        Image i14 = i13.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        l6 = new JLabel(i15);
        l6.setBounds(0, 0, 800, 600);
        add(l6);
        l6.setVisible(false);

        ImageIcon i16 = new ImageIcon(ClassLoader.getSystemResource("icons/dest6.jpg"));
        Image i17 = i16.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i18 = new ImageIcon(i17);
        l7 = new JLabel(i18);
        l7.setBounds(0, 0, 800, 600);
        add(l7);
        l7.setVisible(false);

        ImageIcon i19 = new ImageIcon(ClassLoader.getSystemResource("icons/dest7.jpeg"));
        Image i20 = i19.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i21 = new ImageIcon(i20);
        l8 = new JLabel(i21);
        l8.setBounds(0, 0, 800, 600);
        add(l8);
        l8.setVisible(false);

        ImageIcon i22 = new ImageIcon(ClassLoader.getSystemResource("icons/dest8.jpg"));
        Image i23 = i22.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i24 = new ImageIcon(i23);
        l9 = new JLabel(i24);
        l9.setBounds(0, 0, 800, 600);
        add(l9);
        l9.setVisible(false);

        ImageIcon i25 = new ImageIcon(ClassLoader.getSystemResource("icons/dest9.jpg"));
        Image i26 = i25.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i27 = new ImageIcon(i26);
        l10 = new JLabel(i27);
        l10.setBounds(0, 0, 800, 600);
        add(l10);
        l10.setVisible(false);

        ImageIcon i28 = new ImageIcon(ClassLoader.getSystemResource("icons/dest10.jpg"));
        Image i29 = i28.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i30 = new ImageIcon(i29);
        l11 = new JLabel(i30);
        l11.setBounds(0, 0, 800, 600);
        add(l11);
        l11.setVisible(false);

        th = new Thread(this);
        th.start();
        setVisible(true);
    }

    public static void main(String args[]) {
        new Destinations();

    }

}
