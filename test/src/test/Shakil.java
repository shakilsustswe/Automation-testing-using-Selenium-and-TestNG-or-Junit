package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Shakil {
	public static void main(String[] args) {
		
		///1.Navigate to the following website https://www.saucedemo.com/
		WebDriver driver = BaseClass.getDriver();
		driver.get("https://www.saucedemo.com/");
		
		///2.Login to the system as "standard_user".
		WebElement userName = driver.findElement(By.id("user-name"));
		userName.click();
		userName.sendKeys("standard_user");
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.click();
		pass.sendKeys("secret_sauce");
		
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
		
		///3.Add the following product to the cart : Sauce Labs Backpack, Sauce Labs Fleece Jacket.
		WebElement add1 = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		add1.click();
		
		WebElement add2 = driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
		add2.click();
		
		
		///4.Go to the "Your Cart" page by clicking on the cart icon on top right corner.
		WebElement icon = driver.findElement(By.className("shopping_cart_link"));
		icon.click();
		
		///5.Checkout to the next page. (CHECKOUT: YOUR INFORMATION)
		WebElement checkout = driver.findElement(By.id("checkout"));
		checkout.click();
		
		
		///6.Fill the form and then click to the Continue button.
		driver.findElement(By.id("first-name")).sendKeys("Ashiqul Hasan");
		driver.findElement(By.id("last-name")).sendKeys("Shakil");
		driver.findElement(By.id("postal-code")).sendKeys("2023");
		
		
		driver.findElement(By.id("continue")).click();
		
		
		///7.Finish the order.
		driver.findElement(By.id("finish")).click();
		
		
	}
}
