package weblog_analysis;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class LogAnalysisView extends JFrame {

	private JButton fileChoiceButton;
	private JButton viewButton;
	private JTextField startLine;
	private JTextField endLine;
	private JButton reportButton;
	private JLabel directoryLabel;

	public LogAnalysisView() {
		super("�α׺м� - �м�â");
		LogAnalysisEvent logAnalysisEvent = new LogAnalysisEvent(this);

		// ������Ʈ ���� ����
		int windowWidth = 720;
		int outputButtonWidth = 120;

		// ���� ���� ��ư
		fileChoiceButton = new JButton("���� ����");
		fileChoiceButton.setBounds(100, 80, 100, 30);
		add(fileChoiceButton);
		fileChoiceButton.addActionListener(logAnalysisEvent);

		// ���ϰ�ι� ���ϸ� ��
		directoryLabel = new JLabel();
		directoryLabel.setBounds(210, 80, windowWidth - 290, 30);
		directoryLabel.setOpaque(true);
		directoryLabel.setBackground(new Color(0xFFFFFF));
		add(directoryLabel);
		
		// ���� �ȳ� ��
		JLabel lineInput = new JLabel();
		lineInput.setText("<html>�˻��� ���� ����: <br>���� ~ ��</html>");
		lineInput.setBounds(100, 200, 150, 30); 
		add(lineInput);

		// ���� �Է� (���� ����)
		startLine = new JTextField();
		startLine.setBounds(200, 200, 100, 30);
		add(startLine);
		// startLine.addActionListener(logAnalysisEvent);

		// ���� �Է� (�� ����)
		endLine = new JTextField();
		endLine.setBounds(300, 200, 100, 30);
		add(endLine);
		// endLine.addActionListener(logAnalysisEvent);

		// �� ��ư
		viewButton = new JButton("View");
		viewButton.setBounds((windowWidth / 2) - (outputButtonWidth + 80), 300, outputButtonWidth, 50);
		add(viewButton);
		viewButton.addActionListener(logAnalysisEvent);

		// ����Ʈ ��ư
		reportButton = new JButton("Report����");
		reportButton.setBounds((windowWidth / 2) + 80, 300, outputButtonWidth, 50);
		add(reportButton);
		reportButton.addActionListener(logAnalysisEvent);

		// ������ ����
		setLayout(null);
		setResizable(false);
		setBounds(800, 200, windowWidth, 480);
		setVisible(true);
		addWindowListener(logAnalysisEvent);
	}

	public JButton getFileChoiceButton() {
		return fileChoiceButton;
	}

	public JLabel getDirectoryLabel() {
		return directoryLabel;
	}

	public JTextField getStartLine() {
		return startLine;
	}

	public JTextField getEndLine() {
		return endLine;
	}

	public JButton getViewButton() {
		return viewButton;
	}

	public JButton getReportButton() {
		return reportButton;
	}

}