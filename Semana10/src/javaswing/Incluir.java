package javaswing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Incluir extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Incluir frame = new Incluir();
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
	public Incluir() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMatrcula = new JLabel("Matr\u00EDcula :");
		lblMatrcula.setBounds(24, 77, 59, 14);
		contentPane.add(lblMatrcula);
		
		JLabel lblNome = new JLabel("Nome :");
		lblNome.setBounds(24, 115, 46, 14);
		contentPane.add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(88, 74, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(88, 112, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnIncluir = new JButton("Incluir");
		btnIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{

			}
		});
		btnIncluir.setBounds(40, 175, 89, 23);
		contentPane.add(btnIncluir);
	}

}
