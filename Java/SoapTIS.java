package com.tispackages;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;

import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;

import sun.net.www.protocol.http.HttpURLConnection;

public class SoapTIS {
	
	public void SOAPTIS(String process, String custName, String serialNumb, String partNumb) {
//	public SoapTIS() {
//		String process = "AOI_T";
//		String custName = "YQM";		
//		String serialNumb = "Y200602MY";
//		String serialNumb = "TESTBARCODE";
//		String partNumb = "PYQMIP96B-N";
		String tester = "SG40305008";
	
		try {
			String divName = custName.toString();
//			InetAddress ip = InetAddress.getLocalHost();
//			String tester = ip.getHostName();
			String url = "http://sgsind0sgptis01/MES-TIS/TIS.asmx?op=OKToTest";
			URL obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Content-Type", "application/soap+xml; charset=utf-8");
			String xmlRequest = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n" + 
					"<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\r\n" + 
					"  <soap12:Body>\r\n" + 
					"    <OKToTest xmlns=\"http://jabil.com/GMS/MES_TIS\">\r\n" + 
					"      <CustomerName>" + custName + "</CustomerName>\r\n" + 
					"      <Division>"+ divName + "</Division>\r\n" + 
					"      <SerialNumber>" + serialNumb + "</SerialNumber>\r\n" + 
					"      <AssemblyNumber>"+ partNumb + "</AssemblyNumber>\r\n" + 
					"      <TesterName>" + tester + "</TesterName>\r\n" + 
					"      <ProcessStep>" + process + "</ProcessStep>\r\n" + 
					"    </OKToTest>\r\n" + 
					"  </soap12:Body>\r\n" + 
					"</soap12:Envelope>";
			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(xmlRequest);
			wr.flush();
			wr.close();
			String responseStatus = con.getResponseMessage();
			BufferedReader in = new BufferedReader(new InputStreamReader (con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
			while((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			
//			create xml document from the soap response result 
			String xmlLocation = "D:\\Temp\\AOI_AXI\\Result.xml";
			Document newXmlDoc = DocumentHelper.parseText(response.toString());
			OutputXml(newXmlDoc,xmlLocation);				
		} catch (Exception e) {
			e.printStackTrace();;
		}
	}	
	
/*
 * Create xml files from the soap response output 
 * */
	private static void OutputXml(Document doc, String filename) {
		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("UTF-8");
		XMLWriter writer;
		try {
			writer = new XMLWriter(new FileWriter(new File(filename)), format);
			writer.write(doc);
			writer.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
