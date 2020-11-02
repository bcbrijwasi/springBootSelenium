package com.spring.springBootSelenium.page.google;

import com.spring.springBootSelenium.kelvin.annotation.Page;
import com.spring.springBootSelenium.page.Base;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@Page
public class GooglePage extends Base {
    @Autowired
    private SearchComponent searchComponent;

    @Autowired
    private SearchResultComponent searchResultComponent;

    @Value("${application.url}")
    private String url;

    public SearchComponent getSearchComponent() {
        return searchComponent;
    }

    public SearchResultComponent getSearchResultComponent() {
        return searchResultComponent;
    }

    public void goTo(){
        logger.info("navigating to - "+url);
        this.driver.get(url);
    }


    @Override
    public boolean isLoaded() {
        return this.searchComponent.isLoaded();

    }

    public void close(){
        this.driver.quit();
    }
}
