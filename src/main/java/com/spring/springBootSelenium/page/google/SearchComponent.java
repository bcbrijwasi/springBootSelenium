package com.spring.springBootSelenium.page.google;

import com.spring.springBootSelenium.kelvin.annotation.PageFragment;
import com.spring.springBootSelenium.page.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@PageFragment
public class SearchComponent extends Base {

    @FindBy(name = "q")
    private WebElement searchBox;

    @FindBy(name = "btnK")
    private List<WebElement> searchBtns;

    public void search(String keyword){
        logger.info("Searching for keyword - "+keyword);
        this.searchBox.sendKeys(keyword);
        this.searchBox.sendKeys(Keys.TAB);
        this.searchBtns
                .stream()
                .filter(e -> e.isDisplayed() && e.isEnabled())
                .findFirst()
                .ifPresent(WebElement::click);
    }

    @Override
    public boolean isLoaded() {
        logger.info("Waiting for page to load");
        return this.webDriverWait.until((driver) -> this.searchBox.isDisplayed());
    }
}
