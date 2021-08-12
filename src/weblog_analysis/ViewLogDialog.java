package weblog_analysis;

import javax.swing.JDialog;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class ViewLogDialog extends JDialog {

	public ViewLogDialog(LogAnalysisView parent) throws Exception {
		super(parent, "로그 분석", true);

		JLabel data = new JLabel();
		add("Center", data);

		// 데이터 가져와서 여기에 띄우기만 하면됨
		LogProcess logProcess = new LogProcess(parent.getDirectoryLabel().getText());

		data.setText("<html>4. 비정상적인 요청(403) 횟수: " + logProcess.getCount403() + "<br>비율(%): " + logProcess.getCount403Rate()
				+ "<br>5. 요청에 대한 에러(500) 횟수: " + logProcess.getCount500() + "<br>비율(%): " + logProcess.getCount500Rate() + "</html>");

		// 창 설정
		setBounds(parent.getX() + 50, parent.getY() + 50, 480, 240);
		setVisible(true);
	}
}
