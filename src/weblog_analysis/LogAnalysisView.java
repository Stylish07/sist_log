package weblog_analysis;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class LogAnalysisView extends JFrame {

	private JButton fileChoiceButton;
	private JButton viewButton;
	private JButton reportButton;
	private JLabel directoryLabel;

	public LogAnalysisView() {
		super("�α׺м� - �м�â");

		// ���� ���� ��ư
		fileChoiceButton = new JButton("���� ����");
		fileChoiceButton.setBounds(100, 0, 100, 100);
		add(fileChoiceButton);

		// ���ϰ�ι� ���ϸ� ��
		directoryLabel = new JLabel();
		directoryLabel.setBounds(200, 0, 200, 40);
		directoryLabel.setOpaque(true);
		directoryLabel.setBackground(new Color(0xFFFFFF));
		add(directoryLabel);

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
		fileChoiceButton.addActionListener(logAnalysisEvent);
		viewButton.addActionListener(logAnalysisEvent);
		reportButton.addActionListener(logAnalysisEvent);
	}

	public JButton getFileChoiceButton() {
		return fileChoiceButton;
	}

	public JLabel getDirectoryLabel() {
		return directoryLabel;
	}

	public JButton getViewButton() {
		return viewButton;
	}

	public JButton getReportButton() {
		return reportButton;
	}

}