package com.spring.springBootSelenium.page.google;

import com.spring.springBootSelenium.page.Base;
import com.spring.springBootSelenium.kelvin.annotation.PageFragment;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@PageFragment
public class SearchResultComponent extends Base {
    @FindBy(css = "div.rc")
    private List<WebElement> result;

    public int getResultCount(){
        logger.info("Search result count is - "+result.size());
        return result.size();
    }

    @Override
    public boolean isLoaded() {
        return this.webDriverWait.until((driver) -> !this.result.isEmpty());
    }
}
