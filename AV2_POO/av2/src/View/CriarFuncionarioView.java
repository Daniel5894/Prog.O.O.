package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ProdutoController;
import Controller.FuncionarioController;
import Model.Produto;
import Model.Funcionario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class CriarFuncionarioView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CriarFuncionarioView frame = new CriarFuncionarioView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void atualizar(JComboBox c) {
		ProdutoController controller = new ProdutoController();
		c.setModel(new JComboBox(controller.listar().toArray()).getModel());
	}
	
	
	/**
	 * Create the frame.
	 */
	public CriarFuncionarioView() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInserirFuncionario = new JLabel("Inserir Funcionário");
		lblInserirFuncionario.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblInserirFuncionario.setHorizontalAlignment(SwingConstants.CENTER);
		lblInserirFuncionario.setBounds(57, 11, 291, 14);
		contentPane.add(lblInserirFuncionario);
		
		textField = new JTextField();
		textField.setBounds(122, 60, 143, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCpf.setBounds(71, 63, 50, 14);
		contentPane.add(lblCpf);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNome.setBounds(71, 108, 50, 14);
		contentPane.add(lblNome);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(122, 105, 143, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(122, 150, 143, 20);
		contentPane.add(textField_2);
		
		
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmail.setBounds(71, 153, 50, 14);
		contentPane.add(lblEmail);
		
		JLabel lblProduto = new JLabel("Produto");
		lblProduto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblProduto.setBounds(57, 198, 63, 14);
		contentPane.add(lblProduto);
		
		JComboBox<Produto> comboBox = new JComboBox<Produto>();
		atualizar(comboBox);
		comboBox.setBounds(122, 195, 144, 20);
		contentPane.add(comboBox);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FuncionarioController controller = new FuncionarioController();
				Funcionario funcionario = new Funcionario(textField.getText(), textField_1.getText(), (Produto)comboBox.getSelectedItem(), textField_2.getText());
				controller.create(funcionario);
				JOptionPane.showMessageDialog(null, "Funcionário "+funcionario.getNome()+" criado com sucesso");
			}
		});
		btnInserir.setBounds(144, 246, 89, 23);
		contentPane.add(btnInserir);
	}
}
