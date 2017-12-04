import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import javax.swing.JButton;

public class MultipleAnswerFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JEditorPane correctAnswers;
	private JEditorPane possibleAnswers;
	private JTextPane txtpnEnterCorrectAnswers;
	private JTextPane txtpnEnterIncorrectAnswers;
	private JButton btnSave;
	private MultipleAnswerQuestion multipleAnswerQuestion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MultipleAnswerFrame frame = new MultipleAnswerFrame();
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
	public MultipleAnswerFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnEnterQuestion = new JTextPane();
		txtpnEnterQuestion.setText("Enter Question");
		txtpnEnterQuestion.setBounds(152, 20, 148, 16);
		contentPane.add(txtpnEnterQuestion);
		
		textField = new JTextField();
		textField.setBounds(162, 36, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		correctAnswers = new JEditorPane();
		correctAnswers.setBounds(33, 120, 148, 122);
		contentPane.add(correctAnswers);
		
		possibleAnswers = new JEditorPane();
		possibleAnswers.setBounds(249, 120, 158, 122);
		contentPane.add(possibleAnswers);
		
		txtpnEnterCorrectAnswers = new JTextPane();
		txtpnEnterCorrectAnswers.setText("Enter correct answers separated by new line");
		txtpnEnterCorrectAnswers.setBounds(33, 74, 148, 34);
		contentPane.add(txtpnEnterCorrectAnswers);
		
		txtpnEnterIncorrectAnswers = new JTextPane();
		txtpnEnterIncorrectAnswers.setText("Enter incorrect answers separated by new line");
		txtpnEnterIncorrectAnswers.setBounds(249, 64, 148, 53);
		contentPane.add(txtpnEnterIncorrectAnswers);
		
		btnSave = new JButton("Save");
		btnSave.setBounds(154, 243, 117, 29);
		contentPane.add(btnSave);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				multipleAnswerQuestion.setQuestion(textField.getText());
				ArrayList<String> answers = new ArrayList<>(Arrays.asList(correctAnswers.getText().split("\n")));
				ArrayList<String> possibleAnswerList = new ArrayList<>(Arrays.asList(possibleAnswers.getText().split("\n")));
				possibleAnswerList.addAll(answers);
				multipleAnswerQuestion.setActualAnswers(answers);
				Collections.shuffle(possibleAnswerList);
				multipleAnswerQuestion.setPossibleAnswers(possibleAnswerList);
				dispose();
			}
		});
		
	}
}
