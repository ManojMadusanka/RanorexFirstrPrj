// Ranorex Webtestit Test File

package uitest.tests;

import uitest.TestNgTestBase;
import uitest.pageobjects.*;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

class newtestfile extends TestNgTestBase {
    @Test
    public void SampleTestCase() {
        WebDriver driver = getDriver();

        // 1. Arrange
        // Create a new Page Object instance by right-clicking and
        // selecting "Instantiate Page Object" at the bottom

        // 2. Act
        // Call an existing action from your initialized Page Object

        // 3. Assert
        // Use TestNG assertions to verify results.
        // e.g.:
        // Assert.assertEquals(title, "Test Automation for GUI Testing | Ranorex");
    }
}
