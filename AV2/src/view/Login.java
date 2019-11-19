package view;

import java.awt.BorderLayout;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc.ConnectionFactory;
import model.Estoquista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

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
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLogin = new JButton("Logar");
		btnLogin.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) 
			{
				
				//metodo autenticar passa user e senha
				//
				
				/*if(Estoquista.login.getText().equals(getLogin)&&
						senha.getText().equals(getSenha))
				{
					System.out.println("Logado!");
				}
				else
				{
					System.out.println("Erro ao digitar usuário e/ou senha!");
				}*/
			}
		});
		btnLogin.setBounds(162, 182, 89, 23);
		contentPane.add(btnLogin);
		
		JLabel lblNewLabel = new JLabel("Login :");
		lblNewLabel.setBounds(24, 104, 46, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblSenha = new JLabel("Senha :");
		lblSenha.setBounds(193, 104, 46, 28);
		contentPane.add(lblSenha);
		
		JLabel lblSistema = new JLabel("Tela de Login");
		lblSistema.setBounds(160, 23, 79, 23);
		contentPane.add(lblSistema);
		
		textField = new JTextField();
		textField.setBounds(64, 108, 105, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(242, 108, 105, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
