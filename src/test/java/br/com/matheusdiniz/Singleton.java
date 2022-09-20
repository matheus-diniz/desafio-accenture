package br.com.matheusdiniz;

import io.cucumber.java.BeforeAll;

import io.cucumber.junit.platform.engine.Cucumber;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;



public class Singleton {

    private static volatile WebDriver driver;

    private Singleton(){
    }

    @BeforeAll
    public static synchronized WebDriver getInstance(){
        if (driver == null){
                synchronized (Singleton.class){
                    if (driver == null){
                        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
                        driver = new ChromeDriver();
                        driver.manage().window().maximize();
                        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    }
                }
        }
        return driver;
    }



}
