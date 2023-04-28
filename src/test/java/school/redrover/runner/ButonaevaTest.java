package school.redrover.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ButonaevaTest extends BaseTest{

    @Test
    public void testBookerPlatform() throws InterruptedException {

        getDriver().get("https://automationintesting.online/");
        WebElement button = getDriver().findElement(By.xpath("//button[normalize-space()='Let me hack!']"));
        button.sendKeys(Keys.RETURN);
        WebElement buttonBook = getDriver().findElement(By.xpath("//button[normalize-space()='Book this room']"));
        buttonBook.sendKeys(Keys.RETURN);

        WebElement buttonName = getDriver().findElement(By.xpath("//input[@id='name']"));
        buttonName.sendKeys("Anna");

        WebElement buttonEmail = getDriver().findElement(By.xpath("//input[@id='email']"));
        buttonEmail.sendKeys("fake@fakeemail.com");

        WebElement buttonPhone = getDriver().findElement(By.xpath("//input[@id='phone']"));
        buttonPhone.sendKeys("012345678901");

        WebElement buttonSubject = getDriver().findElement(By.xpath("//input[@id='subject']"));
        buttonSubject.sendKeys("single");

        WebElement buttonMessage = getDriver().findElement(By.xpath("//textarea[@id='description']"));
        buttonMessage.sendKeys("Hello! I want to book this room.");

        WebElement buttonSubmit = getDriver().findElement(By.xpath("//button[@id='submitContact']"));
        buttonSubmit.sendKeys(Keys.RETURN);

        Thread.sleep(2000);

        WebElement text = getDriver().findElement(By.xpath("//h2[normalize-space()='Thanks for getting in touch Anna!']"));

        Assert.assertEquals(text.getText(), "Thanks for getting in touch Anna!");

    }
    }

