package ex4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MiniCalculadoraWindow {

	private JFrame frmMiniYoda;
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
					MiniCalculadoraWindow window = new MiniCalculadoraWindow();
					window.frmMiniYoda.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MiniCalculadoraWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMiniYoda = new JFrame();
		frmMiniYoda.setTitle("Mini Calculadora");
		frmMiniYoda.setBounds(100, 100, 450, 300);
		frmMiniYoda.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMiniYoda.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(231, 48, 86, 20);
		frmMiniYoda.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(31, 48, 86, 20);
		frmMiniYoda.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(31, 203, 86, 20);
		frmMiniYoda.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(42, 126, 40, 25);
		frmMiniYoda.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("About");
		btnNewButton_1.setBounds(333, 223, 92, 23);
		frmMiniYoda.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("*");
		btnNewButton_2.setBounds(120, 126, 40, 25);
		frmMiniYoda.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("-");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(81, 126, 40, 25);
		frmMiniYoda.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("/");
		btnNewButton_4.setBounds(159, 126, 40, 25);
		frmMiniYoda.getContentPane().add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("Operando 1");
		lblNewLabel.setBounds(31, 33, 86, 14);
		frmMiniYoda.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Operando 2");
		lblNewLabel_1.setBounds(231, 33, 86, 14);
		frmMiniYoda.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado");
		lblNewLabel_2.setBounds(31, 189, 86, 14);
		frmMiniYoda.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Posibles Operaciones");
		lblNewLabel_3.setBounds(31, 101, 110, 14);
		frmMiniYoda.getContentPane().add(lblNewLabel_3);
	}
}