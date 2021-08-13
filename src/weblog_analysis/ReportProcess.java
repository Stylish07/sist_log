package weblog_analysis;

import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ReportProcess {

	public ReportProcess(LogAnalysisView parent) throws Exception {
		LogProcess logProcess = new LogProcess(parent);

		SimpleDateFormat format1 = new SimpleDateFormat("yyyymmddHHmmss");
		Calendar time = Calendar.getInstance();

		String directory = "c:/dev/report";
		String reportName = "/report_" + format1.format(time.getTime()) + ".dat";

		new File(directory).mkdirs();
		FileWriter fileWriter = new FileWriter(new File(directory + reportName));
		
		// 파일 출력 작업 하기

	}

}
