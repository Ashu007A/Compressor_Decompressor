/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import comp_decomp.compressor;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class AppFrame extends JFrame implements ActionListener {
    JButton compressBtn;
    JButton decompressBtn;
    
    AppFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.setLayout(null);
        compressBtn = new JButton("Select file to compress");
        compressBtn.setBounds(90, 40, 200, 30);
        compressBtn.addActionListener(this);
        compressBtn.setBackground(Color.red);
        compressBtn.setForeground(Color.black);
        
        decompressBtn = new JButton("Select file to decompress");
        decompressBtn.setBounds(90, 90, 200, 30);
        decompressBtn.addActionListener(this);
        decompressBtn.setBackground(Color.green);
        decompressBtn.setForeground(Color.black);
        
        this.add(compressBtn);
        this.add(decompressBtn);
        this.setBackground(Color.white);
        this.setForeground(Color.black);
        this.setSize(400, 200);
        this.getContentPane().setBackground(Color.black);
        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == compressBtn) {
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showSaveDialog(null);
            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.print(file);
                try {
                    compressor.method(file);
                }
                catch (Exception ee) {
                    JOptionPane.showMessageDialog(null, ee.toString());
                }
            }
        }
        
        if (e.getSource() == decompressBtn) {
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showSaveDialog(null);
            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.print(file);
                try {
                    compressor.method(file);
                }
                catch (Exception ee) {
                    JOptionPane.showMessageDialog(null, ee.toString());
                }
            }
        }
    }
}


