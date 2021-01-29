	package pageObjects;
	
	
    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	
	public class LoginPage {
		
		public WebDriver driver;

    @FindBy(how = How.XPATH, using = "//input[contains(@type,'email')]")
    public static WebElement userId;
    
    @FindBy(how = How.XPATH, using = "(//div[@id='identifierNext'])")
    public static WebElement next;
    
    @FindBy(how = How.NAME, using = "password")
    public static WebElement password;
    
    @FindBy(how = How.NAME, using = "btnLogin")
    public static WebElement login;
    
    @FindBy(how = How.XPATH, using = "//div[text()='Compose']")
    public static WebElement compose;
    
    public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	//Enter user name in textbox
	public void setUserName(String strUserName){
		System.out.println(strUserName);
		userId.sendKeys(strUserName);
    }
    
    //Click on Next button
    public void clickOnNext(){
        next.click();
    }

    //Set password in password textbox
    public void setPassword(String strPassword){

         password.sendKeys(strPassword);
    }
    
    //Validate if the user logged in successfully
    public String ValidateUserGmailLogin(){

    	return compose.getText();
    }

   

}