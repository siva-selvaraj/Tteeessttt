package org.stepdefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	WebDriver driver;

	@Given("the user should be in facebook login page")
	public void the_user_should_be_in_facebook_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@When("the user has to fill the username and password detail")
	public void the_user_has_to_fill_the_username_and_password_detail(io.cucumber.datatable.DataTable data) {
		List<List<String>> li = data.asLists();
		List<String> list = li.get(1);

		String user = list.get(0);
		System.out.println(user);

		String pass = list.get(1);
		System.out.println(pass);
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(user);
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys(pass);

	}

	@When("the user has to click login button")
	public void the_user_has_to_click_login_button() {
		WebElement btn = driver.findElement(By.name("login"));
		btn.click();

	}

	@Then("the user should navigate to invalid login page")
	public void the_user_should_navigate_to_invalid_login_page() throws Exception {
		Thread.sleep(5000);
		Assert.assertTrue("verified url", driver.getCurrentUrl().contains("/login/?privacy_"));
		driver.quit();

	}

}
