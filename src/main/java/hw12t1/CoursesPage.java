package hw12t1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

public class CoursesPage {
    private final WebDriver driver;

    public CoursesPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<String> getCourses() {
        List<String> courseList = new ArrayList<>();
        List<WebElement> courseElements = driver.findElements(By.cssSelector(".course-card-title"));

        for (WebElement courseElement : courseElements) {
            courseList.add(courseElement.getText());
        }

        return courseList;
    }

    public List<String> getAdditionalCourses() {
        List<String> additionalCourseList = new ArrayList<>();
        List<WebElement> additionalCourseElements = driver.findElements(By.cssSelector(".additional-course"));

        for (WebElement additionalCourseElement : additionalCourseElements) {
            additionalCourseList.add(additionalCourseElement.getText());
        }

        return additionalCourseList;
    }

    public String getOpportunities() {
        WebElement opportunitiesElement = driver.findElement(By.cssSelector(".why-ithillel"));
        return opportunitiesElement.getText();
    }

    public String getNewCategory(String category) {
        WebElement categoryLink = driver.findElement(By.linkText(category));
        categoryLink.click();
        return category;
    }
}
