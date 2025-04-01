package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver;
@Given("user navigate to the bookcart application")
public void userNavigateToTheBookcartApplication() {
 driver=new ChromeDriver();
 driver.get("https://magento.softwaretestingboard.com/");
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 driver.manage().window().maximize();
    System.out.println(driver.getTitle());
}
@And("user clicks on the login button")
 public void userClicksOnTheLoginButton() {
	driver.findElement(By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]")).click();
   

}
@Given("user enter the username as deepu")
public void userEnterTheUsernameAsDeepu() {
	driver.findElement(By.xpath("//*[@id='email']")).sendKeys("dan@gmail.com");
    

}
@Given("user enter the password as deepu123")
public void userEnterThePasswordAsDeepu123() {
	driver.findElement(By.xpath("//*[@title='Password']")).sendKeys("dan1234@");

}

@When("user click on the login button")
public void userClickOnTheLoginButton()
{
	driver.findElement(By.xpath("(//span[contains(text(),'Sign In')])[1]")).click();
}
@Then("login should be success")
public void loginShouldBeSuccess() {
    System.out.println("login is successfull");
    driver.quit();

}
}
