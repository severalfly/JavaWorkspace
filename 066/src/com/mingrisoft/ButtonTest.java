package com.mingrisoft;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class ButtonTest extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ButtonTest frame = new ButtonTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ButtonTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton redButton = new JButton("red");
		contentPane.add(redButton, BorderLayout.WEST);
		
		Dimension perferDimension = new Dimension(30, 50);
		JButton greenButton = new JButton("green");
		greenButton.setSize(perferDimension);
		contentPane.add(greenButton, BorderLayout.CENTER);
		
		
		JButton blueButton = new JButton("blue");
		contentPane.add(blueButton, BorderLayout.EAST);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
	}

}
