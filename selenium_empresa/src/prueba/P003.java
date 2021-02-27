package prueba;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\WebDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");//COMANDO
		WebElement botonLogin = driver.findElement(By.className("login")); //login
		//SubmitCreate
		botonLogin.click();
		WebElement botonSubmitcreate = driver.findElement(By.id("SubmitCreate")); //SubmitCreate
		
		botonSubmitcreate.click();
		
		Alert alerta = driver.switchTo().alert();
		
		System.out.println(alerta.getText());
	

	}

}
