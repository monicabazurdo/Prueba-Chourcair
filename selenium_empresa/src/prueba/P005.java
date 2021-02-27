package prueba;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\WebDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");//COMANDO
		WebElement botonLogin = driver.findElement(By.className("login")); //login
		//SubmitCreate
		botonLogin.click();
		driver.findElement(By.name("email")).sendKeys("mbazurdo@uan.edu.co");
		driver.findElement(By.name("passwd")).sendKeys("12345");
		WebElement botonSubmitLogin = driver.findElement(By.id("SubmitLogin")); 
		//SubmitCreate
		botonSubmitLogin.click();
		
		
		Alert alerta = driver.switchTo().alert();
		
		System.out.println(alerta.getText());
	

	}

}
