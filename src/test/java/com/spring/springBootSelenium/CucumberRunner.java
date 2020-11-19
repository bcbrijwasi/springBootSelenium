package com.spring.springBootSelenium;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(
    features = "classpath:features",
    glue = "com.spring.springBootSelenium.bdd",
    strict = true,
    tags = {},
    plugin = {
            "pretty",
            "html:/Users/bhuwan.brijwasi/Documents/project/springbootcucumber/springBootSelenium/logs/"
        }
)
public class CucumberRunner extends AbstractTestNGCucumberTests {
        @Override
        @DataProvider(parallel = true)
        public Object[][] scenarios() {
                return super.scenarios();
        }
}
