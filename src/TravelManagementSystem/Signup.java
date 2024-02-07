package TravelManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Signup extends JFrame implements ActionListener {

    JButton create, back;
    JTextField tfusername, tfname, tfpass, tfans;
    Choice security;

    Signup() {
        setBounds(350, 200, 900, 360);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(133, 193, 233));
        p1.setBounds(0, 0, 500, 400);
        p1.setLayout(null);
        add(p1);

        JLabel lblusername = new JLabel("Username");
        lblusername.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblusername.setBounds(50, 20, 125, 25);
        p1.add(lblusername);

        tfusername = new JTextField();
        tfusername.setBounds(180, 20, 180, 25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);

        JLabel lblname = new JLabel("Name");
        lblname.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblname.setBounds(50, 60, 125, 25);
        p1.add(lblname);

        tfname = new JTextField();
        tfname.setBounds(180, 60, 180, 25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);

        JLabel lblpass = new JLabel("Password");
        lblpass.setFont(new Font("Tahona", Font.BOLD, 14));
        lblpass.setBounds(50, 100, 125, 25);
        p1.add(lblpass);

        tfpass = new JTextField();
        tfpass.setBounds(180, 100, 180, 25);
        tfpass.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpass);

        JLabel lblsecurity = new JLabel("Security Ques...");
        lblsecurity.setFont(new Font("Tahona", Font.BOLD, 14));
        lblsecurity.setBounds(50, 140, 125, 25);
        p1.add(lblsecurity);

        security = new Choice();
        security.add("Fav Character From The Boys");
        security.add("Friends Series");
        security.add("Ninja Hatodi");
        security.add("Mirjapur");
        security.add("Gang Of Wasepur");
        security.setBounds(180, 140, 180, 25);
        p1.add(security);

        JLabel lblans = new JLabel("Answer");
        lblans.setFont(new Font("Tahona", Font.BOLD, 14));
        lblans.setBounds(50, 180, 125, 25);
        p1.add(lblans);

        tfans = new JTextField();
        tfans.setBounds(180, 180, 180, 25);
        tfans.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfans);

        create = new JButton("Create");
        create.setBackground(Color.WHITE);
        create.setForeground(new Color(133, 193, 233));
        create.setFont(new Font("Tahona", Font.BOLD, 14));
        create.setBounds(80, 250, 100, 30);
        create.addActionListener(this);
        p1.add(create);

        back = new JButton("Back");
        back.setBackground(Color.WHITE);
        back.setForeground(new Color(133, 193, 233));
        back.setFont(new Font("Tahona", Font.BOLD, 14));
        back.setBounds(250, 250, 100, 30);
        back.addActionListener(this);
        p1.add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(580, 50, 250, 250);
        add(image);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == create) {
            String username = tfusername.getText();
            String name = tfname.getText();
            String password = tfpass.getText();
            String question = security.getSelectedItem();
            String answer = tfans.getText();

            String query = "insert into account values('" + username + "','" + name + "', '" + password + "','" + question + "','" + answer + "')";
            try {
                if (username.equals("")) {
                    JOptionPane.showMessageDialog(null, "Userame is Required");
                } else if (name.equals("")) {
                    JOptionPane.showMessageDialog(null, "Name is Required");
                } else if (password.equals("")) {
                    JOptionPane.showMessageDialog(null, "Password is Required");
                } else if (answer.equals("")) {
                    JOptionPane.showMessageDialog(null, "Answer is Required");
                } else {
                    Conn conn = new Conn();
                    conn.s.executeUpdate(query);

                    JOptionPane.showMessageDialog(null, "Account Created Successfully");

                    setVisible(false);
                    new Login();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == back) {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String args[]) {
        // TODO code application logic here
        new Signup();
    }
}
