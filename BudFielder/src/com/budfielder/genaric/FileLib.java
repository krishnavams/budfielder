package com.budfielder.genaric;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib extends BaseClass {
	public String getExtranalData(String SheetName, int RowNumber, int CellNumber)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./Support/GenaricData1.xlsx");
		return WorkbookFactory.create(fis).getSheet(SheetName).getRow(RowNumber).getCell(CellNumber)
				.getStringCellValue();
	}
	public void setExtranalData(String SheetName, int RowNumber, int CellNumber, String SetValue)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./Support/GenaricData1.xlsx");
		WorkbookFactory.create(fis).getSheet(SheetName).getRow(RowNumber).getCell(CellNumber)
				.setCellValue(SetValue);
	}
}
