import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class Firsttest {
    @Test
    public void myFirstTest(){
        open("https://www.google.com/");
        $(By.name("q")).setValue("test").pressEnter();
        $(By.xpath("//*[@id=\"hdtb-msb\"]/div[1]/div/div[2]/a")).click();
        sleep(10000);


    }
}
