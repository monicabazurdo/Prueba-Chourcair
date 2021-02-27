package prueba;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\WebDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");//COMANDO
		WebElement botonLogin = driver.findElement(By.className("login")); //login
		//SubmitCreate
		botonLogin.click();
		driver.findElement(By.name("email_create")).sendKeys("monica@gmail.co");
		WebElement botonSubmitcreate = driver.findElement(By.id("SubmitCreate")); //SubmitCreate
		botonSubmitcreate.click();
		
		WebElement botonRegister = driver.findElement(By.id("submitAccount")); //authentication
		botonRegister.click();
		
		WebElement botonR = driver.findElement(By.className("btn btn-default button button-medium")); //authentication
		botonR.click();
		
		Alert alerta = driver.switchTo().alert();
		
		System.out.println(alerta.getText());
	

	}

}
