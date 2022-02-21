import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;



public class RelatedWordsLogicVariant2 extends RelatedWordsAbstract {

    public RelatedWordsLogicVariant2(WebDriver driver) {
        super(driver);
    }

    private RelatedWordExcelFunctions relatedWordExcelFunctions = new RelatedWordExcelFunctions();

    private WebElement words;

    private List<WebElement> listOfWords;

    private HashMap<String, Integer> mapWordPlusAmountOfCertainLetter = new HashMap<>();

    private int counterLetter = 0;


    //crawler method itself
    public void crawl(String value) {

        //create flexible url according to the given word
        driver.get(URL + value);

        new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT_SECONDS)).until(ExpectedConditions.presenceOfElementLocated(By.className("words")));
        words = driver.findElement(By.className("words"));

        new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT_SECONDS)).until(ExpectedConditions.presenceOfElementLocated(By.tagName("a")));
        listOfWords = words.findElements(By.tagName("a"));
    }


    public void checkIfTheWordContainsParticularLetterAndSpotTheAmount(String letter) {
        for (WebElement iterationsThroughTheWords : listOfWords) {
            char wordToChar [] = new char[iterationsThroughTheWords.getText().length()];
            wordToChar = iterationsThroughTheWords.getText().toCharArray();
            for (int i = 0; i < wordToChar.length; i++) {
                String charElement = String.valueOf(wordToChar[i]);

                if (charElement.equals(letter)) {
                    counterLetter++;
                }
            }
            mapWordPlusAmountOfCertainLetter.put(iterationsThroughTheWords.getText(), counterLetter);
            counterLetter = 0;

        }
    }


    public void createExcelFileWithAllTheInformation () {
        relatedWordExcelFunctions.saveWordPlusAmountOfCertainLetterToExcel(mapWordPlusAmountOfCertainLetter);
    }
}
