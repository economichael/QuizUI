import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MultipleChoiceFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MultipleChoiceFrame frame = new MultipleChoiceFrame();
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
	public MultipleChoiceFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnQuestion = new JTextPane();
		txtpnQuestion.setText("Question: ");
		txtpnQuestion.setBounds(31, 6, 65, 16);
		contentPane.add(txtpnQuestion);
		
		textField = new JTextField();
		textField.setBounds(31, 22, 361, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JEditorPane dtrpnEnterAnswersSeparated = new JEditorPane();
		dtrpnEnterAnswersSeparated.setText("Possible Answers: \nNote: Enter answers separated by n/l. \nEnter correct answer first. \nAnswers will be randomized for the quiz taker.");
		dtrpnEnterAnswersSeparated.setBounds(31, 60, 361, 67);
		contentPane.add(dtrpnEnterAnswersSeparated);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(31, 139, 361, 100);
		contentPane.add(editorPane);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSave.setBounds(156, 243, 117, 29);
		contentPane.add(btnSave);
	}

}
