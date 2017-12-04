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
		
		JTextPane txtpnQuestion = new JTextPane();
		txtpnQuestion.setText("Quiz Name: ");
		txtpnQuestion.setBounds(281, 54, 84, 16);
		contentPane.add(txtpnQuestion);
		
		JList list = new JList();
		list.setBounds(6, 6, 191, 222);
		contentPane.add(list);
		
		JButton addShortAnswer = new JButton("Add Short Answer Question");
		addShortAnswer.setBounds(249, 120, 266, 22);
		contentPane.add(addShortAnswer);
		addShortAnswer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShortAnswerQuestion shortAnswerQuestion = new ShortAnswerQuestion();
				ShortAnswerFrame shortAnswerFrame = new ShortAnswerFrame();
				shortAnswerFrame.addQuestion(shortAnswerQuestion);
				shortAnswerFrame.setVisible(true);
				quizQuestions.add(shortAnswerQuestion);
			}
		});
		
		JButton addMultipleChoice = new JButton("Add Multiple Choice Question");
		addMultipleChoice.setBounds(249, 154, 266, 29);
		contentPane.add(addMultipleChoice);
		addMultipleChoice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MultipleChoiceFrame multipleChoiceFrame = new MultipleChoiceFrame();
				multipleChoiceFrame.setVisible(true);
			}
		});
		
		JButton addMultipleAnswer = new JButton("Add Multiple Answer");
		addMultipleAnswer.setBounds(259, 184, 266, 29);
		contentPane.add(addMultipleAnswer);
		
		textField = new JTextField();
		textField.setBounds(201, 71, 314, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Reload saved questions");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel defaultListModel = new DefaultListModel<>();
				for (int i = 0; i < quizQuestions.size(); i++) {
					String question = quizQuestions.get(i).askQuestion();
					System.out.println("Question: " + question);
					defaultListModel.addElement(question);
				}
				list.setModel(defaultListModel);
			}
		});
		
		btnNewButton.setBounds(6, 243, 203, 29);
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
