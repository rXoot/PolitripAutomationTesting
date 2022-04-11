package pack1;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class PolitripSignIn2 {
	ChromeDriver driver;
	String url="https://politrip.com/account/sign-up";
	public void SetUpElements() {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get(url);
		WebElement CookieButton=driver.findElement(By.xpath("//*[@id=\"cookiescript_reject\"]"));
		CookieButton.sendKeys(Keys.ENTER);
		driver.manage().window().maximize();
	}
	public void SignUpElements() throws InterruptedException  {
		//Verifying Politrip title
		if(driver.getTitle().contains("Sign up | Politrip")) {
			System.out.println("PASS 'Politrip' title Displayed");
		}else {
			 System.out.println("FAIL 'Politrip' title Displayed");
		}
		
		//Verifying Home bar menu option
		WebElement HomeBar=driver.findElement(By.id("qa_header-home"));
		if(HomeBar.isDisplayed() && HomeBar.isEnabled()) {
			System.out.println("PASS 'Home' bar menu Displayed");
		}else {
			System.out.println("FAIL 'Home' bar menu Displayed");
		}
		
		//Verifying How it works menu option
		WebElement HowItWorksBar=driver.findElement(By.id("qa_header-how-it-works"));
		if(HowItWorksBar.isDisplayed() && HowItWorksBar.isEnabled()) {
			System.out.println("PASS 'How it works' bar menu Displayed");
		}else {
			System.out.println("FAIL 'How it works' bar menu Displayed");
		}
		
		//Verifying Log In bar menu option
		WebElement LogInBar=driver.findElement(By.id("qa_header-login"));
		if(LogInBar.isDisplayed() && LogInBar.isEnabled()) {
			System.out.println("PASS 'Log In' bar menu Displayed");
		}else {
			System.out.println("FAIL 'Log In' bar menu Displayed");
		}		
		
		//Verifying Sign up Heading
		WebElement SignUpHeading=driver.findElement(By.xpath("//span[contains(text(),'Sign up')]"));
		if(SignUpHeading.isDisplayed()) {
			System.out.println("PASS 'Sign up' Displayed");
		}else {
			System.out.println("FAIL 'Sign up' Displayed");
		}
		
		if(driver.getPageSource().contains("Sign up")){
		    System.out.println("PASS 'Sign up' text found");
		}
		else{
		    System.out.println("FAIL 'Sign up' text not found");
		}
		
		//Verifying First Name tag & field
		if(driver.getPageSource().contains(" First Name ")){
		    System.out.println("PASS 'First Name' text found");
		}
		else{
		    System.out.println("FAIL 'First Name' text not found");
		}
		
		WebElement FirstNameField=driver.findElement(By.id("sign-up-first-name-div"));
		if(FirstNameField.isDisplayed() && FirstNameField.isEnabled()) {
			System.out.println("PASS 'First Name' field Displayed & Enabled");
		}else {
			System.out.println("FAIL 'First Name' field Displayed & Enabled");
		}
		
		//Verifying Last Name tag & field
		if(driver.getPageSource().contains(" Last Name ")){
		   System.out.println("PASS 'Last Name' text found");
		}
		else{
		   System.out.println("FAIL 'Last Name' text not found");
		}
		
		WebElement LastNameField=driver.findElement(By.id("sign-up-last-name-label"));
		if(LastNameField.isDisplayed()&&LastNameField.isEnabled()) {
			System.out.println("PASS 'Last Name' field Displayed & Enabled");
		}else {
			System.out.println("FAIL 'Last Name' field Displayed & Enabled");
		}
		
		//Verifying Email tag & field
		if(driver.getPageSource().contains(" Email ")){
			System.out.println("PASS 'Email' text found");
		}
		else{
			System.out.println("FAIL 'Email' text not found");
		}
				
		WebElement EmailField=driver.findElement(By.id("sign-up-email-div"));
		if(EmailField.isDisplayed() && EmailField.isEnabled()) {
			System.out.println("PASS 'Email' field Displayed & Enabled");
		}else {
			System.out.println("FAIL 'Email' field Displayed & Enabled");
		}
		
		//Verifying Password tag & field
		if(driver.getPageSource().contains(" Password ")){
			System.out.println("PASS 'Password' text found");
		}
		else{
			System.out.println("FAIL 'Password' text not found");
		}
				
		WebElement PasswordField=driver.findElement(By.id("sign-up-email-div"));
		if(PasswordField.isDisplayed() && PasswordField.isEnabled()) {
			System.out.println("PASS 'Password' field Displayed & Enabled");
		}else {
			System.out.println("FAIL 'Password' field Displayed & Enabled");
		}
		
		//Verifying Confirm Password tag & field
		if(driver.getPageSource().contains(" Confirm Password ")){
			System.out.println("PASS 'Confirm Password' text found");
		}
		else{
			System.out.println("FAIL 'Confirm Password' text not found");
		}
				
		WebElement ConfirmPasswordField=driver.findElement(By.id("sign-up-confirm-password-label"));
		if(ConfirmPasswordField.isDisplayed() && ConfirmPasswordField.isEnabled()) {
			System.out.println("PASS 'Confirm Password' field Displayed & Enabled");
		}else {
			System.out.println("FAIL 'Confirm Password' field Displayed & Enabled");
		}
		
		//Verifying How did you hear about us? tag & field
		if(driver.getPageSource().contains(" How did you hear about us? ")){
			System.out.println("PASS 'How did you hear about us?' text found");
		}
		else{
			System.out.println("FAIL 'How did you hear about us?' text not found");
		}
				
		WebElement HeardField=driver.findElement(By.id("sign-up-heard-input"));
		if(HeardField.isDisplayed() && HeardField.isEnabled()) {
			System.out.println("PASS 'How did you hear about us?' field Displayed & Enabled");
		}else {
			System.out.println("FAIL 'How did you hear about us?' field Displayed & Enabled");
		}
		
		//Verifying Sign up with text
		if(driver.getPageSource().contains(" Sign up with ")){
			System.out.println("PASS 'Sign up with' text found");
		}
		else{
			System.out.println("FAIL 'Sign up with' text not found");
		}
		
		//Verifying Already have an account Text
		WebElement AlreadyTag=driver.findElement(By.xpath("//span[contains(text(),'Already have an account?')]"));
		if(AlreadyTag.isDisplayed() && AlreadyTag.isEnabled()) {
			System.out.println("PASS 'Already have an account?' text Displayed & Enabled");
		}else {
			System.out.println("FAIL 'Already have an account?' text Displayed & Enabled");
		}
		
		//Verifying LoginTag
		WebElement LogInTag=driver.findElement(By.xpath("//span[contains(text(),' Log in')]"));
		if(LogInTag.isDisplayed() && LogInTag.isEnabled()) {
			System.out.println("PASS 'Log in' text Displayed & Enabled");
		}else {
			System.out.println("FAIL 'Log in' text Displayed & Enabled");
		}
		
		//Verifying Politrip button
		WebElement PolitripButton = driver.findElement(By.id("qa_header-logo"));
		PolitripButton.sendKeys(Keys.ENTER);
		String PolitripURL="https://politrip.com/";
		driver.getCurrentUrl();
		Thread.sleep(2000);
		if(driver.getCurrentUrl().equals(PolitripURL)){
		    System.out.println("PASS 'Politrip' Button");
		}else {
		    System.out.println("FAIL 'Politrip' Button");
		}
		Thread.sleep(2000);
	    driver.get(url);
	    
	    //Verifying Home button
	  	WebElement HomeButton = driver.findElement(By.id("qa_header-home"));
	  	HomeButton.sendKeys(Keys.ENTER);
	  	driver.getCurrentUrl();
	  	Thread.sleep(2000);
	  	if(driver.getCurrentUrl().equals(PolitripURL)){
	  		System.out.println("PASS 'Home' Button");
	  	}else {
	  	    System.out.println("FAIL 'Home' Button");
	  	}
	  	Thread.sleep(2000);
	  	driver.get(url);
	  	
	    //Verifying How it works button
	  	WebElement HowItWorksButton = driver.findElement(By.id("qa_header-how-it-works"));
	  	HowItWorksButton.sendKeys(Keys.ENTER);
	  	String HowItWorksURL="https://politrip.com/how-it-works";
	  	driver.getCurrentUrl();
	  	Thread.sleep(2000);
	  	if(driver.getCurrentUrl().equals(HowItWorksURL)){
	  		System.out.println("PASS 'How it works' Button");
	  	}else {
	  	    System.out.println("FAIL 'How it works' Button");
	  	}
	  	Thread.sleep(2000);
	  	driver.get(url);
	  	
	    //Verifying How it works button
	  	WebElement LogInButton = driver.findElement(By.id("qa_header-login"));
	  	LogInButton.sendKeys(Keys.ENTER);
	  	String LogInURL="https://politrip.com/account/login";
	  	driver.getCurrentUrl();
	  	Thread.sleep(2000);
	  	if(driver.getCurrentUrl().equals(LogInURL)){
	  		System.out.println("PASS 'Log in' Button");
	  	}else {
	  	    System.out.println("FAIL 'Log in' Button");
	  	}
	  	Thread.sleep(2000);
	  	driver.get(url);
	  	
	    //Verifying Sign up upper button
	  	WebElement SignUpButton = driver.findElement(By.id("qa_header-signup"));
	  	SignUpButton.sendKeys(Keys.ENTER);
	  	driver.getCurrentUrl();
	  	Thread.sleep(2000);
	  	if(driver.getCurrentUrl().equals(url)){
	  		System.out.println("PASS 'Sign up' Button");
	  	}else {
	  	    System.out.println("FAIL 'Sign up' Button");
	  	}
	  	Thread.sleep(2000);
	  	
	  	//Verifying Already have an account? button
	  	WebElement AlreadyButton = driver.findElement(By.partialLinkText("Already have an account?"));
	  	JavascriptExecutor js=(JavascriptExecutor) driver;  
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();",AlreadyButton);
	  	driver.getCurrentUrl();
	  	Thread.sleep(2000);
	  	if(driver.getCurrentUrl().equals(LogInURL)){
	  		System.out.println("PASS 'Already have an account?' Button");
	  	}else {
	  	    System.out.println("FAIL 'Already have an account?' Button");
	  	}
	  	Thread.sleep(2000);
	  	driver.get(url);
	  	
	  	Thread.sleep(2000);
	    //driver.close();
		
}
public void SignUpFacebook() throws InterruptedException {
	WebElement SignUpFacebook=driver.findElement(By.xpath("//*[@id=\"socialmedia-account-component-div\"]/div[1]/div[1]"));
	if(SignUpFacebook.isDisplayed()&& SignUpFacebook.isEnabled()) {
		System.out.println("PASS 'Facebook' button Displayed & Enabled");
	}else {
		System.out.println("FAIL 'Facebook' button Displayed & Enabled");
	}
	Thread.sleep(1000);
	
	//SignUpFacebook.click();
	JavascriptExecutor js=(JavascriptExecutor) driver;  
	Thread.sleep(1000);
    js.executeScript("arguments[0].click();",SignUpFacebook);
	driver.getCurrentUrl();
	
	String NewURL="https://www.facebook.com/r.php";
	String Windowhandler=driver.getWindowHandle();
	ArrayList tab2=new ArrayList(driver.getWindowHandles());
	driver.switchTo().window((String) tab2.get(1));
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get(NewURL);
	Thread.sleep(3000);
	 WebElement CookieButtonFb=driver.findElement(By.xpath("//button[text()='Only allow essential cookies']"));
	Thread.sleep(3000);
	 CookieButtonFb.sendKeys(Keys.ENTER);
    
    // Switching to Parent window i.e Main Window. 
    Thread.sleep(2000);
    driver.close();
    driver.switchTo().window((String) tab2.get(0));
	
	Thread.sleep(1000);
   // driver.close();
    
}	
public void SignUpGoogle() throws InterruptedException {
	WebElement SignUpGoogle=driver.findElement(By.xpath("//*[@id=\"socialmedia-account-component-div\"]/div[1]/div[2]"));
	if(SignUpGoogle.isDisplayed() && SignUpGoogle.isEnabled()) {
		System.out.println("PASS 'Google' button Displayed & Enabled");
	}else {
		System.out.println("FAIL 'Google' button Displayed & Enabled");
	}
	Thread.sleep(2000);
	
	//SignUpGoogle.click();
	JavascriptExecutor js=(JavascriptExecutor) driver;  
	Thread.sleep(1000);
    js.executeScript("arguments[0].click();",SignUpGoogle);
	driver.getCurrentUrl();
	
	String NewURL="https://accounts.google.com/o/oauth2/auth/oauthchooseaccount?redirect_uri=storagerelay%3A%2F%2Fhttps%2Fpolitrip.com%3Fid%3Dauth838219&response_type=permission%20id_token&scope=email%20profile%20openid&openid.realm&include_granted_scopes=true&client_id=959210448222-nnfkulgdpqa4rq346otfmptr2i350jp6.apps.googleusercontent.com&ss_domain=https%3A%2F%2Fpolitrip.com&fetch_basic_profile=true&gsiwebsdk=2&flowName=GeneralOAuthFlow";
	String Windowhandler=driver.getWindowHandle();
	ArrayList tab2=new ArrayList(driver.getWindowHandles());
	driver.switchTo().window((String) tab2.get(1));
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get(NewURL);
    
    // Switching to Parent window i.e Main Window. 
    Thread.sleep(2000);
    driver.close();
    driver.switchTo().window((String) tab2.get(0));
	
	Thread.sleep(1000);
    //driver.close();
    
}

public void SignUpInstagram() throws InterruptedException {
	WebElement SignUpInstagram=driver.findElement(By.xpath("//*[@id=\"socialmedia-account-instagram-button\"]"));
	if(SignUpInstagram.isDisplayed() && SignUpInstagram.isEnabled()) {
		System.out.println("PASS 'Instagram' button Displayed & Enabled");
	}else {
		System.out.println("FAIL 'Instagram' button Displayed & Enabled");
	}
	Thread.sleep(1000);
	
	String InstagramURL="https://www.instagram.com/accounts/login/?force_authentication=1&enable_fb_login=1&next=/oauth/authorize/%3Fclient_id%3D78e35ea8eafe469e85ac859369ff9d3c%26redirect_uri%3Dhttps%3A//politrip.com/sign-up%26response_type%3Dtoken";
	//SignUpInstagram.click();
	JavascriptExecutor js=(JavascriptExecutor) driver;  
	Thread.sleep(1000);
    js.executeScript("arguments[0].click();",SignUpInstagram);
	//driver.get(NewURL);
    driver.getCurrentUrl();
    if(driver.getCurrentUrl().equals(InstagramURL)){
    	System.out.println("PASS 'Instagram' URL");
    }else {
    	System.out.println("FAIL 'Instagram' URL");
    }
    	
	Thread.sleep(3000);
	WebElement CookieButtonFb=driver.findElement(By.xpath("//button[text()='Only Allow Essential Cookies']"));
	Thread.sleep(3000);
	CookieButtonFb.sendKeys(Keys.ENTER);

    // Switching to Parent window i.e Main Window. 
    Thread.sleep(3000);
    driver.get(url);
	
	Thread.sleep(1000);
    //driver.close();
    
}

public void SignUpVK() throws InterruptedException {
	WebElement SignUpVK=driver.findElement(By.xpath("//*[@id=\"socialmedia-account-component-div\"]/div[2]/div"));
	if(SignUpVK.isDisplayed() && SignUpVK.isEnabled()) {
		System.out.println("PASS 'VK' button Displayed & Enabled");
	}else {
		System.out.println("FAIL 'VK' button Displayed & Enabled");
	}
	Thread.sleep(2000);
	
	//SignUpGoogle.click();
	JavascriptExecutor js=(JavascriptExecutor) driver;  
	Thread.sleep(2000);
    js.executeScript("arguments[0].click();",SignUpVK);
	
	String NewURL="https://oauth.vk.com/authorize?client_id=6950406&display=popup&redirect_uri=close.html&response_type=token&openapi=1";
	ArrayList tab2=new ArrayList(driver.getWindowHandles());
	driver.switchTo().window((String) tab2.get(0));
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.getCurrentUrl();
	driver.get(NewURL);
    
    // Switching to Parent window i.e Main Window. 
    Thread.sleep(2000);
    driver.get(url);
    driver.close();
	
    // Switching to Parent window i.e Main Window. 
	
	Thread.sleep(1000);
    driver.close();
    
}
public void InvokeBrowser_TC1() throws InterruptedException{ 
	//click on sign up button
	WebElement signUpButton = driver.findElement(By.id(" qa_loader-button"));
    signUpButton.sendKeys(Keys.ENTER);
    if(driver.getCurrentUrl().equals(url)){
	    System.out.println("Test Case 1 PASS");
	}else {
	    System.out.println("Test Case 1 FAIL");
	}
    
    //exit session
	Thread.sleep(3000);
    driver.close();
}
public void InvokeBrowser_TC2() throws InterruptedException{ 
	//valid data
	driver.findElement(By.name("first-name")).sendKeys("TestFirstName");
	Thread.sleep(1000);
	driver.findElement(By.name("last-name")).sendKeys("TestLastName");
	Thread.sleep(1000);
	driver.findElement(By.name("email")).sendKeys("test-859e7y7vq@srv1.mail-tester.com");
	Thread.sleep(1000);
	driver.findElement(By.id("sign-up-password-input")).sendKeys("XML@flower10");
	Thread.sleep(1000);
	driver.findElement(By.id("sign-up-confirm-password-input")).sendKeys("XML@flower10");

	//click on sign up button
	Thread.sleep(1000);
	WebElement signUpButton = driver.findElement(By.id(" qa_loader-button"));
	signUpButton.sendKeys(Keys.ENTER);
	
	driver.getCurrentUrl();
	JavascriptExecutor js=(JavascriptExecutor) driver;
	Thread.sleep(3000);
	js.executeScript("document.getElementById('terms-checkbox').click();");
	
	//click on sign up as a participant
	Thread.sleep(3000);
	js=(JavascriptExecutor) driver;
	js.executeScript("document.getElementById('qa_signup-participant').click();");
	
	driver.getCurrentUrl();
	String TermsURL="https://politrip.com/account/sign-up/type-select";
	Thread.sleep(3000);
	if(driver.getCurrentUrl().equals(TermsURL)){
		System.out.println("Test Case 2 PASS");
	}else {
		System.out.println("Test Case 2 FAIL");
	}
    
    //exit session
    Thread.sleep(3000);
    driver.close();
}
public void InvokeBrowser_TC3() throws InterruptedException{
	//valid data
	driver.findElement(By.name("first-name")).sendKeys("TestFirstName");
	Thread.sleep(1000);
	driver.findElement(By.name("last-name")).sendKeys("TestLastName");
	Thread.sleep(1000);
	driver.findElement(By.name("email")).sendKeys("test-jsrs7ml6o@srv1.mail-tester.com");
	Thread.sleep(1000);
	driver.findElement(By.id("sign-up-password-input")).sendKeys("XML@flower10");
	Thread.sleep(1000);
	driver.findElement(By.id("sign-up-confirm-password-input")).sendKeys("XML@flower10");

	//click on sign up button
	Thread.sleep(1000);
	WebElement signUpButton = driver.findElement(By.id(" qa_loader-button"));
	signUpButton.sendKeys(Keys.ENTER);

	//click on sign up button as a participant
	JavascriptExecutor js=(JavascriptExecutor) driver;
	Thread.sleep(3000);
	js.executeScript("document.getElementById('qa_signup-participant').click();");
		 
	driver.getCurrentUrl();
	String PolitripURL="https://politrip.com/";
	Thread.sleep(5000);
	if(driver.getCurrentUrl().equals(PolitripURL)){
		System.out.println("Test Case 3 PASS");
	}else {
		System.out.println("Test Case 3 FAIL");
	}
		    
	//exit session
	Thread.sleep(2000);
	driver.close();

}
public void InvokeBrowser_TC4() throws InterruptedException{
	//valid data
	driver.findElement(By.name("first-name")).sendKeys("TestFirstName");
	Thread.sleep(1000);
	driver.findElement(By.name("last-name")).sendKeys("TestLastName");
	Thread.sleep(1000);
	driver.findElement(By.name("email")).sendKeys("test-6ayf9ny4s@srv1.mail-tester.com");
	Thread.sleep(1000);
	driver.findElement(By.id("sign-up-password-input")).sendKeys("XML@flower10");
	Thread.sleep(1000);
	driver.findElement(By.id("sign-up-confirm-password-input")).sendKeys("XML@flower10");
	Thread.sleep(1000);
	WebElement heard=driver.findElement(By.id("sign-up-heard-input"));
	Select hearddropdown=new Select(heard);
	hearddropdown.selectByVisibleText("Web-Search");
	Thread.sleep(1000);
			
	//click on sign up button
	Thread.sleep(1000);
	WebElement signUpButton = driver.findElement(By.id(" qa_loader-button"));
	signUpButton.sendKeys(Keys.ENTER);
		    
	//click on subscription button
	JavascriptExecutor js=(JavascriptExecutor) driver;
	Thread.sleep(3000);
	js.executeScript("document.getElementById('mail-subscription-checkbox').click();");
	
	//click on sign up button as an organizer
	Thread.sleep(3000);
	js.executeScript("document.getElementById('qa_signup-organizer').click();");
	
	driver.getCurrentUrl();
	String PolitripURL="https://politrip.com/";
	Thread.sleep(5000);
	if(driver.getCurrentUrl().equals(PolitripURL)){
		System.out.println("Test Case 4 PASS");
	}else {
		System.out.println("Test Case 4 FAIL");
	}
		    
	//exit session
	Thread.sleep(5000);
	driver.close();

}
public void valid_data_email_TC5() throws InterruptedException{
	driver.findElement(By.name("first-name")).sendKeys("TestFirstName");
	Thread.sleep(1000);
	driver.findElement(By.name("last-name")).sendKeys("TestLastName");
	Thread.sleep(1000);
	driver.findElement(By.id("sign-up-password-input")).sendKeys("XML@flower10");
	Thread.sleep(1000);
	driver.findElement(By.id("sign-up-confirm-password-input")).sendKeys("XML@flower10");
	Thread.sleep(1000);
	WebElement heard=driver.findElement(By.id("sign-up-heard-input"));
	Select hearddropdown=new Select(heard);
	hearddropdown.selectByVisibleText("Social networks");
	Thread.sleep(1000);
}
public void InvokeBrowser_TC5() throws InterruptedException{
	WebElement email;
	WebElement signUpButton;
	int var=1;
	int err=0;
	switch(var) {
		case 1:
			valid_data_email_TC5();
			Thread.sleep(1000);
			email=driver.findElement(By.name("email"));
			email.sendKeys("testAtgmail.com");
			Thread.sleep(2000);
			signUpButton = driver.findElement(By.id(" qa_loader-button"));
			signUpButton.sendKeys(Keys.ENTER);
			if(driver.getPageSource().contains(" Please enter a valid email address ")){
			    var++;
			    email.clear();
			}else{
				err++;
				driver.get(url);
				valid_data_email_TC5();
			}
		case 2:
			Thread.sleep(1000);
			email=driver.findElement(By.name("email"));
			email.sendKeys("@gmail");
			Thread.sleep(2000);
			signUpButton = driver.findElement(By.id(" qa_loader-button"));
			signUpButton.sendKeys(Keys.ENTER);
			if(driver.getPageSource().contains(" Please enter a valid email address ")){
				var++;
				email.clear();
			}else{
				err++;
				driver.get(url);
				valid_data_email_TC5();
			}
		case 3:
			Thread.sleep(2000);
			email=driver.findElement(By.name("email"));
			email.sendKeys("test@gmail");
			Thread.sleep(2000);
			signUpButton = driver.findElement(By.id(" qa_loader-button"));
			signUpButton.sendKeys(Keys.ENTER);
			if(driver.getPageSource().contains(" Please enter a valid email address ")){
				var++;
				email.clear();
			}else{
				err++;
				Thread.sleep(2000);
				driver.get(url);
				valid_data_email_TC5();
			}
		case 4:
			Thread.sleep(2000);
			email=driver.findElement(By.name("email"));
			email.sendKeys("test@gmailcom");
			Thread.sleep(2000);
			signUpButton = driver.findElement(By.id(" qa_loader-button"));
			signUpButton.sendKeys(Keys.ENTER);
			if(driver.getPageSource().contains(" Please enter a valid email address ")){
			    var++;
			    email.clear();
			}else {
				err++;
			}
			break;
		default:
			System.out.println("FAIL 'Invalid email' text not found");
			break;
	}
			
	Thread.sleep(1000);	    
	driver.getCurrentUrl();
	Thread.sleep(3000);
	if(driver.getCurrentUrl().equals(url) && var==5){
		System.out.println("Test Case 5 PASS");
	}else {
		System.out.printf("Test Case 5 FAIL with %d erori",err);
	}
		    
	//exit session
	Thread.sleep(3000);
	driver.close();

}
public void valid_data_email_TC51() throws InterruptedException{
	driver.findElement(By.name("first-name")).sendKeys("TestFirstName");
	Thread.sleep(1000);
	driver.findElement(By.name("last-name")).sendKeys("TestLastName");
	Thread.sleep(1000);
	driver.findElement(By.name("email")).sendKeys("test-kft4yvycj@srv1.mail-tester.com");
	Thread.sleep(1000);
	driver.findElement(By.id("sign-up-password-input")).sendKeys("XML@flower10");
	Thread.sleep(1000);
	driver.findElement(By.id("sign-up-confirm-password-input")).sendKeys("XML@flower10");
	Thread.sleep(1000);
	WebElement heard=driver.findElement(By.id("sign-up-heard-input"));
	Select hearddropdown=new Select(heard);
	hearddropdown.selectByVisibleText("From a friend");
}
public void InvokeBrowser_TC51() throws InterruptedException{
	WebElement signUpButton;
	int nr=1;
	int var=1;
	int err=0;
	switch(nr) {
		case 1:
			valid_data_email_TC51();
			Thread.sleep(2000);
			signUpButton = driver.findElement(By.id(" qa_loader-button"));
			signUpButton.sendKeys(Keys.ENTER);
			Thread.sleep(5000);
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("document.getElementById('qa_signup-participant').click();");
			Thread.sleep(3000);
			if(!driver.getPageSource().contains("  An user with this email is already registered  ")){
				var++;
				Thread.sleep(5000);
				driver.get(url);
				valid_data_email_TC51();
			}else{
				err++;
			    break;
			}
		case 2:
			Thread.sleep(2000);
			signUpButton = driver.findElement(By.id(" qa_loader-button"));
			signUpButton.sendKeys(Keys.ENTER);
			Thread.sleep(5000);
			if(driver.getPageSource().contains(" An user with this email is already registered ")){
				var++;
			}else{
				err++;
			}
			break;
		default:
			System.out.println("FAIL 'Invalid email' text not found");
			break;
	}
			
	Thread.sleep(1000);	    
	driver.getCurrentUrl();
	Thread.sleep(3000);
	if(driver.getCurrentUrl().equals(url) && var==3){
		System.out.println("Test Case 5_1 PASS");
	}else {
		System.out.printf("Test Case 5_1 FAIL with %d erori",err);
	}
		    
	//exit session
	Thread.sleep(3000);
	driver.close();

}

public void valid_data_email_TC6() throws InterruptedException{
	driver.findElement(By.name("first-name")).sendKeys("TestFirstName");
	Thread.sleep(2000);
	driver.findElement(By.name("last-name")).sendKeys("TestLastName");
	Thread.sleep(2000);
	driver.findElement(By.name("email")).sendKeys("test-u8oxxf8e2@srv1.mail-tester.com");
	Thread.sleep(2000);
	WebElement heard=driver.findElement(By.id("sign-up-heard-input"));
	Select hearddropdown=new Select(heard);
	hearddropdown.selectByVisibleText("Other");
}

public void InvokeBrowser_TC6() throws InterruptedException{
	WebElement Password;
	WebElement ConfirmPassword;
	WebElement signUpButton;
	int nr=1;
	int var=1;
	int err=0;
	switch(nr) {
		case 1:
			valid_data_email_TC6();
			Thread.sleep(2000);
			Password=driver.findElement(By.id("sign-up-password-input"));
			Password.sendKeys("Password");
			Thread.sleep(2000);
			ConfirmPassword=driver.findElement(By.id("sign-up-confirm-password-input"));
			ConfirmPassword.sendKeys("Password");
			Thread.sleep(2000);
			signUpButton = driver.findElement(By.id(" qa_loader-button"));
			signUpButton.sendKeys(Keys.ENTER);
			if(driver.getPageSource().contains(" Password must contain at least 8 characters, 1 uppercase letter, 1 lowercase letter and 1 digit ")){
			    var++;
			    Password.clear();
			    ConfirmPassword.clear();
			}else{
				err++;
				driver.get(url);
				valid_data_email_TC6();
			}
		case 2:
			Thread.sleep(2000);
			Password=driver.findElement(By.id("sign-up-password-input"));
			Password.sendKeys("Pass123456");
			Thread.sleep(2000);
			ConfirmPassword=driver.findElement(By.id("sign-up-confirm-password-input"));
			ConfirmPassword.sendKeys("Pass123457");
			Thread.sleep(2000);
			signUpButton = driver.findElement(By.id(" qa_loader-button"));
			signUpButton.sendKeys(Keys.ENTER);
			if(driver.getPageSource().contains(" Passwords must match ")){
			    var++;
			    Password.clear();
			    ConfirmPassword.clear();
			}else{
				err++;
				driver.get(url);
				valid_data_email_TC6();
			}
		case 3:
			Thread.sleep(2000);
			Password=driver.findElement(By.id("sign-up-password-input"));
			Password.sendKeys("123456789");
			Thread.sleep(2000);
			ConfirmPassword=driver.findElement(By.id("sign-up-confirm-password-input"));
			ConfirmPassword.sendKeys("123456789");
			Thread.sleep(2000);
			signUpButton = driver.findElement(By.id(" qa_loader-button"));
			signUpButton.sendKeys(Keys.ENTER);
			if(driver.getPageSource().contains(" Password must contain at least 8 characters, 1 uppercase letter, 1 lowercase letter and 1 digit ")){
			    var++;
			    Password.clear();
			    ConfirmPassword.clear();
			}else{
				err++;
				driver.get(url);
				valid_data_email_TC6();
			}
		case 4:
			Thread.sleep(2000);
			Password=driver.findElement(By.id("sign-up-password-input"));
			Password.sendKeys("passw");
			Thread.sleep(2000);
			ConfirmPassword=driver.findElement(By.id("sign-up-confirm-password-input"));
			ConfirmPassword.sendKeys("passw");
			Thread.sleep(2000);
			signUpButton = driver.findElement(By.id(" qa_loader-button"));
			signUpButton.sendKeys(Keys.ENTER);
			if(driver.getPageSource().contains(" Password must contain at least 8 characters, 1 uppercase letter, 1 lowercase letter and 1 digit ")){
			    var++;
			    Password.clear();
			    ConfirmPassword.clear();
			}else{
				err++;
				driver.get(url);
				valid_data_email_TC6();
			}
		case 5:
			Thread.sleep(2000);
			Password=driver.findElement(By.id("sign-up-password-input"));
			Password.sendKeys("Pass123456");
			Thread.sleep(2000);
			ConfirmPassword=driver.findElement(By.id("sign-up-confirm-password-input"));
			ConfirmPassword.sendKeys("Pass123456");
			Thread.sleep(2000);
			signUpButton = driver.findElement(By.id(" qa_loader-button"));
			signUpButton.sendKeys(Keys.ENTER);
			if(!driver.getCurrentUrl().equals(url)){
				err++;
			}else{
				var++;
				Thread.sleep(4000);
				driver.get(url);
				valid_data_email_TC6();
			}
		case 6:
			Thread.sleep(2000);
			Password=driver.findElement(By.id("sign-up-password-input"));
			Password.sendKeys("TestTheLenghtOfThisField12345678910TestTheLenghtOfThisField12345678910");
			Thread.sleep(2000);
			ConfirmPassword=driver.findElement(By.id("sign-up-confirm-password-input"));
			ConfirmPassword.sendKeys("TestTheLenghtOfThisField12345678910TestTheLenghtOfThisField12345678910");
			Thread.sleep(2000);
			signUpButton = driver.findElement(By.id(" qa_loader-button"));
			signUpButton.sendKeys(Keys.ENTER);
			if(driver.getPageSource().contains(" Password must contain at least 8 characters, 1 uppercase letter, 1 lowercase letter and 1 digit ")){
			    var++;
			    Password.clear();
			    ConfirmPassword.clear();
			}else{
				err++;
			}
			break;
		default:
			System.out.println("FAIL Text for invalid password text not found");
			break;
	}
	Thread.sleep(1000);	    
	driver.getCurrentUrl();
	Thread.sleep(3000);
	if(driver.getCurrentUrl().equals(url) && var==7){
		System.out.println("Test Case 6 PASS");
	}else {
		System.out.printf("Test Case 6 FAIL with %d erori",err);
	}
		    
	//exit session
	Thread.sleep(3000);
	driver.close();

}
public void InvokeBrowser_TC7() throws InterruptedException{ 
	//valid data
	driver.findElement(By.name("first-name")).sendKeys(" ");
	Thread.sleep(1000);
	driver.findElement(By.name("last-name")).sendKeys(" ");
	Thread.sleep(1000);
	driver.findElement(By.name("email")).sendKeys(" ");
	Thread.sleep(1000);
	driver.findElement(By.id("sign-up-password-input")).sendKeys(" ");
	Thread.sleep(1000);
	driver.findElement(By.id("sign-up-confirm-password-input")).sendKeys(" ");

	//click on sign up button
	Thread.sleep(1000);
	WebElement signUpButton = driver.findElement(By.id(" qa_loader-button"));
	signUpButton.sendKeys(Keys.ENTER);
	
	int var1=0,var2=0,var3=0;
	if(driver.getPageSource().contains(" This field can not be empty ")){
	    var1++;
	}
	if(driver.getPageSource().contains(" Password must contain at least 8 characters, 1 uppercase letter, 1 lowercase letter and 1 digit ")){
	    var2++;
	}
	if(driver.getPageSource().contains(" Please enter a valid email address ")){
	    var3++;
	}
	driver.getCurrentUrl();
	Thread.sleep(3000);
	if(driver.getCurrentUrl().equals(url)&& var1==1 && var2==1 && var3==1){
		System.out.println("Test Case 7 PASS");
	}else {
		System.out.println("Test Case 7 FAIL");
	}
    
    //exit session
    Thread.sleep(3000);
    driver.close();
}
public static void main(String[] args) throws InterruptedException {
	
	PolitripSignIn2 ps= new PolitripSignIn2();
	ps.SetUpElements();
	//Interface elements
		/*ps.SignUpElements();
		ps.SignUpFacebook();
		ps.SignUpGoogle();
		ps.SignUpInstagram();
		ps.SignUpVK();*/
	//Registration button
		//ps.InvokeBrowser_TC1();
	//Required fields
	//Required field  page2
		//ps.InvokeBrower_TC2();
	//Required field  page1
		//ps.InvokeBrowser_TC3();
	//Optional fields 
		//ps.InvokeBrowser_TC4();
	//Invalid email
		//ps.InvokeBrowser_TC5();
	//Email already registered
		//ps.InvokeBrowser_TC51();
	//Invalid Password 
		//ps.InvokeBrowser_TC6();
	//Blank fields
		ps.InvokeBrowser_TC7();
	}	
}
