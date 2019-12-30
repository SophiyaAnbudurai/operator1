package milegecalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mcalc {

	private JFrame frame;
	private JTextField text1;
	private JTextField text2;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mcalc window = new mcalc();
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
	public mcalc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MILEGE CALCULATOR");
		lblNewLabel.setBounds(139, 25, 189, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("DISTANCE COVERED IN Km");
		lblNewLabel_1.setBounds(32, 71, 210, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PETROL CONSUMPTION IN Litre");
		lblNewLabel_2.setBounds(32, 124, 179, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		text1 = new JTextField();
		text1.setBounds(259, 68, 86, 20);
		frame.getContentPane().add(text1);
		text1.setColumns(10);
		
		text2 = new JTextField();
		text2.setBounds(259, 121, 86, 20);
		frame.getContentPane().add(text2);
		text2.setColumns(10);
		
		JButton btnNewButton = new JButton("CALCULATE MILEGE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int lblNewLabel=Integer.parseInt(text1.getText());
				int lblNewLabel_1=Integer.parseInt(text2.getText());
				int net = (lblNewLabel/lblNewLabel_1);
				textField.setText(String.valueOf(net));
			}
			
		});
		btnNewButton.setBounds(113, 167, 146, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("MILEGE per Litre");
		lblNewLabel_3.setBounds(38, 214, 153, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(259, 211, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}

}
