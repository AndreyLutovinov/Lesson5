import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GithubHoverSolutionsTest {

    @BeforeAll
    static void beforAllSetup() {
        Configuration.browserSize = "2560x1440";
        Configuration.pageLoadStrategy = "eager";

    }

    @Test
void hoverSolutionsTest(){
        open("https://github.com");
       $(byTagAndText("button", "Solutions")).hover();
       $(byTagAndText("a", "Enterprises")).click();

       $("#hero-section-brand-heading").shouldHave(text("The AI-powered developer platform"));
    }

    @AfterEach
    void afterEachTest() {
        Selenide.closeWebDriver();
    }


}
