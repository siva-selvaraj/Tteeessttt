package org.avmreport;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReportt {

	public static void generateJVMReport(String json) {
		File loc = new File("./src\\test\\resources\\JVMReports");

		Configuration con = new Configuration(loc, "facebook");

		List<String> jsonfiles = new LinkedList<String>();
		jsonfiles.add(json);
		ReportBuilder r = new ReportBuilder(jsonfiles, con);
		r.generateReports();

	}

}
