import java.awt.BorderLayout;
import java.awt.EventQueue;

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
	private JEditorPane editorPane;
	private JEditorPane editorPane_1;
	private JTextPane txtpnEnterCorrectAnswers;
	private JTextPane txtpnEnterIncorrectAnswers;
	private JButton btnSave;

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
		
		editorPane = new JEditorPane();
		editorPane.setBounds(33, 120, 148, 122);
		contentPane.add(editorPane);
		
		editorPane_1 = new JEditorPane();
		editorPane_1.setBounds(249, 120, 158, 122);
		contentPane.add(editorPane_1);
		
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
		
	}
}
