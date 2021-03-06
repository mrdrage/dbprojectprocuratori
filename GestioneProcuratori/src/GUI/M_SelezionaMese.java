package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class M_SelezionaMese extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public M_SelezionaMese() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 304, 189);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 245, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel ScegliMese_L = new JLabel("Seleziona il mese");
		ScegliMese_L.setHorizontalAlignment(SwingConstants.CENTER);
		ScegliMese_L.setFont(new Font("Verdana", Font.PLAIN, 20));
		ScegliMese_L.setBounds(10, 11, 271, 36);
		contentPane.add(ScegliMese_L);
		
		JComboBox ScegliMese_CO = new JComboBox();
		ScegliMese_CO.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ScegliMese_CO.setBounds(25, 74, 146, 22);
		contentPane.add(ScegliMese_CO);
		
		JButton Annulla_B = new JButton("Annulla");
		Annulla_B.setBackground(new Color(0, 0, 0));
		Annulla_B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Torna alla finestra ControllaGuadagni
				//setVisible(false);
			}
		});
		Annulla_B.setBounds(122, 116, 67, 23);
		contentPane.add(Annulla_B);
		
		JComboBox ScegliAnno_CO = new JComboBox();
		ScegliAnno_CO.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ScegliAnno_CO.setBounds(181, 74, 85, 22);
		contentPane.add(ScegliAnno_CO);
		
		JButton Cerca_B = new JButton("Cerca");
		Cerca_B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Se il risultato é null, appare la dialog ErroreMese e si torna alla finestra ControllaGuadagni
				//oppure
				//Apre la finestra ControllaGuadagniMensili, caricando prima i guadaagni del procuratore dal mese e dall'anno selezionato
				//setVisible(False)
			}
		});
		Cerca_B.setBackground(new Color(0, 0, 0));
		Cerca_B.setBounds(199, 116, 67, 23);
		contentPane.add(Cerca_B);
	}
}
