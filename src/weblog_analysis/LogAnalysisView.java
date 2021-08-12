package weblog_analysis;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class LogAnalysisView extends JFrame {

	JButton viewButton;
	JButton reportButton;

	public LogAnalysisView() {
		super("�α׺м� - �м�â");

		// �� ��ư
		viewButton = new JButton("View");
		viewButton.setBounds(100, 100, 100, 100);
		add(viewButton);

		// ����Ʈ ��ư
		reportButton = new JButton("Report����");
		reportButton.setBounds(300, 100, 100, 100);
		add(reportButton);

		// ������ ����
		setLayout(null);
		setResizable(false);
		setBounds(800, 200, 720, 480);
		setVisible(true);

		// �̺�Ʈ ����
		LogAnalysisEvent logAnalysisEvent = new LogAnalysisEvent(this);
		addWindowListener(logAnalysisEvent);
		viewButton.addActionListener(logAnalysisEvent);
		reportButton.addActionListener(logAnalysisEvent);
	}

	public JButton getViewButton() {
		return viewButton;
	}

	public JButton getReportButton() {
		return reportButton;
	}

}