import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.LoginPage;

public class UITest {

    @BeforeMethod
    public void settings (){
        Configuration.browser="chrome";
    }
    @Test
    public void test (){

        Selenide.open("https://gorzdrav.spb.ru");
        Selenide.$(By.xpath("//*[@id=\"header\"]/ul/li[2]/a")).click();

        LoginPage proverka = new LoginPage();

        proverka.sendLogin();
        proverka.sendPassword();
        proverka.clickButton();


    //Selenide.open("https://www.sports.ru");
    //Selenide.$(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div/a")).click();
    //Selenide.$(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[1]/div/form/div[2]/label/input")).setValue("111");
    //Selenide.$(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[1]/div/form/div[3]/label/input")).setValue("111");
    //Selenide.$(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[1]/div/form/div[5]/button")).click();
    //String s =Selenide.$(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div/a")).getText();
    //Selenide.$(By.id("mail")).shouldBe(Condition.visible);


}


}
