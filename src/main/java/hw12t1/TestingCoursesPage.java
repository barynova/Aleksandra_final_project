package hw12t1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import java.util.List;

public class TestingCoursesPage {
    public static final String TESTING_URL = "https://ithillel.ua/courses/testing";
    private final WebDriver driver;
    private final CoursesPage coursesPage;

    public TestingCoursesPage(WebDriver driver) {
        this.driver = driver;
        coursesPage = new CoursesPage(driver);
    }

    public void navigateTo() {
        driver.get(TESTING_URL);
    }

    // Methods
    public List<String> getCourses() {
        return coursesPage.getCourses();
    }

    public List<String> getAdditionalCourses() {
        return coursesPage.getAdditionalCourses();
    }

    public String getOpportunities() {
        return coursesPage.getOpportunities();
    }

    public String goToCategory(String category) {
        return coursesPage.getNewCategory(category);
    }
}
