package org.seleniumj.framework;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Select s;
	public static Alert al;

	// 1
	public static WebDriver chromeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\eclipse-workspace\\SeleniumFraeWork\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;

	}

	// 2
	public static void launchUrl(String url) {
		driver.get(url);

	}

	// 3
	public static void maxWindow() {
		driver.manage().window().maximize();

	}

	// 4
	public static void fill(WebElement ref, String value) {
		ref.sendKeys(value);

	}

	// 5
	public static void btnClick(WebElement element) {
		element.click();

	}

	// 6
	public static void CUrl() {
		String pageUrl = driver.getCurrentUrl();
		System.out.println(pageUrl);

	}

	// 7
	public static void pageTitle() {
		String tit = driver.getTitle();
		System.out.println(tit);

	}

	// 8
	public static void broswerQuit() {
		driver.quit();

	}

	// 9
	public static void browserClose() {
		driver.close();

	}

	// 10
	public static void clickDouble(WebElement ele) {
		a = new Actions(driver);
		a.doubleClick(ele).perform();
	}

	// 11
	public static void clickContx(WebElement el) {
		a = new Actions(driver);
		a.contextClick(el).perform();
	}

	// 12
	public static void mHover(WebElement mh) {
		a = new Actions(driver);
		a.moveToElement(mh).perform();
	}

	// 13
	public static void dropDrag(WebElement ddsrc, WebElement dddes) {
		a = new Actions(driver);
		a.dragAndDrop(ddsrc, dddes).perform();
	}

	// 14
	public static void kPressCon(WebElement kpc) throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
	}

	// 15
	public static void kReleaseCon(WebElement kpc) throws AWTException {
		r = new Robot();
		r.keyRelease(KeyEvent.VK_CONTROL);
	}

	// 16
	public static void kPressEnt(WebElement kpe) throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
	}

	// 17
	public static void kReleaseEnt(WebElement kpe) throws AWTException {
		r = new Robot();
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	// 18

	public static void dbVal(String val) {
		s.selectByValue(val);

	}

	// 19
	public static void dbVText(String vt) {
		s.selectByVisibleText(vt);

	}

	// 20
	public static void dbIndex(int in) {
		s.selectByIndex(in);

	}

	// 21
	public static void winAlret(String av) {
		al.sendKeys(av);
	}

	// 22
	public static void winAlretacc() {
		al.accept();
	}

	// 23
	public static void winAlretdisms() {
		al.dismiss();
	}

	// 24
	public static void text(WebElement txt) {
		txt.getText();
		System.out.println(txt);
	}

	// 25
	public static void att(WebElement at) {
		String attval = at.getAttribute("value");
		System.out.println("Order No: "+attval);

	}
	// 26
	public static void selectByIndex(WebElement element, int index) {
		s = new Select(element);
		s.selectByIndex(index);

	}
	// 27
	public static void selectByValue(WebElement val, String nam) {
		s = new Select(val);
		s.selectByValue(nam);

	}
	// 28
	public static void selectByVisibleText(WebElement texxt, String vText) {
		s = new Select(texxt);
		s.selectByVisibleText(vText);

	}
	// 29
	public static void sleep() throws InterruptedException {
		Thread.sleep(5000);

	}
	// 30
	public static void refresh() {
		driver.navigate().refresh();
		

	}
	
	public static String readFromExcel(int rowNo, int cellNo) throws IOException {
		File f = new File("C:\\Users\\hp\\SeleniumFrameWork\\Framework\\Excel\\Test.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fin);
		Sheet sh = book.getSheet("Name");
		Row r = sh.getRow(rowNo);
		Cell c =r.getCell(cellNo);
		int cellType = c.getCellType();
		
		String name = "";
		
		if (cellType==1) {
			name = c.getStringCellValue();
		}
		
		else if (DateUtil.isCellDateFormatted(c)) {
			Date date = (Date) c.getDateCellValue();
			SimpleDateFormat form = new SimpleDateFormat("dd-MM-yyyy");
			name = form.format(date);	
			
		}
		else {
			double d = c.getNumericCellValue();
			long lo =(long)d;
			name = String.valueOf(lo);
			
		}
		
		return name;

	}
	
	
	
}
