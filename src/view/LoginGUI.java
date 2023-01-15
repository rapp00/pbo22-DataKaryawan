package view;
import Controller.Allobject;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginGUI {
    JFrame LogReg = new JFrame();
    JLabel login, top;
    JTextField textkodeadminlogin;
    JLabel labelkodeadminlogin, labelpasswordlogin;
    JButton masuk,exit;
    JPasswordField passwordlogin;

    public LoginGUI() {

        LogReg.setSize(450, 500);
        LogReg.setLayout(null);
        LogReg.getContentPane().setBackground(Color.lightGray);
        top = new JLabel("  FORM LOGIN");
        top.setBounds(70, 100, 300, 50);
        top.setFont(new Font("Consolas", Font.BOLD, 40));
        LogReg.add(top);

        labelkodeadminlogin = new JLabel("USERNAME");
        labelkodeadminlogin.setBounds(100, 188, 200, 30);
        labelkodeadminlogin.setFont(new Font("Consolas", Font.BOLD, 20));
        LogReg.add(labelkodeadminlogin);

        textkodeadminlogin = new JTextField();
        textkodeadminlogin.setBounds(55, 210, 200, 30);
        LogReg.add(textkodeadminlogin);

        labelpasswordlogin = new JLabel("PASSWORD");
        labelpasswordlogin.setBounds(100, 255, 200, 30);
        labelpasswordlogin.setFont(new Font("Consolas", Font.BOLD, 20));
        LogReg.add(labelpasswordlogin);

        passwordlogin = new JPasswordField();
        passwordlogin.setBounds(55, 279, 200, 30);
        LogReg.add(passwordlogin);

        masuk = new JButton("Login");
        masuk.setBounds(300, 250, 80, 30);
        masuk.setBackground(Color.RED);
        LogReg.add(masuk);

        LogReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LogReg.setVisible(true);
        LogReg.setLocationRelativeTo(null);


        masuk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Allobjcontrl.admin.dataAdmin();
                    Allobjcontrl.admin.login(textkodeadminlogin.getText(), passwordlogin.getText());
                    String nama = Allobjcontrl.admin.adminEntity().getNama();
                    JOptionPane.showMessageDialog(null, "selamat datang " + nama, "information", JOptionPane.INFORMATION_MESSAGE);
                   KaryawanGUI krywngui =new KaryawanGUI();
                    LogReg.dispose();
                } catch (Exception exception) {
                    kosong();
                }
            }
        });
    }

    void kosong() {

        textkodeadminlogin.setText(null);
        passwordlogin.setText(null);
    }

}
