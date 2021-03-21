package org.seleniumj.framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
	                      //LoginPage
	@FindBy(id="username")
	private WebElement username;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(id="login")
	private WebElement login;
	
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	
	
	                    //SearcHotelPage
	
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
	
	@FindBy(xpath="//input[@id='radiobutton_0']")
	private WebElement radClck;
	@FindBy(id="continue")
	private WebElement btnCont;
	@FindBy(id="cancel")
	private WebElement btnCan;
	public WebElement getBtnCan() {
		return btnCan;
	}
	public WebElement getRadClck() {
		return radClck;
	}
	public WebElement getBtnCont() {
		return btnCont;
	}
	
	//Book an hotel
	
	
	@FindBy(id="first_name")
	private WebElement first_name;
	@FindBy(id="last_name")
	private WebElement last_name;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement cc_num;
	@FindBy(id="cc_cvv")
	private WebElement cc_cvv;
	@FindBy(id="cc_type")
	private WebElement ccType;
	@FindBy(id="cc_exp_month")
	private WebElement ccMon;
	@FindBy(id="cc_exp_year")
	private WebElement ccYear;
	@FindBy(id="book_now")
	private WebElement btnBookN;
	@FindBy(id="order_no")
	private WebElement ordNo;
	@FindBy(id="cancel")
	private WebElement BTNcancel;
	public WebElement getBTNcancel() {
		return BTNcancel;
	}
	public WebElement getCcType() {
		return ccType;
	}
	public WebElement getCcMon() {
		return ccMon;
	}
	public WebElement getCcYear() {
		return ccYear;
	}
	public WebElement getBtnBookN() {
		return btnBookN;
	}
	public WebElement getOrdNo() {
		return ordNo;
	}
	public WebElement getCc_cvv() {
		return cc_cvv;
	}
	public WebElement getFirst_name() {
		return first_name;
	}
	public WebElement getLast_name() {
		return last_name;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCc_num() {
		return cc_num;
	}

	

}
