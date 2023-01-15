package view;
import Controller.Allobject;
import Controller.KaryawanController;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class KaryawanGUI {
    private static KaryawanController karyawan = new KaryawanController();
    JFrame LogReg = new JFrame();
    JLabel tambahkaryawan, top, admin;
    JTextField textkode,textnomor,textnomorr,textpilih,textbaru,textNama, textUmur, textalAmat;
    JLabel labelkode,labelnomor,labelnomorr, labelNama,labelumur,labelAlamat;
    JButton tambah, hapus ,edit, exit;
    JTable tabelkaryawan = new JTable();
    JScrollPane scrolladmin = new JScrollPane(tabelkaryawan);

    public KaryawanGUI(){
        LogReg.setSize(900, 600);
        LogReg.setLayout(null);
        LogReg.getContentPane().setBackground(Color.lightGray);
        top = new JLabel(" DAFTAR KARYAWAN");
        top.setBounds(260, 30, 500, 50);
        top.setFont(new Font("Consolas", Font.BOLD, 40));
        LogReg.add(top);

        scrolladmin.setBounds(270, 180,380,200);

//Daftar Karyawan
        tabelkaryawan.setModel(karyawan.daftarkaryawa());
        LogReg.add(scrolladmin);

        tambahkaryawan = new JLabel("Daftar Karyawan");
        tambahkaryawan.setFont(new Font("Consolas", Font.BOLD, 20));
        tambahkaryawan.setBounds(270, 110, 210, 100);
        LogReg.add(tambahkaryawan);

 //Edit Karyawan
        tambahkaryawan = new JLabel(" Menu Edit");
        tambahkaryawan.setFont(new Font("Consolas", Font.BOLD, 20));
        tambahkaryawan.setBounds(250, 370, 210, 100);
        LogReg.add(tambahkaryawan);

        labelnomorr = new JLabel(" No Yang Di Edit : ");
        labelnomorr.setBounds(260, 430, 200, 30);
        LogReg.add(labelnomorr);
        textnomorr = new JTextField();
        textnomorr.setBounds(260, 460, 200, 30);
        LogReg.add(textnomorr);

        labelnomorr = new JLabel(" Pilihan  Ingin Edit : ");
        labelnomorr.setBounds(520, 370, 200, 60);
        LogReg.add(labelnomorr);

        labelnomorr = new JLabel("1. NAMA ");
        labelnomorr.setBounds(520, 400, 200, 35);
        LogReg.add(labelnomorr);

        labelnomorr = new JLabel("2. UMUR ");
        labelnomorr.setBounds(520, 420, 200, 35);
        LogReg.add(labelnomorr);

        labelnomorr = new JLabel("3. ALAMAT ");
        labelnomorr.setBounds(520, 440, 200, 35);
        LogReg.add(labelnomorr);

        labelnomorr = new JLabel(" Pilihan Edit : ");
        labelnomorr.setBounds(670, 370, 200, 30);
        LogReg.add(labelnomorr);

        textpilih = new JTextField();
        textpilih.setBounds(670, 400, 200, 30);
        LogReg.add(textpilih);

        labelnomorr = new JLabel(" Masukkan Data Yang Baru :");
        labelnomorr.setBounds(670, 430, 200, 30);
        LogReg.add(labelnomorr);

        textbaru = new JTextField();
        textbaru.setBounds(670, 460, 200, 30);
        LogReg.add(textbaru);

        edit = new JButton("Edit");
        edit.setBounds(670, 510, 200, 30);
        edit.setBackground(Color.RED);
        LogReg.add(edit);

  //Hapus Karyawan
        tambahkaryawan = new JLabel(" Hapus No : ");
        tambahkaryawan.setFont(new Font("Consolas", Font.BOLD, 20));
        tambahkaryawan.setBounds(670, 210, 210, 100);
        LogReg.add(tambahkaryawan);

        textnomor = new JTextField();
        textnomor.setBounds(670, 280, 200, 30);
        LogReg.add(textnomor);

        hapus = new JButton("Hapus");
        hapus.setBounds(670, 320, 200, 30);
        hapus.setBackground(Color.RED);
        LogReg.add(hapus);

        exit = new JButton("Keluar");
        exit.setBounds(260, 510, 200, 30);
        exit.setBackground(Color.RED);
        LogReg.add(exit);

//Tambah Karyawan
        tambahkaryawan = new JLabel("Tambah Karyawan");
        tambahkaryawan.setFont(new Font("Consolas", Font.BOLD, 20));
        tambahkaryawan.setBounds(30, 110, 210, 100);
        LogReg.add(tambahkaryawan);

        labelkode = new JLabel("Nama");
        labelkode.setBounds(30, 170, 200, 30);
        LogReg.add(labelkode);
        textNama = new JTextField();
        textNama.setBounds(30, 200, 200, 30);
        LogReg.add(textNama);

        labelumur= new JLabel("Umur");
        labelumur.setBounds(30, 230, 200, 30);
        LogReg.add(labelumur);
        textUmur = new JTextField();
        textUmur.setBounds(30, 260, 200, 30);
        LogReg.add(textUmur);

        labelAlamat = new JLabel("Alamat");
        labelAlamat.setBounds(30, 290, 200, 30);
        LogReg.add(labelAlamat);
        textalAmat = new JTextField();
        textalAmat.setBounds(30,330,200,30);
        LogReg.add(textalAmat);

        tambah = new JButton("Tambah");
        tambah.setBounds(30, 390, 100, 30);
        tambah.setBackground(Color.RED);
        LogReg.add(tambah);

        LogReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LogReg.setVisible(true);
        LogReg.setLocationRelativeTo(null);

        tambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    String Nama = textNama.getText();
                    String Umur = textUmur.getText();
                    String Alamat = textalAmat.getText();
                    Allobjcontrl.karyawan.tambahkaryawan(Nama, Umur, Alamat);
                    tabelkaryawan.setModel(karyawan.daftarkaryawa());
                    tabelkaryawan.setBackground(Color.PINK);
                    tabelkaryawan.setForeground(Color.BLACK);

                    JOptionPane.showMessageDialog(null, "Data Telah Ditambahkan", "Information", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Penulisan Salah", "Information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        edit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String Nama = textbaru.getText();
                    String Umur = textbaru.getText();
                    String Alamat = textbaru.getText();
                    int nomorr = Integer.parseInt(textnomorr.getText());
                    String data = textbaru.getText();
                    int pilih = Integer.parseInt(textpilih.getText());
                    switch (pilih) {
                        case 1:
                            Allobjcontrl.karyawan.editkaryawan(nomorr, 1, data);
                            break;
                        case 2:
                            Allobjcontrl.karyawan.editkaryawan(nomorr, 2, data);
                            break;
                        case 3:
                            Allobjcontrl.karyawan.editkaryawan(nomorr, 3, data);
                            break;
                        default:
                    }
                    JOptionPane.showMessageDialog(null, " Data Berhasil Diedit ", "information", JOptionPane.INFORMATION_MESSAGE);

                    KaryawanGUI krywngui = new KaryawanGUI();
                    LogReg.dispose();
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null,"Tidak ada", "Information", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                }
            }
        });
        hapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int nomor = Integer.parseInt(textnomor.getText());
                    Allobjcontrl.karyawan.hapusKaryawan(nomor);

                    JOptionPane.showMessageDialog(null, " Data Berhasil Dihapus ", "information", JOptionPane.INFORMATION_MESSAGE);

                    KaryawanGUI krywngui = new KaryawanGUI();
                    LogReg.dispose();
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(
                            null, " Tidak Ada", "information", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                }
            }
        });
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LogReg.dispose();
            }
        });
        }
        void kosong(){
        textNama.setText(null);
        textUmur.setText(null);
        textalAmat.setText(null);
        }

}
