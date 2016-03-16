package com.termit;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

public class SwingFrame extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingFrame frame = new SwingFrame();
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
	public SwingFrame() {
		setTitle("Woow! it's my first swing");
		setBounds(10, 10, 45, 30);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblTestLabel = new JLabel("Test Label, \u0431\u043B\u044F\u0434\u044C!");
		lblTestLabel.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblTestLabel, BorderLayout.CENTER);

	}

}
