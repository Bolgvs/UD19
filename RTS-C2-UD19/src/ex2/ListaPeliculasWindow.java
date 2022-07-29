package ex2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class ListaPeliculasWindow {

	private JFrame frmPeliculas;
	private JTextField textField;

	/*
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaPeliculasWindow window = new ListaPeliculasWindow();
					window.frmPeliculas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/*
	 * Create the application.
	 */
	public ListaPeliculasWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPeliculas = new JFrame();
		frmPeliculas.setTitle("Peliculas");
		frmPeliculas.setBounds(0, 0, 450, 300);
		frmPeliculas.setLocationRelativeTo(null);
		frmPeliculas.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Escribe el t\u00EDtulo de una pel\u00EDcula");
		lblNewLabel.setBounds(31, 74, 153, 33);
		frmPeliculas.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Pel\u00EDculas");
		lblNewLabel_1.setBounds(318, 83, 46, 14);
		frmPeliculas.getContentPane().add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(31, 118, 153, 20);
		frmPeliculas.getContentPane().add(textField);
		textField.setColumns(10);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(289, 117, 96, 22);
		
		JButton btnNewButton = new JButton("A\u00F1adir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!textField.getText().isEmpty()) {
					
				} else {
					JOptionPane.showMessageDialog(null, "Debes poner una película en el recuadro");
				}
			}
		});
		
		btnNewButton.setBounds(58, 164, 89, 23);
		frmPeliculas.getContentPane().add(btnNewButton);

		frmPeliculas.getContentPane().add(comboBox);
		frmPeliculas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
