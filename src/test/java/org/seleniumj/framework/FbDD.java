package org.seleniumj.framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FbDD extends BaseClass{

	public static void main(String[] args) throws IOException {
		WebDriver d = chromeBrowser();
		launchUrl("https://www.facebook.com");
		maxWindow();
		File f = new File("C:\\Users\\hp\\SeleniumFrameWork\\Framework\\Excel\\Test.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fin);
		Sheet sh = book.getSheet("Name");
		WebElement txtUser = d.findElement(By.id("email"));
		Row r = sh.getRow(0);
		Cell c =r.getCell(0);
		int cellType = c.getCellType();
		if (cellType==1) {
			String userName = c.getStringCellValue();
			fill(txtUser, userName);
		}
	}
		
}
