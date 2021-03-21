package org.seleniumj.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExecutableClass extends BaseClass {

	public static void main(String[] args) {

		WebDriver d = chromeBrowser();
		launchUrl("https://www.facebook.com");
		maxWindow();
		WebElement txtUser = d.findElement(By.id("email"));
		fill(txtUser, "Vicky");
		WebElement txtPass = d.findElement(By.id("pass"));
		//fill(txtPass, "456789");
		txtPass.sendKeys("Nofear");
		WebElement btnLogin = d.findElement(By.id("u_0_b"));
		btnClick(btnLogin);

	}
}
