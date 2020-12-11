/******** Java File ********/
/*
 * <-- packages -->
 * import java.io.File;													--> to create file
 * import java.io.FileWriter;											--> write to a file
 * import java.io.IOException;											--> IO exception (try...catch)
 * 
 * <-- syntax -->
 * File myObj = new File("C:\\Users\\MyName\\filename.txt");			-->declare object with specific directory(Mac/ Linux - dir(/Users/name/filename.txt)
 * canRead()															--> check file readable,return true/false
 * canWrite()															--> check file writeable,return true/false
 * obj.createNewFile()													--> create new file 
 * obj.delete()															--> delete file / folder(folder must be empty)
 * obj.exists()															--> check file existance
 * obj.getName()														--> get file name
 * obj.getAbsolutePath()												--> get path of file
 * obj.length()															--> get size of file in bytes
 * mkdir()
 * FileReader
 * FileWriter
 * BufferedReader
 * BufferedWriter
 * FileInputStream
 * FileOutputStream
 * 
 *  import java.io.File;
 *	import java.io.IOException;
 *	
 *	public class hellotest {
 *		public static void main(String[] args) {
 *			try {
 *				File newObj = new File("D:\\Temp\\AOI+AXI\\newfile.txt");			-->make directory
 *				if (newObj.createNewFile()) {										--> if object create new file = true
 *					System.out.println("File created: " + newObj.getName());		--> output
 *				}
 *				else {
 *					System.out.println("File already exists.");						--> if false, output code
 *				}
 *			}catch (IOException e) {
 *				System.out.println("An error occured.");							--> if error occur, throw exception
 *				e.printStackTrace();
 *			}
 *		}
 *	}
 *
 * <-- Input stream -->
 * <-- Syntax -->
 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		--> Reader to read input
 * InputStream f = new FileInputStream("C:\\Users\\MyName\\filename.txt");			--> Input stream to read file
 * File f = new File("C:\\Users\\MyName\\filename.txt");							--> create a file directory 
 * InputStream out = new FileInputStream(f);										--> Input stream to read file
 * 
 *  import java.io.*; 
 *
 *	public class hellotest {
 *		public static void main(String args[]) throws IOException {
 *			char c;																		
 *			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	--> input stream(like Scanner)
 *			System.out.println("Input charater and press 'q' to exit.");			
 *			do {
 *				c = (char) br.read();													--> read input
 *				System.out.print(c);													--> write input 
 *			}while(c != 'q');															--> if 'q' press,exit loop
 *		}
 *	}
 *	--> output 
 *	Input character and press 'q' to exit.
 *	H202031IA		<-- input
 *	H202031IA		<-- output
 *	q				<-- input
 *	q				<-- output and exit
 *
 *< -- Output Stream -->
 *<-- Syntax -->
 * OutputStream f = new FileOutputStream("C:\\Users\\MyName\\filename.txt");
 * File f = new File("C:\\Users\\MyName\\filename.txt");
 * OutputStream out = new FileOutputStream(f);
 * 
 * <-- Input and Output String to file without unicode, output file will become ä¹±ç � if array declared as int and byte -->
 *  import java.io.FileWriter;
 *	import java.io.IOException;
 *	
 *	public class hellotest {
 *		public static void main(String[] args) {
 *			try {
 *				String[] iWrite = { "11", "21", "3", "40", "5" };
 *				FileWriter myWriter = new FileWriter("D:\\Temp\\AOI+AXI\\newfile2.txt");
 *				for(int x = 0; x < iWrite.length; x++) {
 *					myWriter.append(iWrite[x]);
 *					myWriter.append("\r\n");
 *				}
 *				myWriter.write("#End");
 *				myWriter.close();
 *				System.out.println("Successful write to file.");
 *			}catch (IOException e) {
 *				System.out.println("An error occured.");
 *				e.printStackTrace();
 *			}
 *		}
 *	}
 * 
 * 
 * <-- Input and Output to file with Unicode -->
 *  import java.io.*;
 *
 *	public class OtherClass {
 *		public static void main(String[] args) throws IOException {
 *			File f = new File("D:\\Temp\\AOI+AXI\\newfile.txt");
 *			FileOutputStream fop = new FileOutputStream(f);
 *			
 *			OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");
 *			writer.append("ä¸­æ–‡è¾“å…¥");
 *			writer.append("\r\n");
 *			writer.append("English");
 *			writer.close();
 *			
 *			fop.close();
 *			
 *			FileInputStream fip = new FileInputStream(f);
 *			InputStreamReader reader = new InputStreamReader(fip, "UTF-8");
 *			
 *			StringBuffer sb = new StringBuffer();
 *				while(reader.ready()) {
 *					sb.append((char) reader.read());
 *				}
 *				System.out.println(sb.toString());
 *				reader.close();
 *				fip.close();
 *		}
 *	}
 * 
 * <-- Read a File content -->
 *  import java.io.File;
 *	import java.io.FileNotFoundException;
 *	import java.util.Scanner;
 *	
 *	public class hellotest {
 *		public static void main(String[] args) {
 *			try {
 *			File obj = new File("D:\\Temp\\AOI+AXI\\newfile2.txt");
 *			Scanner myReader = new Scanner(obj);						--> using Scanner to read file data
 *			while (myReader.hasNextLine()) {
 *				String data = myReader.nextLine();
 *				System.out.println(data);
 *			}
 *			myReader.close();
 *			}catch (FileNotFoundException e) {
 *				System.out.println("An error occured.");
 *				e.printStackTrace();
 *			}
 *		}
 *	}
 *	
 *<-- Delete file / folder -->
 * import java.io.File;
 *
 *	public class hellotest {
 *		public static void main(String[] args) {
 *			File obj = new File("D:\\Temp\\AOI+AXI\\newfile.txt");
 *			if(obj.delete()) {
 *				System.out.println("Deleted file: " + obj);
 *			}
 *			else {
 *				System.out.println("Failed to delete file.");
 *			}
 *		}
 *	}	
 * */

package learning.tutorialpoints;
import java.io.*;

public class OtherClass {
	public static void main(String[] args) throws IOException {
		File f = new File("D:\\Temp\\AOI+AXI\\newfile.txt");
		FileOutputStream fop = new FileOutputStream(f);
		
		OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");
		writer.append("ä¸­æ–‡è¾“å…¥");
		writer.append("\r\n");
		writer.append("English");
		writer.close();
		
		fop.close();
		
		FileInputStream fip = new FileInputStream(f);
		InputStreamReader reader = new InputStreamReader(fip, "UTF-8");
		
		StringBuffer sb = new StringBuffer();
			while(reader.ready()) {
				sb.append((char) reader.read());
			}
			System.out.println(sb.toString());
			reader.close();
			fip.close();
	}
}