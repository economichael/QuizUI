import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;

public class QuizMaker {

	private JFrame createLoadFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuizMaker window = new QuizMaker();
					window.createLoadFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public QuizMaker() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		createLoadFrame = new JFrame();
		createLoadFrame.setBounds(100, 100, 450, 300);
		createLoadFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createLoadFrame.getContentPane().setLayout(null);
		
		JButton createQuizButton = new JButton("Create Quiz");
		createQuizButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createLoadFrame.dispose();
				QuizCreateFrame quizCreateFrame = new QuizCreateFrame();
				quizCreateFrame.setVisible(true);
			}
		});
		
		createQuizButton.setBounds(168, 157, 117, 29);
		createLoadFrame.getContentPane().add(createQuizButton);
		
		JButton loadQuizButton = new JButton("Load Quiz");
		loadQuizButton.setBounds(168, 89, 117, 29);
		createLoadFrame.getContentPane().add(loadQuizButton);
		loadQuizButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});

	} 
}
