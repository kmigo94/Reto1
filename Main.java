package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        WebDriver webDriver = new ChromeDriver();
        
        webDriver.get("https://www.google.com");
        
        WebElement inputSearch = webDriver.findElement(By.id("APjFqb"));
        
        inputSearch.clear();
        inputSearch.sendKeys("Selenium Web Driver");
        
        Thread.sleep(3000);
        WebElement btnSearch = webDriver.findElement(By.name("btnK"));
        btnSearch.click();

        Thread.sleep(3000);
        WebElement link1 = webDriver.findElement (By.linkText("Driver Sessions"));
        link1.click();
    
        Thread.sleep(5000);
         WebElement overviewLink = webDriver.findElement(By.id("m-documentationoverview"));
        overviewLink.click();

        Thread.sleep(5000);
        WebElement webdriver = webDriver.findElement(By.id("m-documentationwebdriver"));
        webdriver.click();

        Thread.sleep(5000);
        WebElement driver = webDriver.findElement(By.id("m-documentationwebdriverdrivers"));
        driver.click();
        
        Thread.sleep(5000);
        WebElement webDriverLink = webDriver.findElement(By.id("m-documentationwebdriverdriversoptions"));
        webDriverLink.click();

        Thread.sleep(5000);
        WebElement gettingStartedLink = webDriver.findElement(By.id("m-documentationwebdriverdriversremote_webdriver"));
        gettingStartedLink.click();

        Thread.sleep(5000);
        WebElement organizingLink = webDriver.findElement(By.id("m-documentationwebdriverbrowsers"));
        organizingLink.click();

        
        System.out.println(webDriver.getTitle());
        
        System.out.println("-------------------------");
        
        assert webDriver.getTitle().equals("Selenium Web Driver - Buscar con Google") : "Punto de control 1: El título es diferente al esperado";
        assert webDriver.getCurrentUrl().contains("https://www.selenium.dev/documentation/webdriver/") : "Punto de control 2: La URL no coincide con la esperada";
        assert webDriver.getPageSource().contains("Selenium Web Driver documentation") : "Punto de control 3: La página no contiene el texto esperado";
        assert webDriver.findElement(By.id("m-documentationwebdriverbrowsers")).isDisplayed() : "Punto de control 4: El elemento 'organizingLink' no está visible";
        assert webDriver.findElement(By.linkText("API Docs")).isEnabled() : "Punto de control 5: El enlace 'API Docs' no está habilitado";

        System.out.println("Todos los puntos de control han pasado con éxito");
               
        webDriver.quit();
         }
}