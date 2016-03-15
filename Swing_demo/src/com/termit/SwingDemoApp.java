package com.termit;

//import java.awt.EventQueue;
import javax.swing.*;

@SuppressWarnings("serial")
public class SwingDemoApp extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					/*SwingDemoApp frame =*/ new SwingDemoApp();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SwingDemoApp() {
		JFrame jfrm = new JFrame("A Simple Swing Application");
		this.setBounds(100, 100, 450, 300);
		this.setVisible(true);
		jfrm.setSize(400, 250);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setVisible(true);
	}

}
