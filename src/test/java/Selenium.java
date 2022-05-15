import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
    public static void main(String[] args){
        ChromeDriver driver=new ChromeDriver();
        driver.get("http://demo.guru99.com/");
        WebElement element=driver.findElement(By.xpath("//body/form[@name='frmLogin']/table//input[@name='emailid']"));
        element.sendKeys("leobel-1@student.ltu.se");

        WebElement button=driver.findElement(By.xpath("//body/form[@name='frmLogin']/table//input[@name='emailid']"));
        button.click();

    }
}