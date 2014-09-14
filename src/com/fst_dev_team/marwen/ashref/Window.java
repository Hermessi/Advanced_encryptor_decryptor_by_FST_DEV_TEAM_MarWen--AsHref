package com.fst_dev_team.marwen.ashref;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.Insets;
import javax.swing.JRadioButton;
import java.awt.Button;
import javax.swing.JProgressBar;
import javax.swing.SpringLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;

public class Window extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	public Window() {
		setResizable(false);
		setTitle("Advanced Files Encryptor/Decryptor By FST_DEV_TEAM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 607, 341);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setMargin(new Insets(10, 10, 10, 0));
		menuBar.setBorderPainted(false);
		setJMenuBar(menuBar);
		
		JButton btnFile = new JButton("File");
		menuBar.add(btnFile);
		
		JButton btnAbout = new JButton("About");
		menuBar.add(btnAbout);
		
		JButton btnHelp = new JButton("Help");
		menuBar.add(btnHelp);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblChooseEncryptionType = new JLabel("Choose Encryption Type");
		lblChooseEncryptionType.setBounds(10, 10, 581, 22);
		lblChooseEncryptionType.setHorizontalAlignment(SwingConstants.CENTER);
		lblChooseEncryptionType.setFont(new Font("Meiryo UI", Font.BOLD | Font.ITALIC, 17));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("AES");
		rdbtnNewRadioButton.setBounds(20, 39, 70, 29);
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton.setSelected(true);
		
		JRadioButton rdbtnDes = new JRadioButton("DES");
		rdbtnDes.setBounds(92, 42, 70, 23);
		rdbtnDes.setHorizontalAlignment(SwingConstants.CENTER);
		
		JRadioButton rdbtnRc = new JRadioButton("RC6");
		rdbtnRc.setBounds(167, 42, 70, 23);
		rdbtnRc.setHorizontalAlignment(SwingConstants.CENTER);
		
		JRadioButton rdbtnMars = new JRadioButton("MARS");
		rdbtnMars.setBounds(239, 42, 80, 23);
		rdbtnMars.setHorizontalAlignment(SwingConstants.CENTER);
		
		JRadioButton rdbtnPoloalpha = new JRadioButton("POLIALPHA");
		rdbtnPoloalpha.setBounds(321, 42, 96, 23);
		rdbtnPoloalpha.setHorizontalAlignment(SwingConstants.CENTER);
		
		JRadioButton rdbtnPoligram = new JRadioButton("POLIGRAM");
		rdbtnPoligram.setBounds(419, 42, 96, 23);
		rdbtnPoligram.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblType = new JLabel("Encrypt/Decrypt Code :");
		lblType.setBounds(30, 75, 150, 22);
		lblType.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField = new JTextField();
		textField.setBounds(177, 76, 338, 20);
		textField.setColumns(10);
		
		JButton btnEncrypt = new JButton("ENCRYPT");
		btnEncrypt.setBounds(92, 154, 145, 39);
		btnEncrypt.setFont(new Font("Vijaya", Font.BOLD | Font.ITALIC, 21));
		
		JButton btnDecrypt = new JButton("DECRYPT");
		btnDecrypt.setBounds(394, 154, 145, 39);
		btnDecrypt.setFont(new Font("Vijaya", Font.BOLD | Font.ITALIC, 21));
		
		JLabel lblEncryptdecryptProgress = new JLabel("Enc/Dec progress :");
		lblEncryptdecryptProgress.setFont(new Font("Calibri Light", Font.BOLD | Font.ITALIC, 12));
		lblEncryptdecryptProgress.setHorizontalAlignment(SwingConstants.CENTER);
		lblEncryptdecryptProgress.setBounds(20, 234, 118, 37);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setValue(50);
		progressBar.setStringPainted(true);
		progressBar.setForeground(new Color(51, 153, 255));
		progressBar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		progressBar.setBounds(148, 246, 391, 14);
		contentPane.setLayout(null);
		contentPane.add(lblChooseEncryptionType);
		contentPane.add(rdbtnNewRadioButton);
		contentPane.add(rdbtnDes);
		contentPane.add(rdbtnRc);
		contentPane.add(rdbtnMars);
		contentPane.add(rdbtnPoloalpha);
		contentPane.add(rdbtnPoligram);
		contentPane.add(lblType);
		contentPane.add(textField);
		contentPane.add(btnEncrypt);
		contentPane.add(btnDecrypt);
		contentPane.add(lblEncryptdecryptProgress);
		contentPane.add(progressBar);
	}
}
