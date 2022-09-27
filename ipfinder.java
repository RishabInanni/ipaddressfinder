package ipaddress;

import java.awt.BorderLayout;
import java.net.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.awt.event.ActionEvent;

public class ipfinder extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ipfinder frame = new ipfinder();
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
	public ipfinder() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 614, 599);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(23, 11, 545, 128);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("IPaddress Finder");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 30));
		lblNewLabel.setBounds(147, 38, 267, 67);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("FIND");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					InetAddress address= InetAddress.getLocalHost();
					String addressHost=address.getHostAddress();
					
					JOptionPane.showMessageDialog(btnNewButton, addressHost);
				} catch (UnknownHostException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				
			}
		}
		});
		
		;
		btnNewButton.setFont(new Font("Sylfaen", Font.BOLD, 29));
		btnNewButton.setBackground(new Color(240, 240, 240));
		btnNewButton.setBounds(238, 293, 133, 66);
		contentPane.add(btnNewButton);
	}
}
