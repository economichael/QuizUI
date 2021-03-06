import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class ShortAnswerFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	ShortAnswerQuestion shortAnswerQuestion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShortAnswerFrame frame = new ShortAnswerFrame();
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
	public ShortAnswerFrame() {
		this.shortAnswerQuestion = shortAnswerQuestion;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(31, 22, 371, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		final JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(31, 108, 365, 119);
		contentPane.add(editorPane);
		
		JTextPane txtpnQuestion = new JTextPane();
		txtpnQuestion.setText("Question: ");
		txtpnQuestion.setBounds(31, 6, 65, 16);
		contentPane.add(txtpnQuestion);
		
		JTextPane txtpnEnterAnswer = new JTextPane();
		txtpnEnterAnswer.setText("Answer: \nNote: Correct answer first. Separate valid answers by n/l. ");
		txtpnEnterAnswer.setBounds(31, 71, 365, 32);
		contentPane.add(txtpnEnterAnswer);
		

		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				shortAnswerQuestion.setQuestion(textField.getText());
				shortAnswerQuestion.setAnswers(new ArrayList<>(Arrays.asList(editorPane.getText().split("\n"))));
				dispose();
			}
		});
		btnSave.setBounds(156, 243, 117, 29);
		contentPane.add(btnSave);

	}
	
	public void addQuestion(ShortAnswerQuestion shortAnswerQuestion) {
		this.shortAnswerQuestion = shortAnswerQuestion;
	}
}
