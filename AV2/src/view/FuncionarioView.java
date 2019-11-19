package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

public class FuncionarioView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FuncionarioView frame = new FuncionarioView();
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
	public FuncionarioView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Incluir");
		btnNewButton.setBounds(84, 118, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Alterar");
		btnNewButton_1.setBounds(84, 171, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Listar");
		btnNewButton_2.setBounds(228, 171, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Excluir");
		btnNewButton_3.setBounds(228, 118, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblFuncionrio = new JLabel("Funcion\u00E1rios");
		lblFuncionrio.setBounds(165, 27, 65, 14);
		contentPane.add(lblFuncionrio);
		
		JLabel lblQueAoVoc = new JLabel("Que a\u00E7\u00E3o voc\u00EA deseja realizar?");
		lblQueAoVoc.setBounds(124, 69, 164, 14);
		contentPane.add(lblQueAoVoc);
		
		JButton btnIncio = new JButton("In\u00EDcio");
		btnIncio.setBounds(10, 11, 57, 23);
		contentPane.add(btnIncio);
	}

}
