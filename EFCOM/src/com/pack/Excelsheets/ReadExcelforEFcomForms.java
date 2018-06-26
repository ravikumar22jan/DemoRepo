package com.pack.Excelsheets;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelforEFcomForms 
{
	public List<EFcomFormsFillingExcel> readExcel(String filePath, String fileName, String sheetName) throws EncryptedDocumentException, InvalidFormatException, IOException  
	{

		List<EFcomFormsFillingExcel> model = new ArrayList<EFcomFormsFillingExcel>();
		EFcomFormsFillingExcel modeler = new EFcomFormsFillingExcel();

		String filename = filePath + "\\" + fileName;
		File file = new File(filename);

		InputStream inputStream = null;
		try 
		{
			inputStream = new FileInputStream(file);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}

//		XSSFWorkbook workbook = null;
		Workbook workbook = null;

		String fileExtensionName = fileName.substring(fileName.indexOf("."));
//		System.out.println(fileExtensionName);
//		System.out.println(filename);
		DataFormatter objDefaultFormat = new DataFormatter();

		if (fileExtensionName.equals(".xlsx")) 
		{
			try 
			{
				workbook = new XSSFWorkbook(inputStream);
			} 
			catch (IOException e)
			{
				e.printStackTrace();
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		 if (fileExtensionName.equals(".xls"))
		{
			try 
			{
//				System.out.println("1");
				workbook = new HSSFWorkbook(inputStream);
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("::::: Provided File is not of excel format :::::");
		}
		Sheet sheet = workbook.getSheet(sheetName);

		FormFillingDetails rowcount = new FormFillingDetails();
		
		int rowCount = rowcount.getRowCount(sheetName);
		int count =0;
		
//		System.out.println(rowCount);
		
		for (int i = 1; i <=rowCount ; i++) 
		{
			Row row = sheet.getRow(i);
			
			for (int j = 0; j < 16; j++) 
			{
				String cellString = objDefaultFormat.formatCellValue(row.getCell(j));
//				String cellString = row.getCell(j).toString();
				
				if (j == 0) 
				{
					modeler.setFormType(cellString);
				} 
				
				else if (j == 1)
				{
					modeler.setURL(cellString);
				}

				else if (j == 2) 
				{
					modeler.setfirstname(cellString);
				} 
				else if (j == 3) 
				{
					modeler.setlastname(cellString);
				} 
				else if (j == 4) 
				{
					modeler.setSetStreetAddress(cellString);
				} 
				else if (j == 5)
				{
					modeler.setHouseNumber(cellString);
				}
				else if (j == 6)
				{
					modeler.setcityname(cellString);
				}
				else if (j == 7) 
				{
					modeler.setZip(cellString);
				}
				else if (j == 8) 
				{
					modeler.setMobileNumber(cellString);
				}
				else if (j == 9) 
				{
					modeler.setEmail(cellString);
				}
				else if (j == 10) 
				{
					modeler.setDate(cellString);
				}
				else if (j == 11) 
				{
					modeler.setMonth(cellString);
				}
				else if (j == 12) 
				{
					modeler.setYear(cellString);
				}
				else if (j == 13) 
				{
					modeler.setHowUHeard(cellString);
				}
				else if (j == 14) 
				{
					modeler.setGender(cellString);
				}
				else if (j == 15) 
				{
					modeler.setDestination(cellString);
				}
				else if (j == 16) 
				{
					modeler.setCourse(cellString);
				}
				else if (j == 17) 
				{
					modeler.setPeriod(cellString);
				}
				else if (j == 18) 
				{
					modeler.setAccomodation(cellString);
				}
				else if (j == 19) 
				{
					modeler.setStartDate(cellString);
				}
				
			}
			model.add(modeler);
			modeler = new EFcomFormsFillingExcel();
		}
			
//			System.out.println(count++);
//	}
		
		return model;
}



}
