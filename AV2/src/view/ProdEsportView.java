package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class ProdEsportView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProdEsportView frame = new ProdEsportView();
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
	public ProdEsportView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBemvindoAoSistema = new JLabel("Bem-vindo ao Sistema da Lasalle Sports");
		lblBemvindoAoSistema.setBounds(120, 11, 198, 14);
		contentPane.add(lblBemvindoAoSistema);
		
		JLabel lblOQueVoc = new JLabel("O que voc\u00EA deseja fazer?");
		lblOQueVoc.setBounds(149, 66, 123, 14);
		contentPane.add(lblOQueVoc);
		
		JButton btnIncluir = new JButton("Incluir");
		btnIncluir.setBounds(107, 110, 89, 23);
		contentPane.add(btnIncluir);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(229, 110, 89, 23);
		contentPane.add(btnExcluir);
		
		JButton btnNewButton = new JButton("Alterar");
		btnNewButton.setBounds(107, 162, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Listar");
		btnNewButton_1.setBounds(229, 162, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnCadastroDeFuncionrio = new JButton("Cadastro de Funcion\u00E1rio");
		btnCadastroDeFuncionrio.setBounds(47, 227, 152, 23);
		contentPane.add(btnCadastroDeFuncionrio);
		
		JButton btnCadastroDeEstoquista = new JButton("Cadastro de Estoquista");
		btnCadastroDeEstoquista.setBounds(229, 227, 152, 23);
		contentPane.add(btnCadastroDeEstoquista);
	}

}
