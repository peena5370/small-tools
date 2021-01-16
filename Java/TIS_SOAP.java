/*
* Developed by: peena5370
* Published date: 8/Jan/2021
*/
package com.packages;

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
	/*
	 * Create a SOAP services with certain parameter such as barcode, route process, customer name, and part number.
	 * The function of SOAPTIS() is acting like the web service, it will create and xml request and post it to the url and get response request from the web server.
	 * After process the SOAP servies, it also takes the response result and create an xml file for the result get.
	 * */
public class TIS_SOAP {
	
	public void SOAPTIS(String process, String custName, String serialNumb, String partNumb) {
		try {
//			declare division name, since the division name is same as the customer name, then adding customer name to the division name
			String divName = custName.toString();
//			get the local machine address and tester machine name
			InetAddress ip = InetAddress.getLocalHost();
//			declare tester as the machine name
			String tester = ip.getHostName();
//			set the soap web service url address for perform soap services
			String url = "SOAP web service url goes here";
			URL obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
//			set request method for the xml soap services same as the format provided on the web service
			con.setRequestMethod("POST");
//			set property type same as the details provided from the web service
			con.setRequestProperty("Content-Type", "application/soap+xml; charset=utf-8");
//			set the xml POST request data based on the format of writing the soap web service
			String xmlRequest = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n" + 
					"<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\r\n" + 
					"  <soap12:Body>\r\n" + 
					"    <TestProcess xmlns=\"process url">\r\n" + 
					"      <CustomerName>" + custName + "</CustomerName>\r\n" + 
					"      <Division>"+ divName + "</Division>\r\n" + 
					"      <SerialNumber>" + serialNumb + "</SerialNumber>\r\n" + 
					"      <AssemblyNumber>"+ partNumb + "</AssemblyNumber>\r\n" + 
					"      <TesterName>" + tester + "</TesterName>\r\n" + 
					"      <ProcessStep>" + process + "</ProcessStep>\r\n" + 
					"    </TestProcess>\r\n" + 
					"  </soap12:Body>\r\n" + 
					"</soap12:Envelope>";
			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(xmlRequest);
			wr.flush();
			wr.close();
//			get response status from the GET request
			String responseStatus = con.getResponseMessage();
//			System.out.println(responseStatus);
			BufferedReader in = new BufferedReader(new InputStreamReader (con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
			while((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			
//			create xml document from the soap response result 
			String xmlLocation = "src/res/result.xml";
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
