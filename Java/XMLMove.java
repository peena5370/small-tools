package com.xmlmove;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/*
 *  1. get file list in the folder
 *  2. if file exists, output xml name for document read process
 *  3. create xml reader object and read through the xml files
 *  4. get root element inside the xml document
 *  5. find parent node attributes
 *  6. get attributes value and grab only certain part data from it
 *  7. output the data(string) and use it for creating new file
 *  8. if file exists, move file to new directory, else create new file directory and move file to new directory
 *  9. if current directory no files, sleep, else run again process (8)		--> not yet implement, temporary use windows task scheduler
 * */

public class XMLMove {	
	public static void main(String[] args) {
		final String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};	
		// get file directories 
		File sourcePath = new File("C:\\XML");
		// output all files inside the directory into array list
		File fileList[] =sourcePath.listFiles();
		for(File file : fileList) {
			// get xml file name
			String fileName = file.getName();
			//create SAXReader reader object
			SAXReader reader = new SAXReader();
			try {
				Document document = reader.read(new File("C:\\XML\\" + fileName));
				// get all attributes and attributes value on parent node(BoardTestXMLExport)
				Element boardTestXMLExport = document.getRootElement();
				// get root element attribute with specific known name
				Attribute parentAttr = boardTestXMLExport.attribute("testTime");
				// get the attribute value(value pattern yyyy-mm-ddThh:mm:ss.......) 
				String attrValue = parentAttr.getValue();
				
				// declare regex pattern for testTime since we only need yyyy-mm-dd from the xml
				Pattern pattern = Pattern.compile("\\d+\\-\\d+\\-\\d+", Pattern.CASE_INSENSITIVE);
				Matcher matcher = pattern.matcher(attrValue);
				boolean matchFound = matcher.find();
				if(matchFound) {
					// split the date into string array (arr[0] = year, arr[1] = month, arr[2] = day)
					String dateString = matcher.group();
					// string pattern is like this yyyy-mm-dd, need to split out the strings into array
					String[] splitDate = dateString.split("\\-");
					// parse splitDate[1](month) into integer
					int i = Integer.parseInt(splitDate[1]);
					for(int j=0; j<months.length; j++) {
						// j is whole number, while need to use in array, need to -1 for the value to get it match with the array position
						if(j == i-1) {
							String fileYears = splitDate[0];
							String fileMonths = months[j].toUpperCase();
							String fileDays = splitDate[2];
							try {
								String sourceDir = "C:/XML/" + fileName;
								File destDir =new File("C:/XML_Backup/" + fileMonths + "_" + fileYears + "/" + fileMonths + "_" + fileDays);
								if(destDir.exists()) {
									String newDestDir = destDir + "/" + fileName;
									Path source = Paths.get(sourceDir);
									Path target = Paths.get(newDestDir);
									
									Files.move(source, target);
								} else {
									// create new directory for the xml file
									File createNewDir = new File("C:/XML_Backup/" + fileMonths + "_" + fileYears + "/" + fileMonths + "_" + fileDays);
									boolean validateDir = createNewDir.mkdirs();
									if(validateDir == true) {
										String createdDir = createNewDir + "/" + fileName;
										Path source = Paths.get(sourceDir);
										Path newtarget = Paths.get(createdDir);
										
										Files.move(source, newtarget);
										System.out.println("Success.");
									} else {
										System.out.println("Failed to convert.");
									}
								}
							} catch (IOException e) {     
								e.printStackTrace();
							}
						}	//end if
					}	//end for
				} else {
					System.out.println("Match not found.");
				}
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}	
	}
}
