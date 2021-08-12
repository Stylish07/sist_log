package weblog_analysis;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LoginProcess {
	LoginView loginView;

	Map<String, char[]> idPassword = new HashMap<String, char[]>();

	private static final String id1 = "admin";
	private static final String id2 = "root";
	private static final String id3 = "administrator";

	private static final char[] password1 = { '1', '2', '3', '4' };
	private static final char[] password2 = { '1', '1', '1', '1' };
	private static final char[] password3 = { '1', '2', '3', '4', '5' };

	public LoginProcess(LoginView loginView) {
		this.loginView = loginView;

		idPassword.put(id1, password1);
		idPassword.put(id2, password2);
		idPassword.put(id3, password3);

		String id = loginView.getIdField().getText();
		char[] password = loginView.getPasswordField().getPassword();

		if (idPassword.containsKey(id)) {
			if (Arrays.equals(password, idPassword.get(id))) {
				loginSuccess(loginView);
			} else {
				loginFailPassword();
			}
		} else {
			loginFailId();
		}
	}

	public void loginSuccess(LoginView loginView) {
		new LogAnalysisView();
		loginView.dispose();
	}

	public void loginFailId() {
		System.out.println("존재하지 않는 아이디입니다.");
	}

	public void loginFailPassword() {
		System.out.println("비밀번호가 틀렸습니다.");
	}

}
