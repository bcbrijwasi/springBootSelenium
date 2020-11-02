package com.spring.springBootSelenium.kelvin.service;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

@Lazy
@Service
public class ScreenshotService {

    @Autowired
    private ApplicationContext ctx;

    @Value("${screenshot.path}/img.png")
    private String path;

    public void takeScreenshot() throws IOException {
        File sourceFile = this.ctx.getBean(TakesScreenshot.class).getScreenshotAs(OutputType.FILE);
        String workDir = System.getProperty("user.dir");
        Path destPath = Paths.get(workDir+path);
        FileCopyUtils.copy(sourceFile,destPath.toFile());
    }

}
