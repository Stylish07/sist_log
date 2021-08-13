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
		super("로그분석 - 분석창");
		LogAnalysisEvent logAnalysisEvent = new LogAnalysisEvent(this);

		// 컴포넌트 길이 정의
		int windowWidth = 720;
		int outputButtonWidth = 120;

		// 파일 선택 버튼
		fileChoiceButton = new JButton("파일 선택");
		fileChoiceButton.setBounds(100, 80, 100, 30);
		add(fileChoiceButton);
		fileChoiceButton.addActionListener(logAnalysisEvent);

		// 파일경로및 파일명 라벨
		directoryLabel = new JLabel();
		directoryLabel.setBounds(210, 80, windowWidth - 290, 30);
		directoryLabel.setOpaque(true);
		directoryLabel.setBackground(new Color(0xFFFFFF));
		add(directoryLabel);
		
		// 라인 안내 라벨
		JLabel lineInput = new JLabel();
		lineInput.setText("<html>검색할 라인 범위: <br>시작 ~ 끝</html>");
		lineInput.setBounds(100, 200, 150, 30); 
		add(lineInput);

		// 라인 입력 (시작 라인)
		startLine = new JTextField();
		startLine.setBounds(200, 200, 100, 30);
		add(startLine);
		// startLine.addActionListener(logAnalysisEvent);

		// 라인 입력 (끝 라인)
		endLine = new JTextField();
		endLine.setBounds(300, 200, 100, 30);
		add(endLine);
		// endLine.addActionListener(logAnalysisEvent);

		// 뷰 버튼
		viewButton = new JButton("View");
		viewButton.setBounds((windowWidth / 2) - (outputButtonWidth + 80), 300, outputButtonWidth, 50);
		add(viewButton);
		viewButton.addActionListener(logAnalysisEvent);

		// 리포트 버튼
		reportButton = new JButton("Report파일");
		reportButton.setBounds((windowWidth / 2) + 80, 300, outputButtonWidth, 50);
		add(reportButton);
		reportButton.addActionListener(logAnalysisEvent);

		// 윈도우 설정
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