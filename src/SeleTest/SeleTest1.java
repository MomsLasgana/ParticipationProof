package SeleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SeleTest1 {
	
Webdriver driver;

String name = "webdriver.gecko.driver";
String path = "/Users/bananaman/Downloads/geckodriver";
String url;

public void firefox_d(String input_url) {
	System.setProperty(name, path);
	driver = new FireFoxDriver();
	url=input_url;
	
}


}
