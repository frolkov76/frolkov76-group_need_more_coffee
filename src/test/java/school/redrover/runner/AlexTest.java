package school.redrover.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlexTest extends BaseTest{

    @Test
    public void testS() {

    getDriver().get("http://qahacking.guru");
    getDriver().manage().timeouts().implicitlyWait(Duration.ofMillis(800));

    WebElement submitButtonPrimary = getDriver().findElement(By.xpath("//*[@class= 'el-link uk-button uk-button-primary']"));
        submitButtonPrimary.click();
    WebElement text = getDriver().findElement(By.xpath("//*[@class= 'uk-margin-small uk-scrollspy-inview uk-animation-fade']"));

        Assert.assertEquals(text.getText(), "СОБАСЕДНИК");

    getDriver().quit();


}

}
