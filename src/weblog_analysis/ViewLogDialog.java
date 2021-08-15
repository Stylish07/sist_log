package weblog_analysis;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JDialog;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class ViewLogDialog extends JDialog {

	public ViewLogDialog(LogAnalysisView parent) throws RangeException, Exception {
		super(parent, "�α� �м�", true);
		Font font = new Font("���� ���", Font.BOLD, 13);

		JLabel data = new JLabel();
		data.setFont(font);
		add("Center", data);
		data.setBackground(new Color(0xFFFFFF));

		// ������ �����ͼ� ���⿡ ���⸸ �ϸ��
		LogProcess logProcess = new LogProcess(parent);

		data.setText("<html>" + "1. �ִ� ��� Ű: " + logProcess.getMostUsedKeyName() + ",&nbsp&nbsp&nbsp&nbspȽ��: "
				+ logProcess.getMostUsedKeyCount() + "<br>2. �������� ���� Ƚ��: " + logProcess.printBrowserStats()
				+ "<br>3. ���񽺸� ���������� ������ Ƚ��(200): " + logProcess.getCount200() + ",&nbsp&nbsp&nbsp&nbsp���� Ƚ��(404): "
				+ logProcess.getCount404() + "<br>4. ��û�� ���� ���� �ð�: " + logProcess.getHourZone() + "��"
				+ "<br>5. ���������� ��û�� �߻��� Ƚ��(403): " + logProcess.getCount403() + ",&nbsp&nbsp&nbsp&nbsp����(%): "
				+ logProcess.getCount403Rate() + "<br>6. ��û�� ���� ������ �߻��� Ƚ��(500): " + logProcess.getCount500()
				+ ",&nbsp&nbsp&nbsp&nbsp����(%): " + logProcess.getCount500Rate() + "\n7. �Էµ� ���ι����� �ִ� ���Ű�� �̸��� Ƚ��: "
				+ logProcess.getMostUsedKeyNameRange() + ", " + logProcess.getMostUsedKeyCountRange() + "</html>");

		// â ����
		setBounds(parent.getX() + 50, parent.getY() + 50, 480, 240);
		setVisible(true);
	}
}
