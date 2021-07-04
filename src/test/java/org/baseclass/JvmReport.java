package org.baseclass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
public static void generateJvmReport(String jsonpath) {
	File f=new File(System.getProperty("user.dir")+
			"\\src\\test\\resources\\Reports\\JvmReport");
	
	Configuration con=new Configuration(f, "Hotel booking app");
	con.addClassifications("Platform name", "Windows 10");
	con.addClassifications("Browser name", "Chrome");
	con.addClassifications("Browser version", "91.0");
	con.addClassifications("sprint number", "24");
	
	List<String> list=new ArrayList<String>();
	list.add(jsonpath);
	
	ReportBuilder r=new ReportBuilder(list, con);
	r.generateReports();


}

}