import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Dropdown extends BaseTest {


    @Test
    public void dropdown() {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.findElement(By.id("dropdown")).click();
        boolean drop1 = driver.findElement(By.xpath("//option[text()='Option 1']")).isDisplayed();
        assertTrue(drop1, "No element");
        boolean drop2 = driver.findElement(By.xpath("//option[text()='Option 2']")).isDisplayed();
        assertTrue(drop2, "No element");
        boolean drop3 = driver.findElement(By.xpath("//option[text()='Please select an option']"))
                .isDisplayed();
        assertTrue(drop3, "No element");


    }

    @Test
    public void pressOption1() {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.findElement(By.id("dropdown")).click();
        driver.findElement(By.xpath("//option[@value='1']")).click();
        boolean option1 = driver.findElement(By.xpath("//option[@value='1']")).isSelected();
        assertTrue(option1, "Ne srabotalo");

    }

    @Test
    public void pressOption2() {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.findElement(By.id("dropdown")).click();
        driver.findElement(By.xpath("//option[@value='2']")).click();
        boolean option2 = driver.findElement(By.xpath("//option[@value='2']")).isSelected();
        assertTrue(option2, "Ne srabotalo");

    }


}




