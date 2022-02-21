import org.openqa.selenium.WebDriver;



public abstract class RelatedWordsAbstract {

    protected static final String URL = "https://relatedwords.org/relatedto/";

    WebDriver driver;


    public RelatedWordsAbstract(WebDriver driver) {
        this.driver = driver;
    }


    protected final int WAIT_TIMEOUT_SECONDS = 10;
}
