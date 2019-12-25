package com.comparator.util;

import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.comparator.domain.Account;

public class CommonUtils {

	@SuppressWarnings("deprecation")
	public static List<Account> getAccountList(String path) throws Exception {

		List<Account> accountList = new ArrayList<Account>();

		URI uri = ClassLoader.getSystemResource(path).toURI();
		Workbook workbook = null;
		workbook = WorkbookFactory.create(new File(uri));
		Sheet sheet = workbook.getSheetAt(0);
		Iterator<Row> rowIterator = sheet.iterator();
		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();

		for (int i = 1; i <= rowCount; i++) {
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(0);
			cell.setCellType(CellType.STRING);
			accountList.add(new Account(cell.getStringCellValue(), ""));
		}

		return accountList;
	}

	public static void main(String[] args) throws Exception {

		List<Account> accountList = getAccountList("./templates/POA.csv");
		
		System.out.println(accountList);

	}
}
