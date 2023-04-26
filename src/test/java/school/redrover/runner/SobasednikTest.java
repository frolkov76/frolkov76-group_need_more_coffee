package school.redrover.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class SobasednikTest extends BaseTest {

    @Test
    public void testBozhok() {

        getDriver().get("https://qahacking.guru/");

        WebElement element = (new WebDriverWait(getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@class='uk-navbar-nav']" +
                "//a[contains(text(),'Блог Джесси')]"))));  //вместо Thread.sleep(3000);

        WebElement ButtonMovie = getDriver().findElement(By.xpath("//ul[@class='uk-navbar-nav']" +
                "//a[contains(text(),'Блог Джесси')]"));

        ButtonMovie.sendKeys(Keys.RETURN);

        WebElement element1 = (new WebDriverWait(getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[@class='uk-link-reset']" +
                        "[contains(text(),'Давно просил домашнее животное')])[1]")))); //вместо Thread.sleep(5000);

        WebElement text = getDriver().findElement(By.xpath("(//a[@class='uk-link-reset']" +
                "[contains(text(),'Давно просил домашнее животное')])[1]"));

        text.sendKeys(Keys.RETURN);


        //Assert.assertEquals(text.getText(), "Подписка Иви");
    }

    @Test
    public void testBozhok2(){
        getDriver().get("https://ultimateqa.com/automation");

        WebElement element = (new WebDriverWait(getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[normalize-space()='Fake Landing Page']"))));  //вместо Thread.sleep(3000);

        WebElement ButtonMovie = getDriver().findElement(By.xpath("//a[normalize-space()='Fake Landing Page']"));

        ButtonMovie.sendKeys(Keys.RETURN);

        WebElement element1 = (new WebDriverWait(getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[normalize-space()='View Courses']")))); //вместо Thread.sleep(5000);

        WebElement text = getDriver().findElement(By.xpath("//a[normalize-space()='View Courses']"));

        String par = element1.getText();
        System.out.println(par); // должен вывести текст (имя кнопки) в консоль, и не вывел. Но тест прошел

        text.sendKeys(Keys.RETURN);

    }

    @Test
    public void foundNewMethods() {
        try {
            getDriver().get("https://crossbrowsertesting.github.io/drag-and-drop");
            Thread.sleep(2000);

            WebElement element = getDriver().findElement(By.id("draggable"));
            WebElement element2 = getDriver().findElement(By.id("droppable"));

            Actions actions = new Actions(getDriver());

            actions.moveToElement(element).clickAndHold().moveToElement(element2).release().build().perform();
        } catch (InterruptedException e) {
            e.printStackTrace();

        }

    }

}
