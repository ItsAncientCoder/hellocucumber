package hellocucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExampleSteps {

	private static WebDriver driver;

	@Given("^I am on the Google search page$")
	public void I_visit_google() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bandham\\Downloads\\Compressed\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com/create-selenium-maven-project/");
	}

	@When("^I search for \"(.*)\"$")
	public void search_for(String query) {
		WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/div/p[2]/a[2]"));
		System.out.println(element.getText() + " bandham manikanta");
	}

	@Then("^the page title should start with \"([^\"]*)\"$")
	public void checkTitle(String titleStartsWith) throws Exception {
		System.out.println("Then tag ********** " + titleStartsWith);
		driver.navigate().to("http://google.com");
	}

	@And("^Close the browser")
	public void CloseBrowser() {
		driver.quit();
		System.out.println("******************browser closed..*****************");
	}

}