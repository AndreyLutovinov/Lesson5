import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class GithubHoverSolutionsTest {

    @BeforeAll
    static void beforAllSetup(){
        Configuration.browserSize = "2560x1440";
        Configuration.pageLoadStrategy = "eager";

    }
    @Test
void hoverSolutionsTest(){
        open ("https://github.com");


    }



}
