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

public class Tela1 extends JFrame {

	private JPanel contentPane;
	private JTextField usuario;
	private JTextField senha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela1 frame = new Tela1();
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
	public Tela1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio:");
		lblUsurio.setBounds(22, 89, 55, 14);
		contentPane.add(lblUsurio);
		
		usuario = new JTextField();
		usuario.setBounds(78, 86, 86, 20);
		contentPane.add(usuario);
		usuario.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(22, 131, 46, 14);
		contentPane.add(lblSenha);
		
		senha = new JTextField();
		senha.setBounds(78, 128, 86, 20);
		contentPane.add(senha);
		senha.setColumns(10);
		
		JButton logar = new JButton("Logar");
		logar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(usuario.getText().equals("Daniel")&&
						senha.getText().equals("1234"))
				{
					System.out.println("Logado!");
				}
				else
				{
					System.out.println("Erro ao digitar usuário e/ou senha!");
				}
			}
		});
		logar.setBounds(61, 177, 89, 23);
		contentPane.add(logar);
		
		JLabel lblTelaDeLogin = new JLabel("Tela de Login");
		lblTelaDeLogin.setBounds(150, 33, 96, 14);
		contentPane.add(lblTelaDeLogin);
	}
}
