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
import org.openqa.selenium.support.ui.Select;

public class AdactinTest extends LoginPojo {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver d = chromeBrowser();
		launchUrl("https://adactinhotelapp.com/index.php");
		maxWindow();
		/*WebElement txtUser = d.findElement(By.id("username"));
		fill(txtUser, "TestCaseUser");
		WebElement txtPass = d.findElement(By.id("password"));
		fill(txtPass, "password");
		WebElement btnLogin = d.findElement(By.id("login"));
		btnClick(btnLogin);*/
		LoginPojo l = new LoginPojo();
		fill(l.getUsername(), readFromExcel(1, 0));
		fill(l.getPassword(), readFromExcel(1, 1));
		btnClick(l.getLogin());
		sleep();
		//WebElement loc = d.findElement(By.id("location"));
		selectByValue(l.getLoc(), "Brisbane");
		//WebElement hotls = d.findElement(By.id("hotels"));
		selectByValue(l.getHotls(), "Hotel Hervey");
		//WebElement room = d.findElement(By.id("room_type"));
		selectByValue(l.getRoom(), "Super Deluxe");
		//WebElement noofRoom = d.findElement(By.id("room_nos"));
		selectByIndex(l.getNoofRoom(), 3);
		//WebElement chckinD = d.findElement(By.id("datepick_in"));
		fill(l.getChckinD(), "04/01/2021");
		//WebElement chckoutD = d.findElement(By.id("datepick_out"));
		fill(l.getChckoutD(), "05/01/2021");
		//WebElement adltsRoom = d.findElement(By.id("adult_room"));
		selectByVisibleText(l.getAdltsRoom(), "4 - Four");
		//WebElement chldRoom = d.findElement(By.id("child_room"));
		selectByIndex(l.getChldRoom(), 2);
		//WebElement submt = d.findElement(By.id("Submit"));
		btnClick(l.getSubmt());
		sleep();
		//WebElement radClck = d.findElement(By.xpath("//input[@id='radiobutton_0']"));
		btnClick(l.getRadClck());
		//WebElement btnCont = d.findElement(By.id("continue"));
		btnClick(l.getBtnCont());
		/*WebElement fName = d.findElement(By.id("first_name"));
		fill(fName, "Vicky");
		WebElement lName = d.findElement(By.id("last_name"));
		fill(lName, "NF");
		WebElement TxtAdd = d.findElement(By.id("address"));
		fill(TxtAdd, "Pallikaranai");
		WebElement ccNum = d.findElement(By.id("cc_num"));
		fill(ccNum, "1122334455667788");*/
		fill(l.getFirst_name(), "Vicky");
		fill(l.getLast_name(), "NF");
		fill(l.getAddress(), "Pallikaranai");
		fill(l.getCc_num(), "1122334455667788");
		//WebElement ccType = d.findElement(By.id("cc_type"));
		selectByVisibleText(l.getCcType(), "Master Card");
		//WebElement ccMon = d.findElement(By.id("cc_exp_month"));
		selectByValue(l.getCcMon(), "9");
		//WebElement ccYear = d.findElement(By.id("cc_exp_year"));
		selectByVisibleText(l.getCcYear(), "2018");
		//WebElement ccNo = d.findElement(By.id("cc_cvv"));
		//fill(ccNo, "0987654");
		File f = new File("C:\\Users\\hp\\SeleniumFrameWork\\Framework\\Excel\\Test.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fin);
		Sheet sh = book.getSheet("Name");
		Row r = sh.getRow(0);
		Cell c =r.getCell(0);
		int cellType = c.getCellType();
		if (cellType==0) {
			double dVal = c.getNumericCellValue();
			long lVal = (long)dVal;
			String sVal = String.valueOf(lVal);
			fill(l.getCc_cvv(), sVal);
			
		}
		//WebElement btnBookN = d.findElement(By.id("book_now"));
		btnClick(l.getBtnBookN());
		sleep();
		//WebElement ordNo = d.findElement(By.id("order_no"));
		att(l.getOrdNo());

	}

	

}
