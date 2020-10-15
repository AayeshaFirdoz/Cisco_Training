package userdef;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	String url ="https://www.google.com/";
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\aayeshafirdoz.f\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
	  WebDriver driver=new ChromeDriver();
	  driver.get(url);
	  driver.close();
  }
}
