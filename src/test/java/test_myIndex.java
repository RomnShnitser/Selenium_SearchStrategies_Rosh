import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test_myIndex {
    WebDriver wd = new ChromeDriver();

    @BeforeMethod
    public void start() {
        wd.navigate().to("file:///H:/index_test.html");
    }


    @Test
    public void test() {
        System.out.println("==============================");
        System.out.println("Test Started Successfully");


        //
        WebElement element1 = wd.findElement(By.id ("cont"));
        String text = element1.getText();
        System.out.println(text);
    }

    @AfterMethod
    public void tearDown() {
        wd.close();
        System.out.println("Testing Close");
        System.out.println("====================================================================================");
    }
}
