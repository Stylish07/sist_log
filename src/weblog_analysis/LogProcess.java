package weblog_analysis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LogProcess {

	File logFile;
	FileReader fileReader;
	BufferedReader bufferedReader;

	private int total = 0;
	private int count403 = 0;
	private int count500 = 0;

	public LogProcess(String directory) throws Exception {
		logFile = new File(directory);

		fileReader = new FileReader(logFile);
		bufferedReader = new BufferedReader(fileReader);

		readLog();
	}

	public void readLog() throws IOException {
		String line = "";

		while ((line = bufferedReader.readLine()) != null) {
			total++;

			switch (line.substring(1, 4)) {
			case "403": {
				count403++;
			}
			case "500": {
				count500++;
			}
			}
		}
	}

	public int getCount403() {
		return count403;
	}

	public double getCount403Rate() {
		double rate = ((double) count403 / (double) total) * 100;
		System.out.println(rate);
		
		return Math.round(rate * 100) / 100.0;
	}

	public int getCount500() {
		return count500;
	}

	public double getCount500Rate() {
		double rate = ((double) count500 / (double) total) * 100;
		System.out.println(rate);
		
		return Math.round(rate * 100) / 100.0;
	}

}