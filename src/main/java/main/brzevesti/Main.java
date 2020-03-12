/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.brzevesti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author qa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://bvtest.school.cubes.rs/login");
        
        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys("qa@cubes.rs");
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("cubesqa");
        WebElement loginButton = driver.findElement(By.className("btn-primary"));
        loginButton.click();
        System.out.println(driver.getTitle());
        WebElement signaturesLink = driver.findElement(By.linkText("Signatures"));
        signaturesLink.click();
        System.out.println(driver.getTitle());
        WebElement categoriesLink = driver.findElement(By.partialLinkText("egori"));
        categoriesLink.click();
        System.out.println(driver.getTitle());
        WebElement authenticationLink = driver.findElement(By.className("dropdown-toggle"));
        authenticationLink.click();
        System.out.println(driver.getTitle());
        
        
        
        
        
        // TODO code application logic here
    }
    
}
 