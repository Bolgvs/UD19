package ex3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.JSlider;

public class MiniencuestaWindow {
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiniencuestaWindow window = new MiniencuestaWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MiniencuestaWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(0, 0, 450, 300);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Elije un sistema operativo:");
		lblNewLabel.setBounds(22, 20, 161, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Elije tu especialidad:");
		lblNewLabel_1.setBounds(244, 20, 130, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Horas dedicadas en el ordenador:");
		lblNewLabel_2.setBounds(22, 140, 220, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JRadioButton rdbtnWindows = new JRadioButton("Windows");
		rdbtnWindows.setBounds(22, 40, 109, 23);
		frame.getContentPane().add(rdbtnWindows);
		
		JRadioButton rdbtnLinux = new JRadioButton("Linux");
		rdbtnLinux.setBounds(22, 67, 109, 23);
		frame.getContentPane().add(rdbtnLinux);
		
		JRadioButton rdbtnMac = new JRadioButton("Mac");
		rdbtnMac.setBounds(22, 93, 109, 23);
		frame.getContentPane().add(rdbtnMac);
		
		JCheckBox chckbxProgramacion = new JCheckBox("Programaci\u00F3n");
		chckbxProgramacion.setBounds(244, 40, 97, 23);
		frame.getContentPane().add(chckbxProgramacion);
		
		JCheckBox chckbxDiseno = new JCheckBox("Dise\u00F1o Gr\u00E1fico");
		chckbxDiseno.setBounds(244, 67, 97, 23);
		frame.getContentPane().add(chckbxDiseno);
		
		JCheckBox chckbxAdmin = new JCheckBox("Administraci\u00F3n");
		chckbxAdmin.setBounds(244, 93, 97, 23);
		frame.getContentPane().add(chckbxAdmin);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rdbtnWindows);
		grupo.add(rdbtnLinux);
		grupo.add(rdbtnMac);
		
		JSlider slider = new JSlider();
		slider.setMajorTickSpacing(1);
		slider.setSnapToTicks(true);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setMaximum(10);
		slider.setBounds(22, 170, 200, 38);
		frame.getContentPane().add(slider);
	}
}
