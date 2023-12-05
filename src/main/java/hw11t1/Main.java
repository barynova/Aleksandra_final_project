package hw11t1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Initialize driver Safari
        WebDriver driver = new SafariDriver();

        // Set Implicit Wait to 60 seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // Maximize browser window
        driver.manage().window().maximize();

        // Go to site
        driver.get("https://ithillel.ua/");

        // Find Програмування
        WebElement progElement = driver.findElement(By.cssSelector(".block-course-cats_link[href*='programming']"));

        JavascriptExecutor jselement2 = (JavascriptExecutor) driver;
        jselement2.executeScript("arguments[0].scrollIntoView();", progElement);

        // Click on Програмування
        progElement.click();

        //Thread.sleep(5000);

        // Find Front-end Basic
        WebElement frontEndBasicElement = driver.findElement(By.cssSelector(".-offline[href*='front-end-basic']"));

        JavascriptExecutor jselement3 = (JavascriptExecutor) driver;
        jselement3.executeScript("arguments[0].scrollIntoView();", frontEndBasicElement);

        // Click on Front-end Basic
        frontEndBasicElement.click();

        // Create WebDriverWait instance
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Explicitly wait for the coachesSection to be visible
        WebElement coachesSection = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".-coaches")));

        ((JavascriptExecutor) driver).executeScript("scrollTo(" + coachesSection.getLocation().x + " , " + coachesSection.getLocation().y + ")");

       WebElement button = driver.findElement(By.id("coachesShowAllButton"));
       List<WebElement> coaches = driver.findElements(By.className("coach-card_name"));

        //Print the information about each teacher
        System.out.println("Викладачі курсу:");
        for (WebElement coach : coaches) {
            System.out.println(coach.getText());
        }

        // Quit
        driver.quit();
    }
}
