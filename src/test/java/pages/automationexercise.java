package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class automationexercise {

    public automationexercise(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath ="//header[@id='header']")
    public WebElement homepage;



}