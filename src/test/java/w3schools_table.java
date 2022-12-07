import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class w3schools_table {

    WebDriver wd = new ChromeDriver();

    @BeforeMethod
    public void openWebSite() {
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
    }

    @Test
    public void test(){
        System.out.println("==================================================");
        System.out.println("Test started");
        //

        wd.findElement(By.id("mainLeaderboard"));
        wd.findElement(By.className("blacktableborders"));
        wd.findElement(By.tagName("span"));

    }

    @AfterMethod
    public void tearDown () {
        wd.quit();
        System.out.println("Quit test");
        System.out.println("==================================================");

    }

}
