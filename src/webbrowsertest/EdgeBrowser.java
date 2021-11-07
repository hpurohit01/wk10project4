package webbrowsertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {

    public static void main(String[] args) {

        String baseUrl="https://www.barclays.co.uk/";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.getTitle();
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.close();

    }

}
