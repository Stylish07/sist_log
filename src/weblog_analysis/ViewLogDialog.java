package weblog_analysis;

import javax.swing.JDialog;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class ViewLogDialog extends JDialog {

	public ViewLogDialog(LogAnalysisView parent) throws Exception {
		super(parent, "�α� �м�", true);

		JLabel data = new JLabel();
		add("Center", data);

		// ������ �����ͼ� ���⿡ ���⸸ �ϸ��
		LogProcess logProcess = new LogProcess(parent.getDirectoryLabel().getText());

		data.setText("<html>4. ���������� ��û(403) Ƚ��: " + logProcess.getCount403() + "<br>����(%): " + logProcess.getCount403Rate()
				+ "<br>5. ��û�� ���� ����(500) Ƚ��: " + logProcess.getCount500() + "<br>����(%): " + logProcess.getCount500Rate() + "</html>");

		// â ����
		setBounds(parent.getX() + 50, parent.getY() + 50, 480, 240);
		setVisible(true);
	}
}
