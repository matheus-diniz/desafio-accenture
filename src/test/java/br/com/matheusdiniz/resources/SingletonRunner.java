package br.com.matheusdiniz.resources;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SingletonRunner {

    private static WebDriver driver;

    private SingletonRunner(){
    }

    @BeforeAll
    public static synchronized WebDriver getInstance(){
        if (driver == null){
                synchronized (SingletonRunner.class){
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
