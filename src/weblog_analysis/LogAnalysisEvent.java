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
		if(e.getSource() == logAnalysisView.getFileChoiceButton()) {
			choiceFile();
		}
		
		if (e.getSource() == logAnalysisView.getViewButton()) {
			viewLogInfo();
		}

		if (e.getSource() == logAnalysisView.getReportButton()) {
			reportLogInfo();
		}
	}
	
	public void choiceFile() {
		new ChoiceFileDialog(logAnalysisView);
	}

	public void viewLogInfo() {
		try {
			new ViewLogDialog(logAnalysisView);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("抗寇贸府1");
		}
	}

	public void reportLogInfo() {
		try {
			new ReportProcess(logAnalysisView);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("抗寇贸府2");
		}
	}

}
