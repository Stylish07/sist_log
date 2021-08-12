package weblog_analysis;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class LogAnalysisView extends JFrame {

	JButton viewButton;
	JButton reportButton;

	public LogAnalysisView() {
		super("로그분석 - 분석창");

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