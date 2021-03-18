package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;

public class StepDefinitions {

    private WebDriver driver;

    @Given("I selected size smal")
    public void i_selected_size_smal() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.grolls.se/helags-t-shirt--svart1100099.html");
        driver.manage().window().maximize();
    Select dropdown = new Select(driver.findElement(By.name("super_attribute[400]")));
        Thread.sleep(5000);
        dropdown.selectByValue("1419");

        //WebElement sizebox = driver.findElement(By.name(""));
        //Numbox.sendKeys(String.valueOf());

        Thread.sleep(2000);
    }

    @Given("I have also selected two shirts")
    public void i_have_also_selected_shirts() throws InterruptedException {
        WebElement Numbox = driver.findElement(By.xpath("//*[@id=\"product_addtocart_form\"]/div[2]/div/div/div[1]/div/div/span[2]/img"));
        Numbox.click();
        Thread.sleep(2000);
    }
    @When("I press add to cart")
    public void i_press_add() throws InterruptedException{
        WebElement addToCart  = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
        addToCart.click();
        Thread.sleep(2000);


    }
    @Then("the result should be {int} in the basket")
    public void the_result_should_be_two_in_the_basket(Integer int1) throws InterruptedException {
     driver.findElement(By.className("minicart-wrapper")).click();
             Thread.sleep(2000);

       WebElement cart= driver.findElement(By.xpath("/html/body/div[4]/header/div[3]/div[4]/div/div/div/div[2]/div[4]/div/ol/li/div/div/div[3]/div[2]/input"));
       assertEquals(String.valueOf(int1),cart.getAttribute("value"));

       driver.quit();
           }

}


