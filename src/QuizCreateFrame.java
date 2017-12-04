import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JTextField;

public class QuizCreateFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private ArrayList<ShortAnswerQuestion> quizQuestions = new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuizCreateFrame frame = new QuizCreateFrame();
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
	public QuizCreateFrame() {
		this.quizQuestions = quizQuestions;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList<String> list = new JList<>();
		list.setBounds(6, 264, 107, -256);
		contentPane.add(list);
		
		JTextPane txtpnQuestion = new JTextPane();
		txtpnQuestion.setText("Quiz Name: ");
		txtpnQuestion.setBounds(136, 56, 84, 16);
		contentPane.add(txtpnQuestion);
		
		JButton addShortAnswer = new JButton("Add Short Answer Question");
		addShortAnswer.setBounds(154, 121, 266, 22);
		contentPane.add(addShortAnswer);
		addShortAnswer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShortAnswerQuestion shortAnswerQuestion = new ShortAnswerQuestion();
				ShortAnswerFrame shortAnswerFrame = new ShortAnswerFrame();
				shortAnswerFrame.addQuestion(shortAnswerQuestion);
				shortAnswerFrame.setVisible(true);
			}
		});
		
		JButton addMultipleChoice = new JButton("Add Multiple Choice Question");
		addMultipleChoice.setBounds(154, 147, 266, 29);
		contentPane.add(addMultipleChoice);
		addMultipleChoice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MultipleChoiceFrame multipleChoiceFrame = new MultipleChoiceFrame();
				multipleChoiceFrame.setVisible(true);
			}
		});
		
		JButton addMultipleAnswer = new JButton("Add Multiple Answer");
		addMultipleAnswer.setBounds(154, 177, 266, 29);
		contentPane.add(addMultipleAnswer);
		
		textField = new JTextField();
		textField.setBounds(136, 72, 314, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Reload saved questions");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel defaultListModel = new DefaultListModel<>();
				for (int i = 0; i < quizQuestions.size(); i++) {
					defaultListModel.addElement(quizQuestions.get(i).askQuestion());
				}
				list.setModel(defaultListModel);
			}
		});
		
		btnNewButton.setBounds(162, 243, 203, 29);
		contentPane.add(btnNewButton);
		addMultipleAnswer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MultipleAnswerFrame multipleAnswerFrame = new MultipleAnswerFrame();
				multipleAnswerFrame.setVisible(true);
			}
		});
		
	}
	
	public void addQuestionList(ArrayList<ShortAnswerQuestion> questions) {
		this.quizQuestions = questions;
	}
}
