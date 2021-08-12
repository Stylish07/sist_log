package weblog_analysis;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class LoginView extends JFrame {

	public static final int windowWidth = 720;
	public static final int windowHeight = 480;

	private JTextField idField;
	private JPasswordField passwordField;
	private JButton loginButton;

	public LoginView() {
		super("로그 분석 - 로그인");

		int width = 400;
		int height = 50;
		int x = (windowWidth / 2) - (width / 2);
		int y = 150;

		// 아이디 필드
		idField = new JTextField();
		idField.setBounds(x, y, width, height);
		add(idField);

		// 패스워드 필드
		passwordField = new JPasswordField();
		passwordField.setBounds(x, y + 100, width, height);
		add(passwordField);

		// 아이디 라벨
		JLabel idLabel = new JLabel("ID");
		idLabel.setBounds(x, y - 35, 100, 50);
		add(idLabel);

		// 패스워드 라벨
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(x, y + 100 - 35, 100, 50);
		add(passwordLabel);

		// 로그인 버튼
		loginButton = new JButton("Login");
		loginButton.setBounds(x, y + 200, width, height);
		add(loginButton);

		// 윈도우 설정
		setLayout(null);
		setResizable(false);
		setBounds(800, 200, windowWidth, windowHeight);
		setVisible(true);

		// 이벤트 처리
		LoginEvent loginEvent = new LoginEvent(this);
		addWindowListener(loginEvent);
		loginButton.addActionListener(loginEvent);
		passwordField.addKeyListener(loginEvent);
	}

	public JTextField getIdField() {
		return idField;
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public JButton getLoginButton() {
		return loginButton;
	}
}
