import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String url = "not found";
        for (int i = 300; i < 3000; i++) {
            url = "https://melmont.livejournal.com/photo/album/" + i;
            driver.get(url);
            WebElement element;
           //WebElement element = driver.findElement(By.ByPartialLinkText("Такой страницы нет"));
            try {
                 element = driver.findElement(By.xpath("//*[contains(text(), 'The page was not found')]"));

            }
            catch (Exception err){
                element=null;
            }
            if (element == null) {
                System.out.println("page found " + url);

            }
           // driver.get("https://www.whatismyip.com/my-ip-information/");

        }
        driver.close();




    }


    public void sum(int x, int y) {

    }
}
