import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;



public class RelatedWordsAction{

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        RelatedWordsLogicVariant2 relatedWordsLogicVariant2 = new RelatedWordsLogicVariant2(driver);

        relatedWordsLogicVariant2.crawl("toy");

        relatedWordsLogicVariant2.checkIfTheWordContainsParticularLetterAndSpotTheAmount("a");

        relatedWordsLogicVariant2.createExcelFileWithAllTheInformation();

        driver.quit();
    }
}
