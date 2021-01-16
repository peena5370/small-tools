package com.tispackages;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class TIS_Interface {
	
	private JLabel processLabel = new JLabel("");
	private JLabel customerLabel = new JLabel("");
	private JLabel partNumberLabel = new JLabel("");
	private static JLabel panelLabel = new JLabel("24");
	private JButton resultButton = new JButton("PASS");
	private static JTextField boardNumb = new JTextField(3);
	private JTextField serialNumb = new JTextField(15);
	
	public ArrayList<String> newArrList = new ArrayList<String>();

	public static void main(String[] args) {
		new TIS_Interface();
		

	}
	
	public TIS_Interface() {
		
		
		JFrame frame = new JFrame("Process Checking Tool - MESTIS_v1.0");
		
		JPanel processPanel = new JPanel();
		processPanel.setBorder(new EmptyBorder(5,5,0,5));
		processPanel.setLayout(new GridLayout(1, 4, 5, 5));
		
		JLabel label4 = new JLabel("PROCESS:");
		processPanel.add(label4);
		String[] smtProcess = {"AOI_B","AOI_T","XRAY1"};
		JComboBox combo3 = new JComboBox(smtProcess);
		combo3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String actionProcess = combo3.getSelectedItem().toString();
				processLabel.setText(actionProcess);
				System.out.println("Process: " + actionProcess);
			}
			
		});
		
		processPanel.add(combo3);
		
		JTextField panelNumb = new JTextField(3);
		panelNumb.setFont(new Font("Arial",Font.PLAIN,18));
		processPanel.add(panelNumb);

		

		boardNumb.setFont(new Font("Arial",Font.PLAIN,18));
		boardNumb.setText("0");
		processPanel.add(boardNumb);
		frame.getContentPane().add(processPanel, BorderLayout.NORTH);
		
		JPanel labelPanel = new JPanel();
		labelPanel.setBorder(new EmptyBorder(5,5,-35,5));
		labelPanel.setLayout(new GridLayout(4, 1, 5, 5));	
		JLabel label1 = new JLabel("CUSTOMER:");
		labelPanel.add(label1);
		JLabel label2 = new JLabel("PART NUMBER:");
		labelPanel.add(label2);
		JLabel label3 = new JLabel("SERIAL:");
		labelPanel.add(label3);	
		frame.getContentPane().add(labelPanel, BorderLayout.WEST);;
		
		JPanel inputPanel = new JPanel();
		inputPanel.setBorder(new EmptyBorder(5,5,-35,15));
		inputPanel.setLayout(new GridLayout(4, 1, 5, 5));	
		JComboBox combo1 = new JComboBox();
		String filePath1 = "src/res/customer.txt";
		File customerFile = new File(filePath1);
		try {
			BufferedReader reader = new BufferedReader(new FileReader(customerFile));
			Object[] lines = reader.lines().toArray();
			
			for(int i=0; i<lines.length; i++) {
				String line = lines[i].toString();
				combo1.addItem(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		combo1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String actionCustomer = combo1.getSelectedItem().toString();
				customerLabel.setText(actionCustomer);
				System.out.println("Customer: " + actionCustomer);
			}
			
		});
		inputPanel.add(combo1);	
		JComboBox combo2 = new JComboBox();
		String filePath2 = "src/res/divNumb.txt";
		File divNumber = new File(filePath2);	
		try {
			BufferedReader reader = new BufferedReader(new FileReader(divNumber));
			Object[] lines = reader.lines().toArray();
			
			for(int j=0; j<lines.length; j++) {
				String line = lines[j].toString();
				combo2.addItem(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		combo2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
//				still left setup panel number at 
				String actionPartNumber = combo2.getSelectedItem().toString();
				partNumberLabel.setText(actionPartNumber);
					
				String filePath3 = "src/res/config.txt";
				File configString = new File(filePath3);
				try {
					BufferedReader reader2 = new BufferedReader(new FileReader(configString));
					Object[] lines2 = reader2.lines().toArray();
					
					for(int j=0; j<lines2.length; j++) {
						String newLine = lines2[j].toString();
						Pattern pattern = Pattern.compile("\\S+\\=\\d+", Pattern.CASE_INSENSITIVE);
						Matcher matcher = pattern.matcher(newLine);
						boolean matchFound = matcher.find();
						if(matchFound) {
							String stringPartNumber = matcher.group();
							String[] splitPartNumber = stringPartNumber.split("\\=");
							String partNumber = splitPartNumber[0];
							int i = Integer.parseInt(splitPartNumber[1]);
							if(actionPartNumber.equals(partNumber)) {
								panelNumb.setText(splitPartNumber[1]);
								getPanelLabel().setText(splitPartNumber[1]);
								System.out.println("Panel number: " + i);
							}
						}
						
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				
				System.out.println("Part Number: " + actionPartNumber);
			}
			
		});
		inputPanel.add(combo2);
		
		
		serialNumb.setFont(new Font("Arial",Font.PLAIN,18));
		serialNumb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String serial = serialNumb.getText().toString();
				String customer = customerLabel.getText();
				String partNumb = partNumberLabel.getText();
				String process = processLabel.getText();
				serialNumb.selectAll();
				System.out.println("Serial:" + serial);
				if(serial.contentEquals("1")) {
					newArrList.add(serialNumb.getText());
						int j = Integer.parseInt(boardNumb.getText()) + 1;
						String k = Integer.toString(j);
						boardNumb.setText(k);
						while(boardNumb.getText().contentEquals(panelNumb.getText())) {
							boardNumb.setText("0");
						}
						aoiBarcode(partNumb, boardNumb, serial);
				}else {
					new SoapTIS().SOAPTIS(process, customer, serial, partNumb);
					
					File resultPath = new File("D:\\Temp\\AOI_AXI\\Result.xml");
					try {
						SAXReader reader = new SAXReader();
						Document doc = reader.read(resultPath);
						Element envelope = doc.getRootElement();
						
						Iterator it = envelope.elementIterator();
//							iterator get element node <soap:body>
							Element elemNode = (Element) it.next();
//							go deeper....
							Iterator itt = elemNode.elementIterator();
//							iterator get inner element node <OKToTestResponse>
							Element innerNode = (Element) itt.next();
//							go deeper....
							Iterator deeperNode = innerNode.elementIterator();
							while(deeperNode.hasNext()) {
								Element lastChild = (Element) deeperNode.next();
								if(lastChild.getStringValue().equals("PASS")) {
//								must use equals, if use "==" will going to fail result
									resultButton.setBackground(Color.GREEN);
									resultButton.setText("PASS");
									int j = Integer.parseInt(boardNumb.getText()) + 1;
									String k = Integer.toString(j);
									boardNumb.setText(k);
									while(boardNumb.getText().contentEquals(panelNumb.getText())) {
										boardNumb.setText("0");
									}
								} else {
									resultButton.setBackground(Color.RED);
									resultButton.setText("FAIL");
									JOptionPane.showMessageDialog(null, lastChild.getStringValue() + ".\nPlease check the board with technician.");
								}
							}
						} catch (DocumentException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
						}
					newArrList.add(serialNumb.getText());
					aoiBarcode(partNumb, boardNumb, serial);
				}
			}
			
		});
		inputPanel.add(serialNumb);
		frame.getContentPane().add(inputPanel, BorderLayout.CENTER);
		
		
		JPanel statusPanel = new JPanel();
		statusPanel.setBorder(new EmptyBorder(5,0,5,5));
		statusPanel.setLayout(new GridLayout(2, 1, 0, 5));
		
		JButton TISButton = new JButton("TIS");
		TISButton.setBackground(Color.BLUE);
		TISButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Integer count = 0;
				String serial = serialNumb.getText().toString();
				String customer = customerLabel.getText();
				String partNumb = partNumberLabel.getText();
				String process = processLabel.getText();
				serialNumb.selectAll();
				System.out.println("Serial:" + serial);
				if(serial.contentEquals("1")) {
					int j = Integer.parseInt(boardNumb.getText()) + 1;
					String k = Integer.toString(j);
					boardNumb.setText(k);
					while(boardNumb.getText().contentEquals(panelNumb.getText())) {
						boardNumb.setText("0");
					}
				}else {
					new SoapTIS().SOAPTIS(process, customer, serial, partNumb);	
					
					File resultPath = new File("D:\\Temp\\AOI_AXI\\Result.xml");
					try {
						SAXReader reader = new SAXReader();
						Document doc = reader.read(resultPath);
						Element envelope = doc.getRootElement();
						
						Iterator it = envelope.elementIterator();
//							iterator get element node <soap:body>
							Element elemNode = (Element) it.next();
//							go deeper....
							Iterator itt = elemNode.elementIterator();
//							iterator get inner element node <OKToTestResponse>
							Element innerNode = (Element) itt.next();
//							go deeper....
							Iterator deeperNode = innerNode.elementIterator();
							while(deeperNode.hasNext()) {
								Element lastChild = (Element) deeperNode.next();
								if(lastChild.getStringValue().equals("PASS")) {
//								must use equals, if use "==" will going to fail result
									resultButton.setBackground(Color.GREEN);
									resultButton.setText("PASS");
									int j = Integer.parseInt(boardNumb.getText()) + 1;
									String k = Integer.toString(j);
									boardNumb.setText(k);
									while(boardNumb.getText().contentEquals(panelNumb.getText())) {
										boardNumb.setText("0");
									}
								} else {
									resultButton.setBackground(Color.RED);
									resultButton.setText("FAIL");
									JOptionPane.showMessageDialog(null, lastChild.getStringValue() + ".\nPlease check the board with technician.");
								}
							}
						} catch (DocumentException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
						}
				}
			}	
		});
		
		
		resultButton.setBackground(Color.GREEN);

		statusPanel.add(TISButton);
		statusPanel.add(resultButton);
		frame.getContentPane().add(statusPanel, BorderLayout.EAST);

		frame.setBounds(850,150,400,200);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static JLabel getPanelLabel() {
		return panelLabel;
	}

	public void setPanelLabel(JLabel panelLabel) {
		this.panelLabel = panelLabel;
	}
	
	public static JTextField getBoardNumb() {
		return boardNumb;
	}
	
	public void setBoardNumb(JTextField boardNumb) {
		this.boardNumb = boardNumb;
	}
	
	public void aoiBarcode(String partNumb, JTextField boardNumb, String serial) {
		File filePath = new File("src/res/barcodelist.bar");
		try {
			SimpleDateFormat dateTimeFormmater = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
			Date nowTime = new Date();
			String localTime = dateTimeFormmater.format(nowTime);
			FileWriter fileWriter = new FileWriter(filePath);
				fileWriter.write("#Board: " + partNumb + ", " + localTime + "\r\n\r\n" + "#Number Of Panel	Barcode\r\n");
				
					for(String arr : newArrList) {
						String boardNumber = panelLabel.getText();
						int integerNumber = Integer.parseInt(boardNumber);
						for(int j=0;j<integerNumber;j++) {
							fileWriter.write("Barcode#" + j + "	*" + arr + "\r\n");
						}
							
					}
					
				fileWriter.write("#End");
				fileWriter.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
