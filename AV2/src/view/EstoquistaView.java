package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class EstoquistaView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EstoquistaView frame = new EstoquistaView();
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
	public EstoquistaView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEstoquista = new JLabel("Estoquistas");
		lblEstoquista.setBounds(171, 28, 56, 14);
		contentPane.add(lblEstoquista);
		
		JLabel lblQueAoVoc = new JLabel("Que a\u00E7\u00E3o voc\u00EA deseja realizar?");
		lblQueAoVoc.setBounds(123, 67, 158, 14);
		contentPane.add(lblQueAoVoc);
		
		JButton btnNewButton = new JButton("Incluir");
		btnNewButton.setBounds(78, 118, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Alterar");
		btnNewButton_1.setBounds(78, 167, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Excluir");
		btnNewButton_2.setBounds(211, 118, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Listar");
		btnNewButton_3.setBounds(211, 167, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnIncio = new JButton("In\u00EDcio");
		btnIncio.setBounds(10, 11, 62, 23);
		contentPane.add(btnIncio);
	}
}
