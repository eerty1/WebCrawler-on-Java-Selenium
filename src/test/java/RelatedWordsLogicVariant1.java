import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;



public class RelatedWordsLogicVariant1 extends RelatedWordsAbstract {

    public RelatedWordsLogicVariant1(WebDriver driver) {
        super(driver);
    }

    private WebElement words;

    private List<WebElement> listOfWords;

    private int counterLetter = 0;



    public void crawl(final String VALUE) {
        driver.get(URL + VALUE);
         words = driver.findElement(By.className("words"));
        listOfWords = words.findElements(By.tagName("a"));
    }


    public void checkIfTheWordContainsParticularLetterAndSpotTheAmount(String letter) {
        for (WebElement iterationsThroughTheWords : listOfWords) {
            if (iterationsThroughTheWords.getText().contains(letter)) {
                counterLetter++;
            }
        }
        System.out.println(counterLetter + " words contain the " + letter + " letter");
    }
}
