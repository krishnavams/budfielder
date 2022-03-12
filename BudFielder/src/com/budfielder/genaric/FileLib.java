package com.budfielder.genaric;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib extends BaseClass {
	String PathOfFile;

	public FileLib(String pathOfFile) {
		super();
		PathOfFile = pathOfFile;
	}

	public String getExtranalData(String SheetName, int RowNumber, int CellNumber)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(PathOfFile);
		return WorkbookFactory.create(fis).getSheet(SheetName).getRow(RowNumber).getCell(CellNumber)
				.getStringCellValue();
	}

	public void setExtranalData(String SheetName, int RowNumber, int CellNumber, String SetValue)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(PathOfFile);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(SheetName).getRow(RowNumber).getCell(CellNumber).setCellValue(SetValue);
		FileOutputStream fos = new FileOutputStream(PathOfFile);
		wb.write(fos);
		wb.close();
	}
}
