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

//Signup / Login
    @FindBy(xpath ="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a/text()")
    public WebElement Signup;



}