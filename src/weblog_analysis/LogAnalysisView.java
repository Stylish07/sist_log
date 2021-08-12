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
		super("로그분석 - 분석창");

		// 파일 선택 버튼
		fileChoiceButton = new JButton("파일 선택");
		fileChoiceButton.setBounds(100, 0, 100, 100);
		add(fileChoiceButton);

		// 파일경로및 파일명 라벨
		directoryLabel = new JLabel();
		directoryLabel.setBounds(200, 0, 200, 40);
		directoryLabel.setOpaque(true);
		directoryLabel.setBackground(new Color(0xFFFFFF));
		add(directoryLabel);

		// 뷰 버튼
		viewButton = new JButton("View");
		viewButton.setBounds(100, 100, 100, 100);
		add(viewButton);

		// 리포트 버튼
		reportButton = new JButton("Report파일");
		reportButton.setBounds(300, 100, 100, 100);
		add(reportButton);

		// 윈도우 설정
		setLayout(null);
		setResizable(false);
		setBounds(800, 200, 720, 480);
		setVisible(true);

		// 이벤트 설정
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