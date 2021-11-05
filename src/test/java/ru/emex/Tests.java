package ru.emex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tests {

   @Test
    public void TitleEmex() {
       System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
       WebDriver driver = new FirefoxDriver();
       driver.manage().window().maximize();
       driver.get("https://emex.ru/");

       String title = driver.getTitle();
       //Assertions.assertTrue(title.equals("Автозапчасти, запчасти, каталог запчастей для иномарок, интернет – магазин Emex"));
         Assertions.assertEquals(title, "Автозапчасти, запчасти, каталог запчастей для иномарок, интернет – магазин Emex");
   }
}
