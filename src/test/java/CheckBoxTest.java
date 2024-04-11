import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CheckBoxTest extends BaseTest {


    @Test
    public void checkboxes() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        boolean isCheckbox1Selected = driver.findElements(By.cssSelector("[type=checkbox]")).get(0).isSelected();
        assertFalse(isCheckbox1Selected, "Checkbox1 is Selected");
        driver.findElements(By.cssSelector("[type=checkbox]")).get(0).click();
        boolean Checkbox1Selected = driver.findElements(By.cssSelector("[type=checkbox]")).get(0).isSelected();
        assertTrue(Checkbox1Selected, "Checkbox1 is Unselected");
        boolean Checkbox2Selected = driver.findElements(By.cssSelector("[type=checkbox]")).get(1).isSelected();
        assertTrue(Checkbox2Selected, "Checkbox2 is Unselected");
        driver.findElements(By.cssSelector("[type=checkbox]")).get(1).click();
        boolean isCheckbox2Selected = driver.findElements(By.cssSelector("[type=checkbox]")).get(1).isSelected();
        assertFalse(isCheckbox2Selected, "Checkbox2 is Selected");


    }


}




