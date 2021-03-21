package org.seleniumj.framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPojo extends BaseClass {
	public SearchHotelPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement loc;
	@FindBy(id="hotels")
	private WebElement hotls;
	@FindBy(id="room_type")
	private WebElement room;
	@FindBy(id="room_nos")
	private WebElement noofRoom;
	@FindBy(id="datepick_in")
	private WebElement chckinD;
	@FindBy(id="datepick_out")
	private WebElement chckoutD;
	@FindBy(id="adult_room")
	private WebElement adltsRoom;
	@FindBy(id="child_room")
	private WebElement chldRoom;
	@FindBy(id="Submit")
	private WebElement submt;
	@FindBy(id="Reset")
	private WebElement reset;
	public WebElement getLoc() {
		return loc;
	}
	public WebElement getHotls() {
		return hotls;
	}
	public WebElement getRoom() {
		return room;
	}
	public WebElement getNoofRoom() {
		return noofRoom;
	}
	public WebElement getChckinD() {
		return chckinD;
	}
	public WebElement getChckoutD() {
		return chckoutD;
	}
	public WebElement getAdltsRoom() {
		return adltsRoom;
	}
	public WebElement getChldRoom() {
		return chldRoom;
	}
	public WebElement getSubmt() {
		return submt;
	}
	public WebElement getReset() {
		return reset;
	}
	
}
	
	
