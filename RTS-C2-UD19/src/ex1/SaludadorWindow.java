package ex1;

import java.awt.EventQueue;
import java.awt.Rectangle;

import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SaludadorWindow {

	private JFrame Saludador;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SaludadorWindow window = new SaludadorWindow();
					window.Saludador.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SaludadorWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Saludador = new JFrame();
		Saludador.setTitle("Saludador");
		Saludador.setBounds(new Rectangle(0, 0, 450, 300));
		Saludador.setLocationRelativeTo(null);
		Saludador.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Escribe un nombre para saludar");
		label.setBounds(114, 12, 244, 54);
		Saludador.getContentPane().add(label);
		
		JButton boton = new JButton("¡Saludar!");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		boton.setBounds(160, 199, 117, 25);
		Saludador.getContentPane().add(boton);
		
		JTextField texto = new JTextField();
		texto.setBounds(83, 132, 293, 19);
		Saludador.getContentPane().add(texto);
		textField.setColumns(10);
	}
}
