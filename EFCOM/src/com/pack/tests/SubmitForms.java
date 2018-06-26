package com.pack.tests;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.pack.Excelsheets.EFcomFormsFillingExcel;
import com.pack.Excelsheets.ReadExcelforEFcomForms;
import com.pack.PageObjects.EfComPages;
import com.pack.testBase.testBase;

public class SubmitForms extends testBase
{

	@Test
	public void FillEfcomForms() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException 
	{
		EfComPages page = new EfComPages(driver);
		
//		ReadExcelforEFcomForms excel = new ReadExcelforEFcomForms();
//		List<EFcomFormsFillingExcel> datas = excel.readExcel("C:\\Users\\praveen.h\\workspace\\EFCOM\\Datas", "EfComDatas.xls", "FormDetails");
		
//		page.fillBrochureForms();
		page.fillPriceQuotationForms();
//		for(EFcomFormsFillingExcel m : datas)
//		{
//			System.out.println(m.getfirstname());
//			System.out.println(m.getlastname());
//		}
		
		
	}
}
