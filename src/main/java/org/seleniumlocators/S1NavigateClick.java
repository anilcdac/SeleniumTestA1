package org.seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class S1NavigateClick {
public static void main(String[] args) throws InterruptedException {

    By noNextBtn = By.cssSelector(".paginate_button.next.disabled");
    By nextBtn = By.xpath("//a[normalize-space()='Next']");
    String country= "India";
    boolean foundCountry= false;

    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("https://practice-automation.com/tables/");

    while(!foundCountry) {
        List<WebElement> countryListedOnCurrentPage = driver.findElements(By.xpath("//table[@id='tablepress-1']//td[normalize-space()='"+ country + "']"));
        List<WebElement> disabledNextBtn = driver.findElements(noNextBtn);

//        if(countryListedOnCurrentPage.size()>0 ) {
//            foundCountry = true;
//        } else if (disabledNextBtn.size() == 0) {
//            nextBtn.click();
//        } else {
//            return "-1";
//        }

    }

    }
}
