// Ranorex Webtestit Page Object File

package uitest.pageobjects;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

public class newpofile1 {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public newpofile1(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public newpofile1 open(String url) {
        this.driver.get(url);
        
        return this;
    }

    public String getTitle() {
        return this.driver.getTitle();
    }

}
