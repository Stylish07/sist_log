package weblog_analysis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LogAnalysisEvent extends WindowAdapter implements ActionListener {

	LogAnalysisView logAnalysisView;

	public LogAnalysisEvent(LogAnalysisView logAnalysisView) {
		this.logAnalysisView = logAnalysisView;
	}

	@Override
	public void windowClosing(WindowEvent e) {
		super.windowClosing(e);
		logAnalysisView.dispose();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == logAnalysisView.getViewButton()) {
			viewLogInfo();
		}

		if (e.getSource() == logAnalysisView.getReportButton()) {
			reportLogInfo();
		}
	}

	public void viewLogInfo() {
		System.out.println("대충 뷰 메서드 실행");
	}

	public void reportLogInfo() {
		System.out.println("대충 리포트 메서드 실행");
	}

}
